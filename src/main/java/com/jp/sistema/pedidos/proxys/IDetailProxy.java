package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.detail.Detail;
import com.jp.sistema.pedidos.model.entity.detail.Detalle;

public interface IDetailProxy {
	ResponseEntity<Detail> save(Detalle detalle) throws IOException;
}
