/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.enums.TipoCualidadEnum;

/**
 * Cualidad que un usuario ha seleccionado como parte de
 * la construccion de su perfil
 * @author Miguel Montañez
 *
 */
@Document(collection = "cualidad")
public class Cualidad{
	
	@Id
	private ObjectId id;
	
	private String nombre;
	
	private TipoCualidadEnum tipo;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Cualidad setId(ObjectId id) {
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
	public Cualidad setNombre(String nombre) {
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
	public Cualidad setTipo(TipoCualidadEnum tipo) {
		this.tipo = tipo;
		return this;
	}
}
