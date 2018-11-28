package com.sisveco.service;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Rol;

public interface RolService {
	int create(Rol r);
    int update(Rol r);
    int delete(int key);
    Rol read(int key);
    List<Map<String, Object>> readAll();
}
