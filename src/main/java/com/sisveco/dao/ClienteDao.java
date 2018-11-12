package com.sisveco.dao;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Cliente;

public interface ClienteDao {
	int create(Cliente u);
    int update(Cliente u);
    int delete(int key);
    Cliente read(int key);
    List<Map<String, Object>> readAll();
}
