package com.sisveco.daoimp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sisveco.entity.Cliente;

public class ClienteRowMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Cliente c =  new Cliente();
		c.setApell(rs.getString("apellidos"));
		c.setCel(rs.getString("celular"));
		c.setDirec(rs.getString("direccion"));
		c.setDni(rs.getInt("dni"));
		c.setEstad(rs.getString("estado"));
		c.setIdcli(rs.getInt("idcliente"));
		c.setNom(rs.getString("nombre"));
		c.setRaz_soc(rs.getString("razon_social"));
		c.setRucc(rs.getString("ruc"));
		return c;
	}

}
