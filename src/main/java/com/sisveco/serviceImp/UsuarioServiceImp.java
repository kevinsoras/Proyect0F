package com.sisveco.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.UsuarioDao;
import com.sisveco.daoimp.UsuarioDaoImp;
import com.sisveco.entity.Usuario;
import com.sisveco.service.UsuarioService;


public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioDaoImp usuarioDao;

	@Override
	public int create(Usuario user) throws SQLException {
		return usuarioDao.create(user);
	}

	@Override
	public int update(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioDao.update(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Map<String,Object>> readAll() {
		return usuarioDao.readAll();
		// TODO Auto-generated method stub
	}
}
