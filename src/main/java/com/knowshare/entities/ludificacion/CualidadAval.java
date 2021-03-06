/**
 * 
 */
package com.knowshare.entities.ludificacion;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.knowshare.entities.perfilusuario.Cualidad;

/**
 * Representa las cualidades que posee un usuario,
 * ademas, guarda la cantidad de avales que tiene por cada
 * cualidad.
 * @author Miguel Montañez
 *
 */
public class CualidadAval{

	@DBRef
	private Cualidad cualidad;
	
	private String nombre;
	
	private Integer cantidad;

	/**
	 * @return the cualidad
	 */
	public Cualidad getCualidad() {
		return cualidad;
	}

	/**
	 * @param cualidad the cualidad to set
	 */
	public CualidadAval setCualidad(Cualidad cualidad) {
		this.cualidad = cualidad;
		return this;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public CualidadAval setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public CualidadAval setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
}
