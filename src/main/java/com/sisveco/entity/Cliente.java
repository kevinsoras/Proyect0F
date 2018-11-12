package com.sisveco.entity;

public class Cliente {
	private int idcli;
	private String nom;
	private String apell;
	private int dni;
	private String direc;
	private String cel;
	private String rucc;
	private String raz_soc;
	private String estad;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int idcli, String nom, String apell, int dni, String direc, String cel, String rucc, String raz_soc,
			String estad) {
		super();
		this.idcli = idcli;
		this.nom = nom;
		this.apell = apell;
		this.dni = dni;
		this.direc = direc;
		this.cel = cel;
		this.rucc = rucc;
		this.raz_soc = raz_soc;
		this.estad = estad;
	}
	public int getIdcli() {
		return idcli;
	}
	public void setIdcli(int idcli) {
		this.idcli = idcli;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public String getRucc() {
		return rucc;
	}
	public void setRucc(String rucc) {
		this.rucc = rucc;
	}
	public String getRaz_soc() {
		return raz_soc;
	}
	public void setRaz_soc(String raz_soc) {
		this.raz_soc = raz_soc;
	}
	public String getEstad() {
		return estad;
	}
	public void setEstad(String estad) {
		this.estad = estad;
	}
	
}
