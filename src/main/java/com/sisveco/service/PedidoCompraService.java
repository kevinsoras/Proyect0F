package com.sisveco.service;

import java.util.List;
import java.util.Map;

import com.sisveco.entity.PedidoCompra;

public interface PedidoCompraService {
	int create(PedidoCompra u);
    int update(PedidoCompra u);
    int delete(int key);
    PedidoCompra read(int key);
    List<Map<String, Object>> readAll();
}
