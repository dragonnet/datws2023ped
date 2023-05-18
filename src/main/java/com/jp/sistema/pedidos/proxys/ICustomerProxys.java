package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.customer.Customer;

public interface ICustomerProxys {
	ResponseEntity<Customer> getCustomers() throws IOException;
}
