package com.sisveco.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sisveco.entity.Usuario;

public interface UsuarioDao {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int key);
	Usuario read(int key);
	boolean search(String user);
	List<Map<String, Object>> readAll();
	List<Map<String, Object>> validarUsuario(Usuario e);
}
