package com.sisveco.daoimp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sisveco.dao.RolDao;
import com.sisveco.entity.Rol;
@Repository
public class RolDaoImp implements RolDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call Rol_sp_Crear(?)",r.getNom());
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call Rol_sp_Modificar(?,?)",r.getIdrol(),r.getNom());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rol read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Rol_sp_Mostrar")
				.returningResultSet("roles", new RolRowMapper());
		Map<String,Object> out = sjc.execute();
		List<Rol> lista = (List<Rol>) out.get("roles");
		List<Map<String,Object>> list = new ArrayList<>();
		for (int n = 0; n < lista.size(); n++) {
			Rol ro = lista.get(n);
			ObjectMapper om = new ObjectMapper();
			Map<String,Object> maper = om.convertValue(ro, Map.class);
		}
		return null;
	}

}
