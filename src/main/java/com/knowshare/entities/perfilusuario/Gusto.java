/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.enums.TipoGustoEnum;

/**
 * Gustos que un usuario puede tener dentro de la aplicacion para
 * completar la informacion de su perfil
 * @author miguel
 *
 */
@Document(collection = "gusto")
public class Gusto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	private TipoGustoEnum tipo;
	
	private String imagePath;

	/**
	 * @return the nombre
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public Gusto setId(ObjectId id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoGustoEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public Gusto setTipo(TipoGustoEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public Gusto setImagePath(String imagePath) {
		this.imagePath = imagePath;
		return this;
	}
}
