package com.sisveco.entity;

import java.sql.Date;

public class Pago {
	private int idpa;
	private int idped;
	private Double pagoo;
	private Date fech;
	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pago(int idpa, int idped, Double pagoo, Date fech) {
		super();
		this.idpa = idpa;
		this.idped = idped;
		this.pagoo = pagoo;
		this.fech = fech;
	}
	public int getIdpa() {
		return idpa;
	}
	public void setIdpa(int idpa) {
		this.idpa = idpa;
	}
	public int getIdped() {
		return idped;
	}
	public void setIdped(int idped) {
		this.idped = idped;
	}
	public Double getPagoo() {
		return pagoo;
	}
	public void setPagoo(Double pagoo) {
		this.pagoo = pagoo;
	}
	public Date getFech() {
		return fech;
	}
	public void setFech(Date fech) {
		this.fech = fech;
	}
	
}
