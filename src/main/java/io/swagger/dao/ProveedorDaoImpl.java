package io.swagger.dao;


import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import io.swagger.model.Proveedor;

@Repository
@Transactional
public class ProveedorDaoImpl extends AbstractSession implements ProveedorDao {

	
	@Override
	public Proveedor findById(Long idFactura) {
		// TODO Auto-generated method stub
		return (Proveedor) getSession().get(Proveedor.class, idFactura);
	}

	
}





