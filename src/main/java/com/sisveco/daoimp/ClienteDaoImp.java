package com.sisveco.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
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
		SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Cliente_sp_Leer");
		SqlParameterSource in = new MapSqlParameterSource().addValue("idcliente", key);
		Map<String,Object> out = sjc.execute(in);
		Cliente cliente = new Cliente();
			cliente.setIdcli((Integer)out.get("idcliente"));
			cliente.setApell((String) out.get("apellidos"));
			cliente.setCel((String) out.get("celular"));
			cliente.setDirec((String) out.get("direccion"));
			cliente.setDni((Integer)out.get("dni"));
			cliente.setEstad((String)out.get("estado"));
			cliente.setNom((String)out.get("nombre"));
			cliente.setRaz_soc((String)out.get("razon_social"));
			cliente.setRucc((String)out.get("ruc"));
		return cliente;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Cliente_sp_Mostrar").;
		List<Map<String,Object>> out =  sjc.execute(new Map<String,Object>);
		
		return  out;
	}

}
