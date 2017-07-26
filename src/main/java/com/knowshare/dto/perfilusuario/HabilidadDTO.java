/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import java.io.Serializable;

import org.bson.types.ObjectId;

import com.knowshare.entities.ludificacion.HabilidadAval;
import com.knowshare.enums.TipoHabilidadEnum;

/**
 * Clase que mapea las principales propiedades de la
 * entidad {@link HabilidadAval} para ser enviada a
 * presentación.
 * @author Miguel Montañez
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
	
	private String carrera;
	
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

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public HabilidadDTO setCarrera(String carrera) {
		this.carrera = carrera;
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
	public HabilidadDTO setAvales(Integer avales) {
		this.avales = avales;
		return this;
	}
}
