/**
 * 
 */
package com.knowshare.fact.rules;

/**
 * @author miguel
 *
 */
public class UsuarioFact {

	private String username;
	
	private Double distancia;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public UsuarioFact setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the distancia
	 */
	public Double getDistancia() {
		return distancia;
	}

	/**
	 * @param distancia the distancia to set
	 */
	public UsuarioFact setDistancia(Double distancia) {
		this.distancia = distancia;
		return this;
	}
}
