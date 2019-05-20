package io.swagger.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Proveedor
 */

@Entity
@Table(name="Parametros")
public class Proveedor implements Serializable{

	@Id
    @Column(name="idfactura")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idFactura;
	
	@Column(name="proveedor")
	private String proveedor;
	
	@Column(name="endpoint")
	private String endpoint;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="plantilla")
	private String plantilla;
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public Proveedor(String proveedor, String endpoint, String tipo) {
		super();
		this.proveedor = proveedor;
		this.endpoint = endpoint;
		this.tipo = tipo;
	}


	public long getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getEndpoint() {
		return endpoint;
	}


	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}


	}

