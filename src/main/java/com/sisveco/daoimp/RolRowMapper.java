package com.sisveco.daoimp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sisveco.entity.Rol;

public class RolRowMapper implements RowMapper<Rol>{

	@Override
	public Rol mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Rol r = new Rol();
		r.setIdrol(rs.getInt("idrol"));
		r.setNom(rs.getString("nombre"));
		return r;
	}

	
}
