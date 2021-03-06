package com.sisveco.dao;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Categoria;

public interface CategoriaDao {
	int create(Categoria ca);
    int update(Categoria ca);
    int delete(int key);
    Categoria read(int key);
    List<Map<String, Object>> readAll();
}
