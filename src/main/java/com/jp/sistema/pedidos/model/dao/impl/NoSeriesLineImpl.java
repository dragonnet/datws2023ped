package com.jp.sistema.pedidos.model.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jp.sistema.pedidos.model.dao.INoSeriesLine;
import com.jp.sistema.pedidos.model.entity.NoSeriesLines;

@Repository
@Transactional
public class NoSeriesLineImpl implements INoSeriesLine {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public NoSeriesLines findByOne(String id) {
		TypedQuery<NoSeriesLines> query = em.createQuery(
				  "SELECT e FROM NoSeriesLines e WHERE e.seriesCode = ?1", NoSeriesLines.class);
		return query.setParameter(1, id).getSingleResult();
	}

	@Override
	public boolean updateLastNoUsed(String correlativo) {
		try {
			String newLastNoUsed = "PV".concat(correlativo);
			Query query = em.createQuery("UPDATE NoSeriesLines p SET p.lastNoUsed = :newcorrelativo WHERE p.seriesCode = :codigo");
			query.setParameter("newcorrelativo", newLastNoUsed);
			query.setParameter("codigo", "V-PED-3");
			int filasActualizadas = query.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
