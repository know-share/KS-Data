/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import com.knowshare.enums.TipoImagenEnum;

/**
 * Representa propiedades básicas para ser enviadas al 
 * API
 * @author Miguel Montañez
 *
 */
public class ImagenDTO {
	
	private byte[] bytes;
	
	private TipoImagenEnum type;
	
	private boolean result;

	/**
	 * @return the bytes
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * @param bytes the bytes to set
	 */
	public ImagenDTO setBytes(byte[] bytes) {
		this.bytes = bytes;
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
	public ImagenDTO setType(TipoImagenEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public ImagenDTO setResult(boolean result) {
		this.result = result;
		return this;
	}
}
