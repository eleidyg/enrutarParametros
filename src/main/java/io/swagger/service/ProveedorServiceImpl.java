package io.swagger.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.dao.ProveedorDao;
import io.swagger.model.Proveedor;


@Service("proveedorService")
@Transactional
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorDao _proveedorDao;

	@Override
	public Proveedor findById(String idFactura) {
		idFactura=idFactura.substring(0, 4);
		Long idFact=(Long.valueOf(idFactura));
		return _proveedorDao.findById(idFact);
	}

	
}
