package com.jp.sistema.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.sistema.pedidos.model.dao.ICustomerDao;
import com.jp.sistema.pedidos.model.dao.IDetaPedido;
import com.jp.sistema.pedidos.model.dao.IEncaPedido;
import com.jp.sistema.pedidos.model.dao.IItemDao;
import com.jp.sistema.pedidos.model.dao.INoSeriesLine;
import com.jp.sistema.pedidos.model.dao.ISalesPerson;
import com.jp.sistema.pedidos.model.entity.Customer;
import com.jp.sistema.pedidos.model.entity.EncaPedido;
import com.jp.sistema.pedidos.model.entity.Item;
import com.jp.sistema.pedidos.model.entity.SalesPerson;
import com.jp.sistema.pedidos.proxys.ICustomerProxy;
import com.jp.sistema.pedidos.proxys.IHeaderProxy;
import com.jp.sistema.pedidos.proxys.INoSerieProxy;
import com.jp.sistema.pedidos.proxys.IProductProxy;
import com.jp.sistema.pedidos.proxys.ISalesPersonProxy;
import com.jp.sistema.pedidos.proxys.ISystemProxy;
import com.jp.sistema.pedidos.proxys.IUsuariosProxy;

@RestController
@RequestMapping("/system")
public class CustomerController {
	
	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private IItemDao itemDao;
	
	@Autowired
	private ISalesPerson salesPersonDao;
	
	@Autowired
	private IEncaPedido encaPedidoDao;
	
	@Autowired
	private ISystemProxy systemProxy;
	

	@GetMapping(value = "/listCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> listCustomer() {
		return customerDao.findAll();
	}
	
	@GetMapping(value = "/listItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> listItem() {
		return itemDao.findAll();
	}
	
	@GetMapping(value = "/listSalesPerson", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SalesPerson> listSalesPerson() {
		return salesPersonDao.findAll();
	}
	
	@GetMapping(value = "/listHeader", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EncaPedido> listHeader() {
		return encaPedidoDao.findAll();
	}
	
	@PostMapping(value = "/setdatabase", produces = MediaType.TEXT_PLAIN_VALUE)
	public String setDataBase() {
		return systemProxy.setDataBase();
	}
	
}
