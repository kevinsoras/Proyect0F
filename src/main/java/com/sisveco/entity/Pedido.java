package com.sisveco.entity;

public class Pedido {
	private int idpedido;
	private int idcliente;
	private int idusuario;
	private String numero;
	private String serie;
	private double subtotal;
	private double saldo;
	private double igv;
	private double total;
	private String fecha;
	private String tipo_pago;
	private String tipo;
	private String estado;
	public int getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipo_pago() {
		return tipo_pago;
	}
	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Pedido() {
		super();
	}
	public Pedido(int idcliente, int idusuario, String numero, String serie, double subtotal, double saldo, double igv,
			double total, String fecha, String tipo_pago, String tipo, String estado) {
		super();
		this.idcliente = idcliente;
		this.idusuario = idusuario;
		this.numero = numero;
		this.serie = serie;
		this.subtotal = subtotal;
		this.saldo = saldo;
		this.igv = igv;
		this.total = total;
		this.fecha = fecha;
		this.tipo_pago = tipo_pago;
		this.tipo = tipo;
		this.estado = estado;
	}
	public Pedido(int idpedido, int idcliente, int idusuario, String numero, String serie, double subtotal,
			double saldo, double igv, double total, String fecha, String tipo_pago, String tipo, String estado) {
		super();
		this.idpedido = idpedido;
		this.idcliente = idcliente;
		this.idusuario = idusuario;
		this.numero = numero;
		this.serie = serie;
		this.subtotal = subtotal;
		this.saldo = saldo;
		this.igv = igv;
		this.total = total;
		this.fecha = fecha;
		this.tipo_pago = tipo_pago;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	
}
