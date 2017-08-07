/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

import com.knowshare.enums.TipoImagenEnum;

/**
 * Representa la imagen de perfil de un usuario
 * en la aplicación
 * @author Miguel Montañez
 *
 */
public class ImageProfile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String imageName;
	
	private TipoImagenEnum type;

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public ImageProfile setImageName(String imageName) {
		this.imageName = imageName;
		return this;
	}

	/**
	 * @return the type
	 */
	public TipoImagenEnum getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public ImageProfile setType(TipoImagenEnum type) {
		this.type = type;
		return this;
	}
}
