package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.products.Products;

public interface IProductProxy {
	ResponseEntity<Products> getProducts() throws IOException;
}
