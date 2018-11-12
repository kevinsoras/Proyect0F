package com.sisveco.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sisveco.entity.Usuario;

public interface UsuarioDao {
	HashMap<String,Object> validar(String x, String y);
	int create(Usuario u);
    int update(Usuario u);
    int delete(int key);
    Usuario read(int key);
    boolean search(String user);
    List<Map<String, Object>> readAll();
}
