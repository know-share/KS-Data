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
	
	private boolean seminario;
	
	private boolean temaTG;

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
	public boolean isSeminario() {
		return seminario;
	}

	/**
	 * @param seminario the seminario to set
	 */
	public PreferenciasUsuario setSeminario(boolean seminario) {
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
