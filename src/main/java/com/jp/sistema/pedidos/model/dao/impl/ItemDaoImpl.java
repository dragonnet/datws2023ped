package com.jp.sistema.pedidos.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sistema.pedidos.model.dao.IItemDao;
import com.jp.sistema.pedidos.model.entity.Item;

@Repository
public class ItemDaoImpl implements IItemDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Item> findAll() {
		return em.createQuery("from Item").getResultList();
	}

	@Override
	public Item findByOne(String id) {
		TypedQuery<Item> query = em.createQuery(
				  "SELECT e FROM Item e WHERE e.no = ?1", Item.class);
		return query.setParameter(1, id).getSingleResult();
	}

}
