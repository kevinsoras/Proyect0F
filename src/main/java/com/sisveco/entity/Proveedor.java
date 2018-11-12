package com.sisveco.entity;

public class Proveedor {
	private int idprov;
	private String nom;
	private String apell;
	private String dni;
	private String corr;
	private String cel;
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proveedor(int idprov, String nom, String apell, String dni, String corr, String cel) {
		super();
		this.idprov = idprov;
		this.nom = nom;
		this.apell = apell;
		this.dni = dni;
		this.corr = corr;
		this.cel = cel;
	}
	public int getIdprov() {
		return idprov;
	}
	public void setIdprov(int idprov) {
		this.idprov = idprov;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApell() {
		return apell;
	}
	public void setApell(String apell) {
		this.apell = apell;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorr() {
		return corr;
	}
	public void setCorr(String corr) {
		this.corr = corr;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	
}
