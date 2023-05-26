package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.header.Encabezado;
import com.jp.sistema.pedidos.model.entity.header.Header;


public interface IHeaderProxy {
	ResponseEntity<Header> save(Encabezado encabezado) throws IOException;
}
