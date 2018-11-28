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
<<<<<<< HEAD
	 public List<Map<String, Object>> validarUsuario(Usuario e);
=======
	 List<Map<String, Object>> validarUsuario(Usuario e);
>>>>>>> 653df11eb30914c817442432e902425e9b215671
}
