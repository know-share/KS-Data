/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Gustos que un usuario puede tener dentro de la aplicacion para
 * completar la informacion de su perfil
 * @author miguel
 *
 */
@Document(collection = "gusto")
public class Gusto implements Serializable{
	
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
	public Gusto setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
}
