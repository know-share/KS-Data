/**
 * 
 */
package com.knowshare.enums;

/**
 * Relaciones entre cada personalidad que se describen en 
 * un documento.
 * @author Miguel Montañez
 *
 */
public enum TipoRelacionesPersonalidadEnum {
	
	DI("DI","Diferencias integrales"),
	CP("CP","Complementos potenciales"),
	OD("OD","Opuestos desafiantes"),
	EA("EA","Espiritus afines"),
	;
	
	String abreviacion;
	String nombre;
	
	TipoRelacionesPersonalidadEnum(String abreviacion,String nombre){
		this.abreviacion = abreviacion;
		this.nombre = nombre;
	}
	
	public static TipoRelacionesPersonalidadEnum valueOfAbr(String abreviacion){
		if(abreviacion.equals("DI"))
			return DI;
		if(abreviacion.equals("CP"))
			return CP;
		if(abreviacion.equals("OD"))
			return OD;
		return EA;
	}
}
