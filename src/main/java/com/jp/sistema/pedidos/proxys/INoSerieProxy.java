package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.noserie.NoSerie;

public interface INoSerieProxy {
	ResponseEntity<NoSerie> getNoSerie() throws IOException;
}
