package com.sisveco.daoimp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sisveco.entity.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		u.setIdusu(rs.getInt("idusuario"));
		u.setIdroll(rs.getInt("idrol"));
		u.setIdper(rs.getInt("idpersona"));
		u.setUsu(rs.getString("usuario"));
		u.setPasw(rs.getString("pasword"));
		u.setEstado(rs.getString("estado"));
		return u;
	}

}
