package com.sisveco.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.ClienteDao;
import com.sisveco.dao.ProductoDao;
import com.sisveco.entity.Producto;
import com.sisveco.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService {
	@Autowired
	private ProductoDao productodao;
	@Override
	public int create(Producto co) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto co) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int key) {
		// TODO Auto-generated method stub
		return productodao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		
		return productodao.readAll();
	}

}
