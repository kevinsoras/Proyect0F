	package com.sisveco.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sisveco.dao.ClienteDao;
import com.sisveco.dao.RolDao;
import com.sisveco.dao.UsuarioDao;
import com.sisveco.daoimp.UsuarioDaoImp;
import com.sisveco.entity.Cliente;
import com.sisveco.entity.Usuario;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
        ClienteDao dao =(ClienteDao)context.getBean("clienteDaoImp");
        //System.out.println(dao.delete(2));
        //Cliente mapa = dao.read(3);
        //System.out.println(mapa.getApell());
        

        List<Map<String,Object>> listacli = dao.Search("10");
        
        System.out.println(listacli.size());
       for(Map<String,Object> map : listacli) {
        	System.out.println(map.get("nombre"));
		}
	

        List<Map<String,Object>> listaclis = dao.readAll();
        
        System.out.println(listacli.size());
      for(Map<String,Object> map : listacli) {
        	System.out.println(map.get("nom"));
		}
		pruebausuario();
	}
	public static void pruebarol() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
        RolDao rao =(RolDao)context.getBean("rolDaoImp");
        //System.out.println(dao.delete(2));
        //Cliente mapa = dao.read(3);
        //System.out.println(mapa.getApell());
        
        List<Map<String,Object>> listarol = rao.readAll();
        for(Map<String,Object> map:listarol) {
        	System.out.println(map.get("nombre"));
        }
	}
	public static void pruebausuario() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		UsuarioDao uao = (UsuarioDao)context.getBean("usuarioDaoImp");
		//Usuario mape = uao.read(10);
		//System.out.println(mape.getUsu());
		List<Map<String,Object>> listau = uao.readAll();

		System.out.println(listau.size());
		for(Map<String,Object> mape : listau) {
			System.out.println(mape.get("nom"));
		}
	}
	/*public static void login(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		UsuarioDao uao = (UsuarioDao)context.getBean("usuarioDaoImp");
		List<Map<String,Object>> listasd = uao.validarUsuario(uao.readAll());
	}*/
}