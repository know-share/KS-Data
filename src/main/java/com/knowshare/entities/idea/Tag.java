/**
 * 
 */
package com.knowshare.entities.idea;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Una coleccion basica que guarda los tags que seran 
 * usadas en la aplicacion para la creacion de ideas.
 * @author Miguel Montañez
 *
 */
@Document(collection="tag")
public class Tag implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
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
	public Tag setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public Tag setId(String id) {
		this.id = id;
		return this;
	}
	
}
