/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Clase que representa tanto amigos como seguidores
 * que un usuario tiene en el sistema.
 * @author miguel
 *
 */
public class Amigos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer cantidad;
	
	@DBRef
	private List<Usuario> amigos;
	
	public Amigos(){
		cantidad = 0;
		amigos = new ArrayList<>();
	}
	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public Amigos setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	/**
	 * @return the amigos
	 */
	public List<Usuario> getAmigos() {
		return amigos;
	}

	/**
	 * @param amigos the amigos to set
	 */
	public Amigos setAmigos(List<Usuario> amigos) {
		this.amigos = amigos;
		return this;
	}
	
	
}
