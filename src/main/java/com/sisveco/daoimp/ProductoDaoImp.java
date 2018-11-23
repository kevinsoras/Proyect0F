package com.sisveco.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sisveco.dao.ProductoDao;
import com.sisveco.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Producto co) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int update(Producto co) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int key) {
		// TODO Auto-generated method stub
		Producto pro=jdbcTemplate.queryForObject(" call Producto_sp_Leer(?)",new ProductoRowMapper(),key );
		System.out.println("hola: "+pro.getNom());
		return pro;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("call Producto_sp_Mostrar()");
	}

}
