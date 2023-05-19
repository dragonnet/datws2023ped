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
import com.jp.sistema.pedidos.model.entity.salesperson.SalesPerson;
import com.jp.sistema.pedidos.proxys.ISalesPersonProxy;

@Service
public class SalesPersonProxyImpl implements ISalesPersonProxy {

	private Gson gson = new Gson();
	
	@Autowired
	private CloseableHttpClient httpClient;
	
	@Override
	public ResponseEntity<SalesPerson> getSalesPerson() throws IOException {
		HttpGet request = new HttpGet("http://20.55.200.64:8048/DynamicsNAV110/ODataV4/Company('Laboratorio%20Pharmalat%2C%20S.A.')/Vendedores");
		
		HttpResponse response = httpClient.execute(request);
		String entity = EntityUtils.toString(response.getEntity());
		String newEntity = entity.replaceAll("@odata.","");
		SalesPerson salesPerson = gson.fromJson(newEntity, SalesPerson.class);
		return ResponseEntity.ok(salesPerson);
	}

}
