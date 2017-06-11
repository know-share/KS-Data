/**
 * 
 */
package com.knowshare.entities.academia;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Trabajos de grado que un profesor o egresado ha 
 * realizado o dirigido
 * @author miguel
 *
 */
@Document(collection = "trabajo_grado")
public class TrabajoGrado{
	
	@Id
	private ObjectId id;
	
	private String nombre;
	
	private Integer periodoFin;
	
	private String resumen;
	
	private String modalidad;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public TrabajoGrado setId(ObjectId id) {
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
	public TrabajoGrado setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the periodoFin
	 */
	public Integer getPeriodoFin() {
		return periodoFin;
	}

	/**
	 * @param periodoFin the periodoFin to set
	 */
	public TrabajoGrado setPeriodoFin(Integer periodoFin) {
		this.periodoFin = periodoFin;
		return this;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public TrabajoGrado setResumen(String resumen) {
		this.resumen = resumen;
		return this;
	}

	/**
	 * @return the modalidad
	 */
	public String getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public TrabajoGrado setModalidad(String modalidad) {
		this.modalidad = modalidad;
		return this;
	}
}
