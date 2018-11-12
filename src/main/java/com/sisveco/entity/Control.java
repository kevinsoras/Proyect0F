package com.sisveco.entity;

import java.sql.Date;

public class Control {
	private int idcont;
	private String tabl;
	private String quer;
	private Date fech;
	private String estad;
	public Control() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Control(int idcont, String tabl, String quer, Date fech, String estad) {
		super();
		this.idcont = idcont;
		this.tabl = tabl;
		this.quer = quer;
		this.fech = fech;
		this.estad = estad;
	}
	public int getIdcont() {
		return idcont;
	}
	public void setIdcont(int idcont) {
		this.idcont = idcont;
	}
	public String getTabl() {
		return tabl;
	}
	public void setTabl(String tabl) {
		this.tabl = tabl;
	}
	public String getQuer() {
		return quer;
	}
	public void setQuer(String quer) {
		this.quer = quer;
	}
	public Date getFech() {
		return fech;
	}
	public void setFech(Date fech) {
		this.fech = fech;
	}
	public String getEstad() {
		return estad;
	}
	public void setEstad(String estad) {
		this.estad = estad;
	}
	
}
