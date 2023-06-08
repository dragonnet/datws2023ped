package com.jp.sistema.pedidos.proxys.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jp.sistema.pedidos.model.dao.ICustomerDao;
import com.jp.sistema.pedidos.model.dao.IItemDao;
import com.jp.sistema.pedidos.model.dao.ISalesPerson;
import com.jp.sistema.pedidos.model.entity.Item;
import com.jp.sistema.pedidos.model.entity.SalesPerson;
import com.jp.sistema.pedidos.model.entity.customer.Customer;
import com.jp.sistema.pedidos.model.entity.customer.Value;
import com.jp.sistema.pedidos.model.entity.products.Products;
import com.jp.sistema.pedidos.proxys.ICustomerProxy;
import com.jp.sistema.pedidos.proxys.IProductProxy;
import com.jp.sistema.pedidos.proxys.ISalesPersonProxy;
import com.jp.sistema.pedidos.proxys.ISystemProxy;

@Service
public class SystemProxyImpl implements ISystemProxy {
	
	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private IItemDao itemDao;
	
	@Autowired
	private ISalesPerson salesPersonDao;
	
	@Autowired
	private ICustomerProxy customerProxy;
	
	@Autowired
	private IProductProxy productProxy;
	
	@Autowired
	private ISalesPersonProxy salesPersonProxy;

	@Override
	public String setDataBase() {
		try {
			setCustomer();
			setProduct();
			setSalesPerson();
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error: " + e.toString();
		}
	}

	private void setSalesPerson() {
		try {
			ResponseEntity<com.jp.sistema.pedidos.model.entity.salesperson.SalesPerson> listSalesPerson = salesPersonProxy.getSalesPerson();
			for (com.jp.sistema.pedidos.model.entity.salesperson.Value elementSalesPersona : listSalesPerson.getBody().getValue()) {
				SalesPerson salesPerson = new SalesPerson();
				salesPerson.setCode(elementSalesPersona.getCode());
				salesPerson.setName(elementSalesPersona.getName());
				salesPerson.setCliente(elementSalesPersona.getSalesperson_Supervisor());
				salesPersonDao.save(salesPerson);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void setProduct() {
		try {
			ResponseEntity<Products> listProducts = productProxy.getProducts();
			for (com.jp.sistema.pedidos.model.entity.products.Value elementProduct : listProducts.getBody().getValue()) {
				Item item = new Item();
				item.setNo(elementProduct.getNo());
				item.setDescription(elementProduct.getDescription());
				item.setType(Integer.parseInt(elementProduct.getType()));
				itemDao.save(item);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void setCustomer() {
		try {
			ResponseEntity<Customer> listCustomer = customerProxy.getCustomers();
			for (Value element : listCustomer.getBody().getValue()) {
				com.jp.sistema.pedidos.model.entity.Customer customer = new com.jp.sistema.pedidos.model.entity.Customer();
				customer.setNo(element.getNo());
				customer.setName(element.getName());
				customer.setAddress(element.getAddress());
				customer.setCity(element.getCity());
				customer.setContact(element.getContact());
				customerDao.save(customer);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
