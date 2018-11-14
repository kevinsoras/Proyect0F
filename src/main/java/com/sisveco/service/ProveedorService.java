package com.sisveco.service;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Proveedor;

public interface ProveedorService {
	int create(Proveedor r);
    int update(Proveedor r);
    int delete(int key);
    Proveedor read(int key);
    List<Map<String, Object>> readAll();
}
