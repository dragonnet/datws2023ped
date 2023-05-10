package com.jp.sistema.pedidos.model.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.UnexpectedRollbackException;

import com.jp.sistema.pedidos.model.dao.IDetaPedido;
import com.jp.sistema.pedidos.model.entity.DetaPedido;

@Repository
@Transactional
public class DetaPedidoImpl implements IDetaPedido {
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean save(DetaPedido detalle) {
		try {
			em.persist(detalle);
			return true;
		} catch (UnexpectedRollbackException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
}
