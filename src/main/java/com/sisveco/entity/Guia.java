package com.sisveco.entity;

public class Guia {
	private int idguiaa;
	private int idpedid;
	private String numera;
	private String orig;
	private String dest;
	private String estad;
	public Guia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guia(int idguiaa, int idpedid, String numera, String orig, String dest, String estad) {
		super();
		this.idguiaa = idguiaa;
		this.idpedid = idpedid;
		this.numera = numera;
		this.orig = orig;
		this.dest = dest;
		this.estad = estad;
	}
	public int getIdguiaa() {
		return idguiaa;
	}
	public void setIdguiaa(int idguiaa) {
		this.idguiaa = idguiaa;
	}
	public int getIdpedid() {
		return idpedid;
	}
	public void setIdpedid(int idpedid) {
		this.idpedid = idpedid;
	}
	public String getNumera() {
		return numera;
	}
	public void setNumera(String numera) {
		this.numera = numera;
	}
	public String getOrig() {
		return orig;
	}
	public void setOrig(String orig) {
		this.orig = orig;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getEstad() {
		return estad;
	}
	public void setEstad(String estad) {
		this.estad = estad;
	}
	
}
