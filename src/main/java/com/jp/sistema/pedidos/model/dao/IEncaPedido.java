package com.jp.sistema.pedidos.model.dao;

import java.util.List;

import com.jp.sistema.pedidos.model.entity.EncaPedido;

public interface IEncaPedido {
	public Integer save(EncaPedido encabezado);
	public List<EncaPedido> findAll();
}
