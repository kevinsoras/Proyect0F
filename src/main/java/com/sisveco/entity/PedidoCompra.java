package com.sisveco.entity;

import java.sql.Date;

public class PedidoCompra {
	private int idPedidCompr;
	private String numer;
	private Date fech;
	private String estad;
	public PedidoCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PedidoCompra(int pedidCompr, String numer, Date fech, String estad) {
		super();
		idPedidCompr = pedidCompr;
		this.numer = numer;
		this.fech = fech;
		this.estad = estad;
	}
	public int getPedidCompr() {
		return idPedidCompr;
	}
	public void setPedidCompr(int pedidCompr) {
		idPedidCompr = pedidCompr;
	}
	public String getNumer() {
		return numer;
	}
	public void setNumer(String numer) {
		this.numer = numer;
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
