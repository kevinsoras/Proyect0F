package com.sisveco.entity;

public class Categoria {
	private int idcat;
	private String nom;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(int idcat, String nom) {
		super();
		this.idcat = idcat;
		this.nom = nom;
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
	
}
