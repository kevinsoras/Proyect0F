package com.sisveco.dao;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.PedidoCompra;

public interface PedidoCompraDao {
	int create(PedidoCompra u);
    int update(PedidoCompra u);
    int delete(int key);
    PedidoCompra read(int key);
    List<Map<String, Object>> readAll();
}
