package com.jp.sistema.pedidos.model.dao;

import com.jp.sistema.pedidos.model.entity.NoSeriesLines;

public interface INoSeriesLine {
	public NoSeriesLines findByOne(String id);
	public boolean updateLastNoUsed(String correlativo);
}
