/**
 * 
 */
package com.knowshare.dto.ludificacion;

import java.io.Serializable;

/**
 * Contiene atributos necesarios para mandar al cliente
 * y poder mostrar por pantalla.
 * @author Miguel Montañez
 *
 */
public class InsigniaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String nombre;
	
	private String descripcion;
	
	private boolean visto;
	
	private String iconoRef;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public InsigniaDTO setId(String id) {
		this.id = id;
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
	public InsigniaDTO setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public InsigniaDTO setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	/**
	 * @return the visto
	 */
	public boolean isVisto() {
		return visto;
	}

	/**
	 * @param visto the visto to set
	 */
	public InsigniaDTO setVisto(boolean visto) {
		this.visto = visto;
		return this;
	}

	/**
	 * @return the iconoRef
	 */
	public String getIconoRef() {
		return iconoRef;
	}

	/**
	 * @param iconoRef the iconoRef to set
	 */
	public InsigniaDTO setIconoRef(String iconoRef) {
		this.iconoRef = iconoRef;
		return this;
	}
}
