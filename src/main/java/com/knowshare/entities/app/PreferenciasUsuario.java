/**
 * 
 */
package com.knowshare.entities.app;

import com.knowshare.enums.PreferenciaIdeaEnum;

/**
 * Información relacionada con la aplicación, es decir,
 * preferencias que permiten mostrar cierta información
 * en pantalla según el tipo.
 * @author Miguel Montañez
 *
 */
public class PreferenciasUsuario {
	
	private PreferenciaIdeaEnum preferenciaIdea;
	
	private Boolean seminario;
	
	private Boolean temaTG;

	/**
	 * @return the preferenciaIdea
	 */
	public PreferenciaIdeaEnum getPreferenciaIdea() {
		return preferenciaIdea;
	}

	/**
	 * @param preferenciaIdea the preferenciaIdea to set
	 */
	public PreferenciasUsuario setPreferenciaIdea(PreferenciaIdeaEnum preferenciaIdea) {
		this.preferenciaIdea = preferenciaIdea;
		return this;
	}

	/**
	 * @return the seminario
	 */
	public Boolean isSeminario() {
		return seminario;
	}

	/**
	 * @param seminario the seminario to set
	 */
	public PreferenciasUsuario setSeminario(Boolean seminario) {
		this.seminario = seminario;
		return this;
	}

	/**
	 * @return the temaTG
	 */
	public Boolean isTemaTG() {
		return temaTG;
	}

	/**
	 * @param temaTG the temaTG to set
	 */
	public PreferenciasUsuario setTemaTG(Boolean temaTG) {
		this.temaTG = temaTG;
		return this;
	}
}
