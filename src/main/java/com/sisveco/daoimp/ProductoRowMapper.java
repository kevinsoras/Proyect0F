package com.sisveco.daoimp;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sisveco.entity.Producto;
public class ProductoRowMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Producto o = new Producto();
		o.setIdprod(rs.getInt("idproducto"));
		o.setIdcat(rs.getInt("idcategoria"));
		o.setNom(rs.getString("nombre"));
		o.setPreci(rs.getDouble("precio"));
		o.setCant(rs.getInt("cantidad"));
		o.setCodig(rs.getInt("codigo"));
		o.setEstad(rs.getString("estado"));
		return o;
	}

}
