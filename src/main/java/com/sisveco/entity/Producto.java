package com.sisveco.entity;

public class Producto {
	private int idprod;
	private int idcat;
	private String nom;
	private Double preci;
	private int cant;
	private int codig;
	private String estad;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int idprod, int idcat, String nom, Double preci, int cant, int codig, String estad) {
		super();
		this.idprod = idprod;
		this.idcat = idcat;
		this.nom = nom;
		this.preci = preci;
		this.cant = cant;
		this.codig = codig;
		this.estad = estad;
	}
	public int getIdprod() {
		return idprod;
	}
	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPreci() {
		return preci;
	}
	public void setPreci(Double preci) {
		this.preci = preci;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public int getCodig() {
		return codig;
	}
	public void setCodig(int codig) {
		this.codig = codig;
	}
	public String getEstad() {
		return estad;
	}
	public void setEstad(String estad) {
		this.estad = estad;
	}
	
}
