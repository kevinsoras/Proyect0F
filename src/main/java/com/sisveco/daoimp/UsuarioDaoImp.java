package com.sisveco.daoimp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sisveco.dao.UsuarioDao;
import com.sisveco.entity.Cliente;
import com.sisveco.entity.Usuario;

public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call Usuario_sp_Crear(?,?,?,?,?,?,?)",
				u.getNombr(),u.getApell(),u.getDirec(),u.getCel(),u.getIdroll(),u.getUsu(),u.getPasw());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call Usuario_sp_Modificar(?,?,?)", u.getIdusu(),u.getUsu(),u.getPasw());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String sql = "update usuario set estado='B' where idusuario=?";
		return jdbcTemplate.update(sql,key);
	}

	@Override
	public Usuario read(int key) {
		// TODO Auto-generated method stub
		/*SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Usuario_sp_Leer")
				.returningResultSet("usuarios",new ClienteRowMapper());
		SqlParameterSource in = new MapSqlParameterSource().addValue("idu", key);
		Map<String,Object> out = sjc.execute(in);
		List<Usuario> use = (List<Usuario>) out.get("usuarios");*/
		String sql = "select * from usuario where idusuario = ?";
		Usuario user = jdbcTemplate.queryForObject("call Usuario_sp_Crear(?)", new UsuarioRowMapper(), key);
		return user;
	}

	@Override
	public boolean search(String user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		/*SimpleJdbcCall sjc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Usuario_sp_Mostrar")
				.returningResultSet("usuarios",new ClienteRowMapper());
		Map<String,Object> out =  sjc.execute();
		System.out.println();
		List<Usuario> lista = (List<Usuario>) out.get("usuarios");
		List<Map<String, Object>> list = new ArrayList<>();
		for(int n=0;n<lista.size();n++) {
			Usuario us = lista.get(n);
			ObjectMapper om = new ObjectMapper();
			Map<String, Object> maper= om.convertValue(us,Map.class) ;
			list.add(maper);
		}*/
		return   jdbcTemplate.queryForList("{call Usuario_sp_Mostrar()}");
	}

	@Override
	public List<Map<String, Object>> validarUsuario(Usuario e) {
		String sql= "select o.idopcion, u.usuario, u.pasword, p.nombre, p.apellido, o.nombre, o.url\r\n" + 
				"from opcion o, usuario_opcion uo, usuario u, persona p\r\n" + 
				"where u.usuario='"+e.getUsu()+"' and u.pasword = '"+e.getPasw()+"' \r\n" + 
				"and uo.idusuario=u.idusuario\r\n" + 
				"and u.idpersona=p.idpersona\r\n" + 
				"and uo.idopcion=o.idopcion\r\n" + 
				"and uo.estado = 'A'";
		return jdbcTemplate.queryForList(sql);
	}
}