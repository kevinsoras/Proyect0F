package com.sisveco.daoimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
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
		return jdbcTemplate.update("call Cliente_sp_Crear(?,?,?,?,?,?,?)",u.getNom(),u.getApell(),u.getDni(),u.getDirec(),u.getCel(),
				u.getRucc(),u.getRaz_soc()
				);
	}

	@Override
	public int update(Cliente u) {
		// TODO Auto-generated method stub
		 return jdbcTemplate.update("call Cliente_sp_Modificar(?,?,?,?,?,?,?,?)",u.getIdcli(),u.getNom(),u.getApell(),u.getDni(),u.getDirec(),u.getCel(),
				u.getRucc(),u.getRaz_soc()
				);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int key) {
		// TODO Auto-generated method stub
		SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Cliente_sp_Leer")
				.returningResultSet("clientes",new ClienteRowMapper());
		SqlParameterSource in = new MapSqlParameterSource().addValue("idc", key);
		Map<String,Object> out = sjc.execute(in);
		List<Cliente> cli = (List<Cliente>) out.get("clientes");
		return cli.get(0);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Cliente_sp_Mostrar")
				.returningResultSet("clientes",new ClienteRowMapper());
		Map<String,Object> out =  sjc.execute();
		System.out.println();
		List<Cliente> lista = (List<Cliente>) out.get("clientes");
		List<Map<String, Object>> list = new ArrayList<>();
		for(int n=0;n<lista.size();n++) {
			Cliente cli = lista.get(n);
			ObjectMapper om = new ObjectMapper();
			Map<String, Object> maper= om.convertValue(cli,Map.class) ;
			list.add(maper);
		}
		return   list;
	}
}