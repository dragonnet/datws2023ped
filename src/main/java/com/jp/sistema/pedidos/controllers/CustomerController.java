package com.jp.sistema.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.sistema.pedidos.model.dao.ICustomerDao;
import com.jp.sistema.pedidos.model.dao.IEncaPedido;
import com.jp.sistema.pedidos.model.dao.IItemDao;
import com.jp.sistema.pedidos.model.dao.ISalesPerson;
import com.jp.sistema.pedidos.model.entity.Customer;
import com.jp.sistema.pedidos.model.entity.EncaPedido;
import com.jp.sistema.pedidos.model.entity.Item;
import com.jp.sistema.pedidos.model.entity.SalesPerson;

@RestController
public class CustomerController {
	
	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private IItemDao itemDao;
	
	@Autowired
	private ISalesPerson salesPersonDao;
	
	@Autowired
	private IEncaPedido encaPedidoDao;

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
	
}
