package com.sisveco.entity;

public class Detalle {
	private int iddetal;
	private int idpedi;
	private int idprod;
	private int cantid;
	private Double importee;
	private Double preci;
	private String estado;
	public Detalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle(int iddetal, int idpedi, int idprod, int cantid, Double importee, Double preci, String estado) {
		super();
		this.iddetal = iddetal;
		this.idpedi = idpedi;
		this.idprod = idprod;
		this.cantid = cantid;
		this.importee = importee;
		this.preci = preci;
		this.estado = estado;
	}
	public int getIddetal() {
		return iddetal;
	}
	public void setIddetal(int iddetal) {
		this.iddetal = iddetal;
	}
	public int getIdpedi() {
		return idpedi;
	}
	public void setIdpedi(int idpedi) {
		this.idpedi = idpedi;
	}
	public int getIdprod() {
		return idprod;
	}
	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}
	public int getCantid() {
		return cantid;
	}
	public void setCantid(int cantid) {
		this.cantid = cantid;
	}
	public Double getImportee() {
		return importee;
	}
	public void setImportee(Double importee) {
		this.importee = importee;
	}
	public Double getPreci() {
		return preci;
	}
	public void setPreci(Double preci) {
		this.preci = preci;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
