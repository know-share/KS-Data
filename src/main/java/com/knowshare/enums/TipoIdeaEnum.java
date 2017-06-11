/**
 * 
 */
package com.knowshare.enums;

/**
 * @author miguel
 *
 */
public enum TipoIdeaEnum {
	
	PC("Para continuar"),
	PE("Para empezar"),
	PR("Proyecto"),
	NU("Nueva"),
	;

	String nombre;
	
	TipoIdeaEnum(String nombre){
		this.nombre = nombre;
	}
}
