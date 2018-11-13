package com.sisveco.service;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Cliente;

public interface ClienteService {
	int create(Cliente u);
    int update(Cliente u);
    int delete(int key);
    Cliente read(int key);
    List<Map<String, Object>> readAll();
}
