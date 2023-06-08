package com.jp.sistema.pedidos.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jp.sistema.pedidos.model.dao.ICustomerDao;
import com.jp.sistema.pedidos.model.dao.IDetaPedido;
import com.jp.sistema.pedidos.model.dao.IEncaPedido;
import com.jp.sistema.pedidos.model.dao.IItemDao;
import com.jp.sistema.pedidos.model.dao.INoSeriesLine;
import com.jp.sistema.pedidos.model.dao.ISalesPerson;
import com.jp.sistema.pedidos.model.entity.Access;
import com.jp.sistema.pedidos.model.entity.Customer;
import com.jp.sistema.pedidos.model.entity.CustomerNew;
import com.jp.sistema.pedidos.model.entity.DetaPedido;
import com.jp.sistema.pedidos.model.entity.EncaPedido;
import com.jp.sistema.pedidos.model.entity.Item;
import com.jp.sistema.pedidos.model.entity.ItemNew;
import com.jp.sistema.pedidos.model.entity.NoSeries;
import com.jp.sistema.pedidos.model.entity.NoSeriesLines;
import com.jp.sistema.pedidos.model.entity.Pedidos;
import com.jp.sistema.pedidos.model.entity.SalesPerson;
import com.jp.sistema.pedidos.model.entity.SalesPersonNew;
import com.jp.sistema.pedidos.model.entity.customer.Value;
import com.jp.sistema.pedidos.model.entity.products.Products;
import com.jp.sistema.pedidos.proxys.ICustomerProxy;
import com.jp.sistema.pedidos.proxys.IProductProxy;
import com.jp.sistema.pedidos.proxys.ISalesPersonProxy;
import com.jp.sistema.pedidos.proxys.ISystemProxy;

@Controller
public class MainController {
	
	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private IItemDao itemDao;
	
	@Autowired
	private ISalesPerson salesPersonDao;
	
	@Autowired
	private INoSeriesLine noSeriesLineDao;
	
	@Autowired
	private IEncaPedido encabezadoDao;
	
	@Autowired
	private IDetaPedido detalleDao;
	
	@Autowired
	private ICustomerProxy customerProxy;
	
	@Autowired
	private IProductProxy productProxy;
	
	@Autowired
	private ISalesPersonProxy salesPersonProxy;
	
	@Autowired
	private ISystemProxy systemProxy;
	
	private List<Pedidos> listPedidos =new ArrayList<>();
	
	private List<CustomerNew> listCustomerNew = new ArrayList<CustomerNew>();
	private List<ItemNew> listItemNew = new ArrayList<ItemNew>();
	private List<SalesPersonNew> listSalesPersonNew = new ArrayList<SalesPersonNew>();

