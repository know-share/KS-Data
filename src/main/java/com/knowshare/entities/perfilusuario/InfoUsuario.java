/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

/**
 * Subdocumento que reune información de un usuario, 
 * de forma sencilla para poder mostrar e identificar
 * a un usuario en la aplicación.
 * @author Miguel Montañez
 *
 */
public class InfoUsuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String nombre;
	
	private String carrera;
	
	private String genero;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public InfoUsuario setUsername(String username) {
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
	public InfoUsuario setNombre(String nombre) {
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
	public InfoUsuario setCarrera(String carrera) {
		this.carrera = carrera;
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoUsuario other = (InfoUsuario) obj;
		if (nombre == null && other.nombre != null) {
			return false;
		}
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
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
	public InfoUsuario setGenero(String genero) {
		this.genero = genero;
		return this;
	}

	public boolean equals(String usuario){
		return this.username.equalsIgnoreCase(usuario);
	}
}
