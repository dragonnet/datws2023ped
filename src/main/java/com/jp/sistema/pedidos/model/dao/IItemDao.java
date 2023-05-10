package com.jp.sistema.pedidos.model.dao;

import java.util.List;

import com.jp.sistema.pedidos.model.entity.Item;

public interface IItemDao {
	public List<Item> findAll();
	public Item findByOne(String id);
}