	@GetMapping(value = "/main/{idusuario}")
	public String main(@PathVariable("idusuario") String idUsuario, Model model) {

		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());
		model.addAttribute("titulo", "");
		model.addAttribute("customers", customerDao.findAll());
		return "main";
	}
	
	@PostMapping(value = "/main")
	public String postMain(@ModelAttribute Access access, Model model, RedirectAttributes flash) {
		SalesPerson person = salesPersonDao.findByOne(access.getUsername(), access.getPassword());
		if(person != null && person.getCode().trim().equals(access.getUsername())) {
			model.addAttribute("idusuario", person.getCode().trim());
			model.addAttribute("usuario", person.getName().trim());
			model.addAttribute("titulo", "");
			model.addAttribute("customers", customerDao.findAll());
			return "main";
		}else {
			flash.addFlashAttribute("error", "No es posible validar su acceso, por favor vuela a intentarlo.");
			return "redirect:/";
		}
	}
	
	@GetMapping(value = {"/index", "/"})
	public String access(Model model) {
		listCustomerNew.clear();
		listSalesPersonNew.clear();
		ResponseEntity<com.jp.sistema.pedidos.model.entity.customer.Customer> getCustomer = null;
		try {
			getCustomer = customerProxy.getCustomers();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ResponseEntity<com.jp.sistema.pedidos.model.entity.salesperson.SalesPerson> getSalesPerson = null;
		try {
			getSalesPerson = salesPersonProxy.getSalesPerson();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(getCustomer != null) {
			for (Value value : getCustomer.getBody().getValue()) {
				CustomerNew customer = new CustomerNew();
				customer.setNo(value.getNo());
				customer.setName(value.getName());
				customer.setCity(value.getCity());
				customer.setTimestamp(value.getIdentif1());
				listCustomerNew.add(customer);
			}
		}
		
		Access access = new Access();
		model.addAttribute("access", access);
		model.addAttribute("titulo", "");
		systemProxy.setDataBase();//Please debug this line and validate the data in database. And run once time and comment this line.
		return "access";
	}
	
	@GetMapping(value="/pedido/{customerid}/{idusuario}")
	public String pedido(@PathVariable("customerid") String customerId, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		listPedidos.clear();
		Item newItem = itemDao.findByOne("PT00001");
		
		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());

		NoSeriesLines noSeriesLine = noSeriesLineDao.findByOne("V-PED-3");
		String ultimonumero = noSeriesLine.getLastNoUsed().trim().replace("PV", "");
		
		Integer correlativo = Integer.parseInt(ultimonumero);
		
		noSeriesLineDao.updateLastNoUsed(String.valueOf(correlativo+1));
						
		Pedidos pedido = new Pedidos(newItem.getNo().trim(),newItem.getDescription().trim(),0.0,0, customerId, String.valueOf(correlativo+1));
		
		model.addAttribute("pedido", pedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", customerDao.findOne(customerId));
		model.addAttribute("nopedido", correlativo+1);
		return "pedido";
	}
	
	@GetMapping(value="/pedido/{customerid}/{nopedido}/{item}/{idusuario}")
	public String pedido(@PathVariable("customerid") String customerId, 
			@PathVariable("nopedido") String noPedido,
			@PathVariable("item") String item, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		
		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());
		
		Item newItem = itemDao.findByOne(item);
		
		Pedidos pedido = new Pedidos(newItem.getNo().trim(),newItem.getDescription().trim(),0.0,0, customerId, String.valueOf(noPedido));
		
		model.addAttribute("pedido", pedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", customerDao.findOne(customerId));
		model.addAttribute("nopedido", noPedido.trim());
		return "pedido";
	}
	
	@GetMapping(value = "/items/{idusuario}")
	public String items(@PathVariable("idusuario") String idUsuario, Model model) {
		listItemNew.clear();
		ResponseEntity<Products> getProducts = null;
		try {
			getProducts = productProxy.getProducts();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(getProducts != null) {
			for (com.jp.sistema.pedidos.model.entity.products.Value value : getProducts.getBody().getValue()) {
				ItemNew item = new ItemNew();
				item.setNo(value.getNo());
				item.setDescription(value.getDescription());
				listItemNew.add(item);
			}
		}
		
		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());
		
		model.addAttribute("titulo", "");
		model.addAttribute("items", listItemNew);
		return "items";
	}	
	
	@GetMapping(value = "/salesperson/{idusuario}")
	public String salesPersons(@PathVariable("idusuario") String idUsuario, Model model) {
		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());
		model.addAttribute("titulo", "");
		model.addAttribute("people", salesPersonDao.findAll());
		return "salesperson";
	}
	
	@GetMapping(value = "/loaditems/{customerid}/{nopedido}/{idusuario}")
	public String loadItems(@PathVariable("customerid") String customerId, 
			@PathVariable("nopedido") String noPedido, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());
		model.addAttribute("customerid", customerId.trim());
		model.addAttribute("nopedido", noPedido.trim());
		model.addAttribute("titulo", "");
		model.addAttribute("items", itemDao.findAll());
		return "loaditem";
	}
	
	@PostMapping(value ="/additem/{idusuario}")
	public String addItem(@ModelAttribute Pedidos pedido, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		
		SalesPerson person = salesPersonDao.searchByOne(idUsuario);
		model.addAttribute("idusuario", person.getCode().trim());
		model.addAttribute("usuario", person.getName().trim());
		listPedidos.add(pedido);
		
		double total = 0.0;
		for (Pedidos pedidos : listPedidos) {
			total = total + pedidos.getCantidad();
		}
		
		model.addAttribute("pedido", pedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", customerDao.findOne(pedido.getCustomerid()));
		model.addAttribute("nopedido", pedido.getNopedido().trim());
		model.addAttribute("total", total);
		return "pedido";
	}
	
	@GetMapping(value="/delete/{customerid}/{nopedido}/{codigo}/{descripcion}/{cantidad}/{idusuario}")
	public String deleteItem(@PathVariable("customerid") String customerId, 
			@PathVariable("nopedido") String noPedido, 
			@PathVariable("codigo") String codigo, 
			@PathVariable("descripcion") String descripcion,
			@PathVariable("cantidad") String cantidad,
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		
		if(!idUsuario.contains(".js") && !idUsuario.contains(".png") && !idUsuario.contains(".jpg")) {
			SalesPerson person = salesPersonDao.searchByOne(idUsuario);
			model.addAttribute("idusuario", person.getCode().trim());
			model.addAttribute("usuario", person.getName().trim());
			Pedidos pedido = new Pedidos(codigo.trim(),descripcion,0.0,Integer.parseInt(cantidad), customerId.trim(), noPedido);
			listPedidos.remove(pedido);
		}

		double total = 0.0;
		for (Pedidos pedidos : listPedidos) {
			total = total + pedidos.getCantidad();
		}
		
		Item newItem = itemDao.findByOne("PT00001");
		Pedidos newPedido = new Pedidos(newItem.getNo().trim(),newItem.getDescription().trim(),0.0,0, customerId, noPedido);
		model.addAttribute("pedido", newPedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", customerDao.findOne(customerId));
		model.addAttribute("nopedido", noPedido.trim());
		model.addAttribute("total", total);
		return "pedido";
	}
	
	@GetMapping(value="/save/{customerid}/{nopedido}/{codigo}/{descripcion}/{cantidad}/{idusuario}")
	public String savePedido(@PathVariable("customerid") String customerId, 
			@PathVariable("nopedido") String noPedido, 
			@PathVariable("codigo") String codigo, 
			@PathVariable("descripcion") String descripcion,
			@PathVariable("cantidad") String cantidad,
			@PathVariable("idusuario") String idUsuario,
			Model model,
			RedirectAttributes flash) {
		
		if(!idUsuario.contains(".js") && !idUsuario.contains(".png") && !idUsuario.contains(".jpg")) {
			EncaPedido encabezado = new EncaPedido();
			encabezado.setNumeroPedido(noPedido);
			encabezado.setCliente(customerId);
			encabezado.setVendedor(idUsuario);
			
			Integer registro = encabezadoDao.save(encabezado);
			
			if(registro != null) {
				Integer i = 0;
				for (Pedidos pedidos : listPedidos) {
					i++;
					DetaPedido detalle = new DetaPedido();
					detalle.setLinea(i.toString());
					detalle.setNumeroPedido(registro.toString());
					detalle.setCodigoProducto(pedidos.getCodigo());
					detalle.setNombreProducto(pedidos.getDescripcion());
					detalle.setCantidad(Integer.parseInt(pedidos.getCantidad().toString()));
					detalleDao.save(detalle);
				}
			}
			SalesPerson person = salesPersonDao.searchByOne(idUsuario);
			model.addAttribute("idusuario", person.getCode().trim());
			model.addAttribute("usuario", person.getName().trim());
			model.addAttribute("customer", customerDao.findOne(customerId));
			flash.addFlashAttribute("success", "Pedido Registrado en el Sistema, con número: " + registro.toString());
		}
		return "redirect:/main/"+idUsuario;
	}
	
	
}
