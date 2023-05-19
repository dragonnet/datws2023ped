package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.salesperson.SalesPerson;

public interface ISalesPersonProxy {
	ResponseEntity<SalesPerson> getSalesPerson() throws IOException;
}
