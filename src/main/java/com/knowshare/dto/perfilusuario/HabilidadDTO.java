/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import java.io.Serializable;

import org.bson.types.ObjectId;

import com.knowshare.enums.TipoHabilidadEnum;

/**
 * @author miguel
 *
 */
public class HabilidadDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ObjectId id;
	
	private String nombre;
	
	private TipoHabilidadEnum tipo;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public HabilidadDTO setId(ObjectId id) {
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
	public HabilidadDTO setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoHabilidadEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public HabilidadDTO setTipo(TipoHabilidadEnum tipo) {
		this.tipo = tipo;
		return this;
	}
}
