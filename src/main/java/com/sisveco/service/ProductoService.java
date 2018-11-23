package com.sisveco.service;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Producto;

public interface ProductoService {
	int create(Producto co);
    int update(Producto co);
    int delete(int key);
    Producto read(int key);
    List<Map<String, Object>> readAll();
}
