/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import java.io.Serializable;

import org.bson.types.ObjectId;

import com.knowshare.entities.ludificacion.CualidadAval;
import com.knowshare.enums.TipoCualidadEnum;

/**
 * Clase que mapea las principales propiedades de la 
 * entidad {@link CualidadAval} para ser enviada al
 * cliente.
 * @author Miguel Montañez
 *
 */
public class CualidadDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ObjectId id;

	private String nombre;

	private TipoCualidadEnum tipo;
	
	private Integer avales;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public CualidadDTO setId(ObjectId id) {
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
	public CualidadDTO setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoCualidadEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public CualidadDTO setTipo(TipoCualidadEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the avales
	 */
	public Integer getAvales() {
		return avales;
	}

	/**
	 * @param avales the avales to set
	 */
	public CualidadDTO setAvales(Integer avales) {
		this.avales = avales;
		return this;
	}
}
