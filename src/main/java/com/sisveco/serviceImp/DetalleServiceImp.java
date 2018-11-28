package com.sisveco.serviceImp;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.DetalleDao;
import com.sisveco.entity.Detalle;
import com.sisveco.service.DetalleService;


public class DetalleServiceImp implements DetalleService {
	@Autowired
	private DetalleDao detalledao;
	
	@Override
	public int create(Detalle u) {
		// TODO Auto-generated method stub
		return detalledao.create(u);
	}

}
