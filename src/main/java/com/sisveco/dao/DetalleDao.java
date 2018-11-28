package com.sisveco.dao;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Detalle;

public interface DetalleDao {
	int create(Detalle u);
    int update(Detalle u);
    int delete(int key);
    Detalle read(int key);
    List<Map<String, Object>> readAll();
    List<Map<String,Object>> Search(String Key);
}
