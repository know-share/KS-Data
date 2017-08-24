/**
 * 
 */
package com.knowshare.entities.app;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Representa atributos generales en el sistema.
 * @author Miguel Montañez
 *
 */
@Document(collection="system_preferences")
public class SystemPreferences {

	// actua como un bit 1 = on, 0 = off
	private String id;
	
	private short rules;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the rules
	 */
	public short getRules() {
		return rules;
	}

	/**
	 * @param rules the rules to set
	 */
	public void setRules(short rules) {
		this.rules = rules;
	}	
}
