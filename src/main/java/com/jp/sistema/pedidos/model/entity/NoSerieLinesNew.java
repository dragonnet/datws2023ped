package com.jp.sistema.pedidos.model.entity;

import lombok.Data;

@Data
public class NoSerieLinesNew {
	private String timestamp;
	private String seriesCode;
	private String lineNo;
	private String startingDate;
	private String startingNo;
	private String enddingNo;
	private String warningNo;
	private String incrementByNo;
	private String lastNoUsed;
	private String lastDateUsed;
	private String Series;
}
