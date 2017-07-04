/**
 * 
 */
package com.knowshare.entities.ludificacion;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.knowshare.entities.perfilusuario.Cualidad;
import com.knowshare.entities.perfilusuario.Habilidad;
import com.knowshare.entities.perfilusuario.Usuario;
import com.knowshare.enums.TipoAvalEnum;

/**
 * Cada vez que un usuario avala la habilidad o cualidad de
 * otro usuario, se crea un registro que es representado por
 * esta clase.
 * @author miguel
 *
 */
public class UsuarioAval{
	
	@DBRef
	private Usuario usuario;
	
	private TipoAvalEnum tipo;
	
	@DBRef
	private Cualidad cualidad;
	
	@DBRef
	private Habilidad habilidad;

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public UsuarioAval setUsuario(Usuario usuario) {
		this.usuario = usuario;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoAvalEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public UsuarioAval setTipo(TipoAvalEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the cantidad
	 */
	public Cualidad getCualidad() {
		return cualidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public UsuarioAval setCualidad(Cualidad cualidad) {
		this.cualidad = cualidad;
		return this;
	}

	/**
	 * @return the habilidad
	 */
	public Habilidad getHabilidad() {
		return habilidad;
	}

	/**
	 * @param habilidad the habilidad to set
	 */
	public UsuarioAval setHabilidad(Habilidad habilidad) {
		this.habilidad = habilidad;
		return this;
	}
}
