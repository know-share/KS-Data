/**
 * 
 */
package com.knowshare.entities.ludificacion;

import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Representa la insignia que tiene un usuario,
 * además permite saber si la insignia ya fue vista por él.
 * @author Miguel Montañez
 *
 */
public class InsigniaPreview {
	
	private boolean visto;
	
	@DBRef
	private Insignia insignia;

	/**
	 * @return the visto
	 */
	public boolean isVisto() {
		return visto;
	}

	/**
	 * @param visto the visto to set
	 */
	public InsigniaPreview setVisto(boolean visto) {
		this.visto = visto;
		return this;
	}

	/**
	 * @return the insignia
	 */
	public Insignia getInsignia() {
		return insignia;
	}

	/**
	 * @param insignia the insignia to set
	 */
	public InsigniaPreview setInsignia(Insignia insignia) {
		this.insignia = insignia;
		return this;
	}
}
