package com.sisveco.entity;

public class usuario_opcion {
	private int idusu_op;
	private int idusu;
	private int idopc;
	private String estado;
	public usuario_opcion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public usuario_opcion(int idusu_op, int idusu, int idopc, String estado) {
		super();
		this.idusu_op = idusu_op;
		this.idusu = idusu;
		this.idopc = idopc;
		this.estado = estado;
	}
	public int getIdusu_op() {
		return idusu_op;
	}
	public void setIdusu_op(int idusu_op) {
		this.idusu_op = idusu_op;
	}
	public int getIdusu() {
		return idusu;
	}
	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}
	public int getIdopc() {
		return idopc;
	}
	public void setIdopc(int idopc) {
		this.idopc = idopc;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
