package com.sisveco.entity;

public class Usuario {
	private int idusu;
	private int idcli;
	private int idroll;
	private String usu;
	private String pasw;
	private String nombr;
	private String apell;
	private String estado;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int idusu, int idcli, int idroll, String usu, String pasw, String nombr, String apell,
			String estado) {
		super();
		this.idusu = idusu;
		this.idcli = idcli;
		this.idroll = idroll;
		this.usu = usu;
		this.pasw = pasw;
		this.nombr = nombr;
		this.apell = apell;
		this.estado = estado;
	}
	public int getIdusu() {
		return idusu;
	}
	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}
	public int getIdcli() {
		return idcli;
	}
	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}
	public int getIdroll() {
		return idroll;
	}
	public void setIdroll(int idroll) {
		this.idroll = idroll;
	}
	public String getUsu() {
		return usu;
	}
	public void setUsu(String usu) {
		this.usu = usu;
	}
	public String getPasw() {
		return pasw;
	}
	public void setPasw(String pasw) {
		this.pasw = pasw;
	}
	public String getNombr() {
		return nombr;
	}
	public void setNombr(String nombr) {
		this.nombr = nombr;
	}
	public String getApell() {
		return apell;
	}
	public void setApell(String apell) {
		this.apell = apell;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
