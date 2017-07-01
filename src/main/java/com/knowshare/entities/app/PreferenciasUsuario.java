/**
 * 
 */
package com.knowshare.entities.app;

import com.knowshare.enums.PreferenciaIdeaEnum;

/**
 * @author miguel
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
	public boolean isTemaTG() {
		return temaTG;
	}

	/**
	 * @param temaTG the temaTG to set
	 */
	public PreferenciasUsuario setTemaTG(boolean temaTG) {
		this.temaTG = temaTG;
		return this;
	}
}
