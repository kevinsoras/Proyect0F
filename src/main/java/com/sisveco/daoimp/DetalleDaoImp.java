package com.sisveco.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sisveco.dao.DetalleDao;
import com.sisveco.entity.Detalle;

public class DetalleDaoImp implements DetalleDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int create(Detalle u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call Detalle_sp_Crear()",u.getIdprod(),u.getCantid(),u.getImportee(),u.getPreci());
	}

	@Override
	public int update(Detalle u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> Search(String Key) {
		// TODO Auto-generated method stub
		return null;
	}

}
