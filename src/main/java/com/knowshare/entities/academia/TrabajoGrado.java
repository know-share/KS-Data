/**
 * 
 */
package com.knowshare.entities.academia;

import java.io.Serializable;
import java.util.List;

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
public class TrabajoGrado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	private String nombre;
	
	private String periodoFin;
	
	private String resumen;
	
	private Integer numEstudiantes;
	
	//Tags
	private List<String> descripción;

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
	public String getPeriodoFin() {
		return periodoFin;
	}

	/**
	 * @param periodoFin the periodoFin to set
	 */
	public TrabajoGrado setPeriodoFin(String periodoFin) {
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
	 * @return the descripción
	 */
	public List<String> getDescripción() {
		return descripción;
	}

	/**
	 * @param descripción the descripción to set
	 */
	public TrabajoGrado setDescripción(List<String> descripción) {
		this.descripción = descripción;
		return this;
	}

	/**
	 * @return the numEstudiantes
	 */
	public Integer getNumEstudiantes() {
		return numEstudiantes;
	}

	/**
	 * @param numEstudiantes the numEstudiantes to set
	 */
	public TrabajoGrado setNumEstudiantes(Integer numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
		return this;
	}
}
