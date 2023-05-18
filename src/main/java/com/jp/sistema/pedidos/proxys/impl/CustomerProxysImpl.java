package com.jp.sistema.pedidos.proxys.impl;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.jp.sistema.pedidos.model.entity.customer.Customer;
import com.jp.sistema.pedidos.proxys.ICustomerProxys;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerProxysImpl implements ICustomerProxys{
	
	private Gson gson = new Gson();
	
	@Autowired
	private CloseableHttpClient httpClient;

	@Override
	public ResponseEntity<Customer> getCustomers() throws IOException {
		HttpGet request = new HttpGet("http://20.55.200.64:8048/DynamicsNAV110/ODataV4/Company('Laboratorio%20Pharmalat%2C%20S.A.')/Clientes");
		HttpResponse response = httpClient.execute(request);
		String entity = EntityUtils.toString(response.getEntity());
		String newEntity = entity.replaceAll("@odata.","");
		Customer customer = gson.fromJson(newEntity, Customer.class);
		return ResponseEntity.ok(customer);
	}

}
