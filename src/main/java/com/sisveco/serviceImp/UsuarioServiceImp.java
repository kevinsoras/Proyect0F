package com.sisveco.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.UsuarioDao;
import com.sisveco.entity.Usuario;
import com.sisveco.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioDao usuariodao;
	@Override
	public int create(Usuario user) {
		return usuariodao.create(user);
	}

	@Override
	public int update(Usuario user) {
		// TODO Auto-generated method stub
		return usuariodao.update(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariodao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuariodao.read(id);
	}

	@Override
	public List<Map<String,Object>> readAll() {
		return usuariodao.readAll();
		// TODO Auto-generated method stub
	}

	@Override
	public List<Map<String, Object>> validarUsuario(Usuario e) {
		// TODO Auto-generated method stub
		return usuariodao.validarUsuario(e);
	}
}
