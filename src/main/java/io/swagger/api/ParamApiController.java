package io.swagger.api;

import io.swagger.model.Proveedor;
import io.swagger.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.util.*;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-18T20:22:30.663-05:00")

@Controller
@RequestMapping("/v1")
public class ParamApiController {
	
	@Autowired
	ProveedorService _proveedorService;
    
	//GET
	@RequestMapping(value="/param/{idFactura}", method = RequestMethod.GET, headers = "Accept=application/json")
    public ResponseEntity<Proveedor> obtenerFactura(@PathVariable("idFactura") String idFactura) {
    	if (idFactura == null) {
			return new ResponseEntity(new CustomErrorType("idFactura es requerido"), HttpStatus.CONFLICT);
		}
		
		Proveedor proveedor = _proveedorService.findById(idFactura);
		if (idFactura == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Proveedor>(proveedor, HttpStatus.OK);
    }

}
