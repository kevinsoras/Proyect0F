package com.sisveco.entity;

public class Rol {
	private int idroll;
	private String nom;
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rol(int idrol, String nom) {
		super();
		this.idroll = idrol;
		this.nom = nom;
	}
	public int getIdrol() {
		return idroll;
	}
	public void setIdrol(int idrol) {
		this.idroll = idrol;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
