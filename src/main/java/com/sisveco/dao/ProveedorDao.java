package com.sisveco.dao;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Proveedor;

public interface ProveedorDao {
	int create(Proveedor r);
    int update(Proveedor r);
    int delete(int key);
    Proveedor read(int key);
    List<Map<String, Object>> readAll();
}
