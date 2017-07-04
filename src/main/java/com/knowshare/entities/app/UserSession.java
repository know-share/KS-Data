/**
 * 
 */
package com.knowshare.entities.app;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Pablo Gaitan
 *
 */
@Document(collection="usersession")
public class UserSession {
	
	@Id
	private ObjectId id;
	
	private String username;
	
	private String token;
	
	private String secretKey;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public UserSession setId(ObjectId id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public UserSession setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public UserSession setToken(String token) {
		this.token = token;
		return this;
	}

	/**
	 * @return the secretKey
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * @param secretKey the secretKey to set
	 */
	public UserSession setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		return this;
	}
}
