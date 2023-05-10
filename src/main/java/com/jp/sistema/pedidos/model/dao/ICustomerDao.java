package com.jp.sistema.pedidos.model.dao;

import java.util.List;

import com.jp.sistema.pedidos.model.entity.Customer;

public interface ICustomerDao {
	public List<Customer> findAll();
	
	public Customer findOne(String id);
}
