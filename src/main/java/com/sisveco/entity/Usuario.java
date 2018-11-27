package com.sisveco.entity;

public class Usuario {
	private int idusu;
	private int idper;
	private int idroll;
	private String usu;
	private String pasw;
	private String nombr;
	private String apell;
	private String direc;
	private String cel;
	private String estado;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idusu, int idper, int idroll, String usu, String pasw, String nombr, String apell, String direc,
			String cel, String estado) {
		super();
		this.idusu = idusu;
		this.idper = idper;
		this.idroll = idroll;
		this.usu = usu;
		this.pasw = pasw;
		this.nombr = nombr;
		this.apell = apell;
		this.direc = direc;
		this.cel = cel;
		this.estado = estado;
	}

	public Usuario(int idusu, String usu, String pasw) {
		super();
		this.idusu = idusu;
		this.usu = usu;
		this.pasw = pasw;
	}
	public Usuario(int idroll, String usu, String pasw, String nombr, String apell, String direc, String cel) {
		super();
		this.idroll = idroll;
		this.usu = usu;
		this.pasw = pasw;
		this.nombr = nombr;
		this.apell = apell;
		this.direc = direc;
		this.cel = cel;
	}

	public int getIdusu() {
		return idusu;
	}

	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}

	public int getIdper() {
		return idper;
	}

	public void setIdper(int idper) {
		this.idper = idper;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
