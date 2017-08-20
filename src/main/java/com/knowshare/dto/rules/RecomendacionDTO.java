/**
 * 
 */
package com.knowshare.dto.rules;

import java.io.Serializable;

import com.knowshare.enums.TipoUsuariosEnum;
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
	
	private String carrera;
	
	private String genero;
	
	private Double porcentaje;
	
	private TipoUsuariosEnum tipoUsuario;
	
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
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public RecomendacionDTO setGenero(String genero) {
		this.genero = genero;
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
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public RecomendacionDTO setCarrera(String carrera) {
		this.carrera = carrera;
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

	/**
	 * @return the porcentaje
	 */
	public Double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public RecomendacionDTO setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
		return this;
	}

	/**
	 * @return the tipoUsuario
	 */
	public TipoUsuariosEnum getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public RecomendacionDTO setTipoUsuario(TipoUsuariosEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
		return this;
	}
}
