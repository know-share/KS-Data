/**
 * 
 */
package com.knowshare.dto.rules;

import java.io.Serializable;

import com.knowshare.fact.rules.TipoConexionEnum;

/**
 * DTO enviado a presentación con la información del usuario
 * que será recomendado al usuario actual.
 * @author Miguel Montañez
 *
 */
public class RecomendacionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String nombre;
	
	private TipoConexionEnum conexion;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public RecomendacionDTO setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public RecomendacionDTO setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the conexion
	 */
	public TipoConexionEnum getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public RecomendacionDTO setConexion(TipoConexionEnum conexion) {
		this.conexion = conexion;
		return this;
	}
}
