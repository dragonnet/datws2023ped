package com.jp.sistema.pedidos.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sistema.pedidos.model.dao.ISalesPerson;
import com.jp.sistema.pedidos.model.entity.SalesPerson;


@Repository
public class SalesPersonImpl implements ISalesPerson {
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<SalesPerson> findAll() {
		return em.createQuery("from SalesPerson").getResultList();
	}

	@Override
	public SalesPerson findByOne(String code, String clave) {
		try {
			TypedQuery<SalesPerson> query = em.createQuery(
					  "SELECT e FROM SalesPerson e WHERE e.code = ?1 and e.clave = ?2", SalesPerson.class);
			query.setParameter(1, code);
			query.setParameter(2, clave);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public SalesPerson searchByOne(String code) {
		try {
			TypedQuery<SalesPerson> query = em.createQuery(
					  "SELECT e FROM SalesPerson e WHERE e.code = ?1", SalesPerson.class);
			query.setParameter(1, code);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
}
