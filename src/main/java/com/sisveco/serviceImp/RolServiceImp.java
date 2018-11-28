package com.sisveco.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.RolDao;
import com.sisveco.entity.Rol;
import com.sisveco.service.RolService;

@Service
public class RolServiceImp implements RolService{
	@Autowired
	private RolDao roldao;
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return roldao.create(r);
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return roldao.update(r);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return roldao.delete(key);
	}

	@Override
	public Rol read(int key) {
		// TODO Auto-generated method stub
		return roldao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return roldao.readAll();
	}

}
