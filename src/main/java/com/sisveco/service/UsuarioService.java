package com.sisveco.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.sisveco.entity.Usuario;


public interface UsuarioService {
	 public int create(Usuario user)throws SQLException;
	 public int update(Usuario user);
	 public int delete(int id);
	 public Usuario read(int id);
	 public List<Map<String,Object>> readAll();
	 //hola b
	 //asd
}
