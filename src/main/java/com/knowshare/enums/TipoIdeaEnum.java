/**
 * 
 */
package com.knowshare.enums;

import com.knowshare.entities.idea.Idea;

/**
 * Una {@link Idea} debe ser de cualquiera de estos 
 * tipos. 
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
	
	public String getNombre(){
		return nombre;
	}
}
