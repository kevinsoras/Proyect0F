package com.sisveco.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sisveco.dao.ClienteDao;
import com.sisveco.entity.Cliente;
@Repository
public class ClienteDaoImp implements ClienteDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Cliente u) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO usuario(idusuario,nom_user,clave,estado) values(null,?,?,?)";
		return jdbcTemplate.update(sql);
	}

	@Override
	public int update(Cliente u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
