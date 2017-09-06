/**
 * 
 */
package com.knowshare.dto.idea;

import com.knowshare.entities.idea.Idea;

/**
 * Representa el comentario que viene desde presentación
 * para luego ser mapeado a la entidad {@link Idea}
 * @author Pablo Gaitan
 *
 */
public class Comentario {
	
	private IdeaDTO idea;
	
	private String comentario;
	
	/**
	 * @return the idea
	 */
	public IdeaDTO getIdea() {
		return idea;
	}
	
	/**
	 * @param idea the idea to set
	 */
	public void setIdea(IdeaDTO idea) {
		this.idea = idea;
	}
	
	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}
	
	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
