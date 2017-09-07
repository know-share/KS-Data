/**
 * 
 */
package com.knowshare.entities.ludificacion;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Representa las insignias que se otorgan en la aplicacion.
 * @author Miguel Montañez
 *
 */
@Document(collection = "insignia")
public class Insignia {
	
	@Id
	private String id;
	
	private String nombre;
	
	private String descripcion;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Insignia setId(String id) {
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
	public Insignia setNombre(String nombre) {
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
	public Insignia setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}
}
