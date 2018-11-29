package com.sisveco.serviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisveco.dao.PedidoDao;
import com.sisveco.entity.Pedido;
import com.sisveco.service.PedidoService;
@Service
public class PedidoServiceImp implements PedidoService {
	
	@Override
	public int create(Pedido p) {
		// TODO Auto-generated method stub
		return 0; //pedidodao.create(p);
	}

}
