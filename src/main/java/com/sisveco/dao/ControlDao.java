package com.sisveco.dao;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.Control;

public interface ControlDao {
	int create(Control co);
    int update(Control co);
    int delete(int key);
    Control read(int key);
    List<Map<String, Object>> readAll();
}
