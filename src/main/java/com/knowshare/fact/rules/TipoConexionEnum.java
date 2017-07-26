/**
 * 
 */
package com.knowshare.fact.rules;

/**
 * Tipos de las conexiones entre usuarios que se
 * pueden dar.
 * @author Miguel Montañez
 *
 */
public enum TipoConexionEnum {

	CONFIANZA("CONFIANZA"),
	RELEVANTE("RELEVANTE"),
	NO_RECOMENDAR("NO_RECOMENDAR");
	
	private String value;
	
	TipoConexionEnum(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
