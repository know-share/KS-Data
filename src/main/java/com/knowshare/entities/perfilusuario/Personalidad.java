/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author miguel
 *
 */
@Document(collection = "personalidad")
public class Personalidad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nombre;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public Personalidad setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
}
