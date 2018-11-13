package com.sisveco.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sisveco.dao.ClienteDao;
import com.sisveco.dao.UsuarioDao;
import com.sisveco.daoimp.UsuarioDaoImp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
        ClienteDao dao =(ClienteDao)context.getBean("clienteDaoImp");
        List<Map<String,Object>> listacli = dao.readAll();
        System.out.println(listacli.size());
        for(Map<String,Object> map : listacli) {
        	System.out.println(map.get("nom"));
        }
        */
	}

}
