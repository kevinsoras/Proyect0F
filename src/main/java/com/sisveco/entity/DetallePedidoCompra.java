package com.sisveco.entity;

public class DetallePedidoCompra {
	private int idDetallPedCom;
	private int idped_compr;
	private int idprod;
	private String nom;
	private int cant;
	private String estado;
	public DetallePedidoCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePedidoCompra(int detallPedCom, int idped_compr, int idprod, String nom, int cant, String estado) {
		super();
		idDetallPedCom = detallPedCom;
		this.idped_compr = idped_compr;
		this.idprod = idprod;
		this.nom = nom;
		this.cant = cant;
		this.estado = estado;
	}
	public int getDetallPedCom() {
		return idDetallPedCom;
	}
	public void setDetallPedCom(int detallPedCom) {
		idDetallPedCom = detallPedCom;
	}
	public int getIdped_compr() {
		return idped_compr;
	}
	public void setIdped_compr(int idped_compr) {
		this.idped_compr = idped_compr;
	}
	public int getIdprod() {
		return idprod;
	}
	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
