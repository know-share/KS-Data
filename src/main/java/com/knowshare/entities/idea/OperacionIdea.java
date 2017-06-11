/**
 * 
 */
package com.knowshare.entities.idea;

import java.util.Date;

import com.knowshare.enums.TipoOperacionEnum;

/**
 * Sobre una idea se permiten algunas operaciones como
 * compartir y lights. Este registro permite guardar dicha 
 * informacion y quienes hicieron dicho operacion.
 * @author miguel
 *
 */
public class OperacionIdea {
	
	private String username;
	
	private TipoOperacionEnum tipo;
	
	private String contenido;
	
	private Date fecha;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public OperacionIdea setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoOperacionEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public OperacionIdea setTipo(TipoOperacionEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public OperacionIdea setContenido(String contenido) {
		this.contenido = contenido;
		return this;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public OperacionIdea setFecha(Date fecha) {
		this.fecha = fecha;
		return this;
	}
}
