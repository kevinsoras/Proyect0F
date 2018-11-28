package com.sisveco.daoimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sisveco.dao.PedidoDao;
import com.sisveco.entity.Pedido;

public class PedidoDaoImp implements PedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public int create(Pedido p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call Pedido_sp_Crear(?,?,?,?,?,?,?)",
				p.getIdcliente(),p.getIdusuario(),p.getSerie(),p.getSubtotal(),p.getFecha(),p.getTipo_pago(),p.getTipo());
	}

}
