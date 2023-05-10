package com.jp.sistema.pedidos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "No_Series_Line")
public class NoSeriesLines {
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
	
	@Id
	@Column(name = "timestamp", unique = true, nullable = false)
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	@Column(name = "Series_Code")
	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}
	
	@Column(name = "Line_No")
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	
	@Column(name = "Starting_Date", nullable = true)
	public String getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	@Column(name = "Starting_No_")
	public String getStartingNo() {
		return startingNo;
	}
	public void setStartingNo(String startingNo) {
		this.startingNo = startingNo;
	}
	@Column(name = "Endding_No_")
	public String getEndingNo() {
		return enddingNo;
	}

	public void setEndingNo(String enddingNo) {
		this.enddingNo = enddingNo;
	}
	
	@Column(name = "Warning_No_", nullable = true)
	public String getWarningNo() {
		return warningNo;
	}
	
	public void setWarningNo(String warning) {
		this.warningNo = warning;
	}
	@Column(name = "Increment_by_no_")
	public String getIncrementByNo() {
		return incrementByNo;
	}
	public void setIncrementByNo(String incrementByNo) {
		this.incrementByNo = incrementByNo;
	}
	
	@Column(name = "Last_No_Used_")
	public String getLastNoUsed() {
		return lastNoUsed;
	}
	public void setLastNoUsed(String lastNoUsed) {
		this.lastNoUsed = lastNoUsed;
	}
	
	@Column(name = "Last_Date_Used", nullable = true)
	public String getLastDateUsed() {
		return lastDateUsed;
	}
	public void setLastDateUsed(String lastDateUsed) {
		this.lastDateUsed = lastDateUsed;
	}
	@Column(name = "Series", nullable = true)
	public String getSeries() {
		return Series;
	}
	public void setSeries(String series) {
		Series = series;
	}
}