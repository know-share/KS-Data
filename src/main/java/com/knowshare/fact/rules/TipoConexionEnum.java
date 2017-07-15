/**
 * 
 */
package com.knowshare.fact.rules;

/**
 * @author miguel
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
