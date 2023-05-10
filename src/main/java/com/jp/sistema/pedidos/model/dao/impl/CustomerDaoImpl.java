package com.jp.sistema.pedidos.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sistema.pedidos.model.dao.ICustomerDao;
import com.jp.sistema.pedidos.model.entity.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Customer> findAll() {
		return em.createQuery("from Customer").getResultList();
	}

	@Override
	public Customer findOne(String id) {
		
		TypedQuery<Customer> query = em.createQuery(
				  "SELECT e FROM Customer e WHERE e.no = ?1", Customer.class);
		return query.setParameter(1, id).getSingleResult();
	}

}
