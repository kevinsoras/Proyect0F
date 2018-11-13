package com.sisveco.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.ClienteDao;
import com.sisveco.entity.Cliente;
import com.sisveco.service.ClienteService;
@Service
public class ClienteServiceImp implements ClienteService{
	@Autowired
	private ClienteDao clientedao;
	@Override
	public int create(Cliente u) {
		// TODO Auto-generated method stub
		return clientedao.create(u);
	}

	@Override
	public int update(Cliente u) {
		// TODO Auto-generated method stub
		return clientedao.update(u);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return clientedao.delete(key);
	}

	@Override
	public Cliente read(int key) {
		// TODO Auto-generated method stub
		return clientedao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return clientedao.readAll();
	}

}
