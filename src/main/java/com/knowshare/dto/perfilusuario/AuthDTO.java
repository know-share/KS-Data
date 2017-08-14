/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import java.io.Serializable;

/**
 * Información que es enviada en el momento de la autenticación
 * de un usuario frente a la aplicación. La contraseña viaja
 * en texto plano, por lo que se requiere un canal seguro entre
 * cliente y servidor.
 * @author Pablo Gaitan
 *
 */
public class AuthDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public AuthDTO setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public AuthDTO setPassword(String password) {
		this.password = password;
		return this;
	}
}
