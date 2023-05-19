package com.jp.sistema.pedidos.proxys.impl;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.jp.sistema.pedidos.model.entity.products.Products;
import com.jp.sistema.pedidos.proxys.IProductProxy;

@Service
public class ProductProxysImpl implements IProductProxy {
	
	private Gson gson = new Gson();
	
	@Autowired
	private CloseableHttpClient httpClient;

	@Override
	public ResponseEntity<Products> getProducts() throws IOException {
		HttpGet request = new HttpGet("http://20.55.200.64:8048/DynamicsNAV110/ODataV4/Company('Laboratorio%20Pharmalat%2C%20S.A.')/Productos");
		request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
		
		HttpResponse response = httpClient.execute(request);
		String entity = EntityUtils.toString(response.getEntity());
		String newEntity = entity.replaceAll("@odata.","");
		Products product = gson.fromJson(newEntity, Products.class);
		return ResponseEntity.ok(product);
	}

}
