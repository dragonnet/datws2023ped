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
import com.jp.sistema.pedidos.model.entity.NoSerieLinesNew;
import com.jp.sistema.pedidos.model.entity.NoSeries;
import com.jp.sistema.pedidos.model.entity.NoSeriesLines;
import com.jp.sistema.pedidos.model.entity.Pedidos;
import com.jp.sistema.pedidos.model.entity.SalesPerson;
import com.jp.sistema.pedidos.model.entity.SalesPersonNew;
import com.jp.sistema.pedidos.model.entity.customer.Value;
import com.jp.sistema.pedidos.model.entity.noserie.NoSerie;
import com.jp.sistema.pedidos.model.entity.products.Products;
import com.jp.sistema.pedidos.model.entity.usuarios.Usuarios;
import com.jp.sistema.pedidos.proxys.ICustomerProxy;
import com.jp.sistema.pedidos.proxys.INoSerieProxy;
import com.jp.sistema.pedidos.proxys.IProductProxy;
import com.jp.sistema.pedidos.proxys.ISalesPersonProxy;
import com.jp.sistema.pedidos.proxys.IUsuariosProxy;

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
	private INoSerieProxy noSerieProxy;
	
	@Autowired
	private IUsuariosProxy usuariosProxy;
	
	@Autowired
	private ISalesPersonProxy salesPersonProxy;
	
	private List<Pedidos> listPedidos =new ArrayList<>();
	
	private List<CustomerNew> listCustomerNew = new ArrayList<CustomerNew>();
	private List<ItemNew> listItemNew = new ArrayList<ItemNew>();
	private List<SalesPersonNew> listSalesPersonNew = new ArrayList<SalesPersonNew>();
	private List<NoSerieLinesNew> listNoSeriesLinesNew = new ArrayList<NoSerieLinesNew>();
	private List<Usuarios> listUsuarios = new ArrayList<Usuarios>();

	@GetMapping(value = "/main/{idusuario}")
	public String main(@PathVariable("idusuario") String idUsuario, Model model) {

		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);
		model.addAttribute("titulo", "");
		model.addAttribute("customers", listCustomerNew);
		return "main";
	}
	
	@PostMapping(value = "/main")
	public String postMain(@ModelAttribute Access access, Model model, RedirectAttributes flash) {
		String personName = searchPerson(listSalesPersonNew, access.getPassword());
		if(personName != null) {
			model.addAttribute("idusuario", personName);
			model.addAttribute("usuario", personName);
			model.addAttribute("titulo", "");
			model.addAttribute("customers", listCustomerNew);
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
		listUsuarios.clear();
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
		
		ResponseEntity<Usuarios> getUsuarios = null;
		try {
			getUsuarios = usuariosProxy.getUsuarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ResponseEntity<NoSerie> getNoSerie = null;
		try {
			getNoSerie = noSerieProxy.getNoSerie();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
		
		//"PHARMALAT\\AGIRON"
		
		if(getUsuarios != null) {
			for(com.jp.sistema.pedidos.model.entity.usuarios.Value value : getUsuarios.getBody().getValue()) {
				String access = value.getUser_ID();
				String[] partes = access.split("\\\\");
				SalesPersonNew person = new SalesPersonNew();
				person.setCode(partes[1]);
				person.setName(partes[1]);
				listSalesPersonNew.add(person);
			}
		}
		
		if(getNoSerie != null) {
			for(com.jp.sistema.pedidos.model.entity.noserie.Value value : getNoSerie.getBody().getValue()) {
				NoSerieLinesNew noSerie = new NoSerieLinesNew();
				noSerie.setLastNoUsed(value.getLast_No_Used());
				noSerie.setSeriesCode(value.getSeries_Code());
				listNoSeriesLinesNew.add(noSerie);
			}
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
		return "access";
	}
	
	@GetMapping(value="/pedido/{customerid}/{idusuario}")
	public String pedido(@PathVariable("customerid") String customerId, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		listPedidos.clear();
		ItemNew newItem = listItemNew.get(11);
		
		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);

		NoSerieLinesNew noSeriesLine = searchNoSerie(listNoSeriesLinesNew, "PROV-PV");
		String ultimonumero = noSeriesLine.getLastNoUsed().trim().replace("PV", "");
		
		Integer correlativo = Integer.parseInt(ultimonumero);
		
		noSeriesLineDao.updateLastNoUsed(String.valueOf(correlativo+1));
						
		Pedidos pedido = new Pedidos(newItem.getNo().trim(),newItem.getDescription().trim(),0.0,0, customerId, String.valueOf(correlativo+1));
		
		model.addAttribute("pedido", pedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", searchCustomer(listCustomerNew, customerId));
		model.addAttribute("nopedido", correlativo+1);
		return "pedido";
	}
	
	private NoSerieLinesNew searchNoSerie(List<NoSerieLinesNew> listNoSeries, String seriesCode) {
		for (NoSerieLinesNew noSerie: listNoSeries) {
			if(noSerie.getSeriesCode().equals(seriesCode))
				return noSerie;
		}
		return null;
	}

	private CustomerNew searchCustomer(List<CustomerNew> listCustomer, String customerId) {
		for (CustomerNew customer : listCustomer) {
			if(customer.getNo().equals(customerId))
				return customer;
		}
		return null;
	}

	@GetMapping(value="/pedido/{customerid}/{nopedido}/{item}/{idusuario}")
	public String pedido(@PathVariable("customerid") String customerId, 
			@PathVariable("nopedido") String noPedido,
			@PathVariable("item") String item, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		
		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);
		
		ItemNew newItem = searchItem(listItemNew, item);
		
		Pedidos pedido = new Pedidos(newItem.getNo().trim(),newItem.getDescription().trim(),0.0,0, customerId, String.valueOf(noPedido));
		
		model.addAttribute("pedido", pedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", searchCustomer(listCustomerNew, customerId));
		model.addAttribute("nopedido", noPedido.trim());
		return "pedido";
	}
	
	private ItemNew searchItem(List<ItemNew> listItem, String item) {
		for (ItemNew itemNew : listItem) {
			if(itemNew.getNo().equals(item))
				return itemNew;
		}
		return null;
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
		
		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);
		
		model.addAttribute("titulo", "");
		model.addAttribute("items", listItemNew);
		return "items";
	}	
	
	@GetMapping(value = "/salesperson/{idusuario}")
	public String salesPersons(@PathVariable("idusuario") String idUsuario, Model model) {
		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);
		model.addAttribute("titulo", "");
		model.addAttribute("people", listSalesPersonNew);
		return "salesperson";
	}
	
	@GetMapping(value = "/loaditems/{customerid}/{nopedido}/{idusuario}")
	public String loadItems(@PathVariable("customerid") String customerId, 
			@PathVariable("nopedido") String noPedido, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);
		model.addAttribute("customerid", customerId.trim());
		model.addAttribute("nopedido", noPedido.trim());
		model.addAttribute("titulo", "");
		model.addAttribute("items", listItemNew);
		return "loaditem";
	}
	
	@PostMapping(value ="/additem/{idusuario}")
	public String addItem(@ModelAttribute Pedidos pedido, 
			@PathVariable("idusuario") String idUsuario,
			Model model) {
		
		String personName = searchPerson(listSalesPersonNew, idUsuario);
		model.addAttribute("idusuario", personName);
		model.addAttribute("usuario", personName);
		listPedidos.add(pedido);
		
		double total = 0.0;
		for (Pedidos pedidos : listPedidos) {
			total = total + pedidos.getCantidad();
		}
		
		model.addAttribute("pedido", pedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", searchCustomer(listCustomerNew, pedido.getCustomerid()));
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
			String personName = searchPerson(listSalesPersonNew, idUsuario);
			model.addAttribute("idusuario", personName);
			model.addAttribute("usuario", personName);
			Pedidos pedido = new Pedidos(codigo.trim(),descripcion,0.0,Integer.parseInt(cantidad), customerId.trim(), noPedido);
			listPedidos.remove(pedido);
		}

		double total = 0.0;
		for (Pedidos pedidos : listPedidos) {
			total = total + pedidos.getCantidad();
		}
		
		ItemNew newItem = listItemNew.get(11);
		Pedidos newPedido = new Pedidos(newItem.getNo().trim(),newItem.getDescription().trim(),0.0,0, customerId, noPedido);
		model.addAttribute("pedido", newPedido);
		model.addAttribute("pedidos", listPedidos);
		model.addAttribute("customer", searchCustomer(listCustomerNew, customerId));
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
			String personName = searchPerson(listSalesPersonNew, idUsuario);
			model.addAttribute("idusuario", personName);
			model.addAttribute("usuario", personName);
			model.addAttribute("customer", customerDao.findOne(customerId));
			flash.addFlashAttribute("success", "Pedido Registrado en el Sistema, con número: " + registro.toString());
		}
		return "redirect:/main/"+idUsuario;
	}
	
	private String searchPerson(List<SalesPersonNew> listPerson, String name) {
		for (SalesPersonNew person : listPerson) {
			if(person.getName().equals(name)) {
				return person.getName();
			}
		}
		return null;
	}
	
	
}
