package com.jp.sistema.pedidos.model.dao;

import java.util.List;

import com.jp.sistema.pedidos.model.entity.SalesPerson;

public interface ISalesPerson {
	public List<SalesPerson> findAll();
	public SalesPerson findByOne(String code, String clave);
	public SalesPerson searchByOne(String code);
}
