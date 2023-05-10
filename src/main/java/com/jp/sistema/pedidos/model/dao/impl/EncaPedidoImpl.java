package com.jp.sistema.pedidos.model.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jp.sistema.pedidos.model.dao.IEncaPedido;
import com.jp.sistema.pedidos.model.entity.EncaPedido;

@Repository
@Transactional
public class EncaPedidoImpl implements IEncaPedido {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Integer save(EncaPedido encabezado) {
		try {
			em.persist(encabezado);
			return encabezado.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
