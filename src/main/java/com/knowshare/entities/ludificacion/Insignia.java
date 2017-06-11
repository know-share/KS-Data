/**
 * 
 */
package com.knowshare.entities.ludificacion;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Representa las insignias que se otorgan en la aplicacion.
 * @author miguel
 *
 */
@Document(collection = "insignia")
public class Insignia {
	
	@Id
	private String nombre;
	
	private String descripcion;
	
	private String iconoRef;

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

	/**
	 * @return the iconoRef
	 */
	public String getIconoRef() {
		return iconoRef;
	}

	/**
	 * @param iconoRef the iconoRef to set
	 */
	public Insignia setIconoRef(String iconoRef) {
		this.iconoRef = iconoRef;
		return this;
	}
}
