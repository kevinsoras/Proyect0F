package com.sisveco.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sisveco.dao.UsuarioDao;
import com.sisveco.entity.Usuario;

public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private DataSource dataSource;
	Connection cx = null;
	@Override
	public HashMap<String, Object> validar(String x, String y) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
        try {
            cx = dataSource.getConnection();
            PreparedStatement ps = cx.prepareStatement("CALL Usuario_sp_ValidarUsuario(?,?)");
            //cst = cx.prepareCall("{call validarUser(?,?)}");
            ps.setString(1, x);
            ps.setString(2, y);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){                
                map.put("idu", rs.getInt("idusuario"));
                map.put("idc", rs.getInt("idcliente"));
                map.put("idr", rs.getInt("idrol"));
                map.put("user", rs.getString("usuario"));
                map.put("nom", rs.getString("nombre"));
                map.put("apell", rs.getString("apellido"));
                map.put("esta", rs.getString("estado"));
                map.put("rol", rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return map;
	}

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean search(String user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
