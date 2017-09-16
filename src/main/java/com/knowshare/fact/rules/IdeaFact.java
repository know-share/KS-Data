/**
 * 
 */
package com.knowshare.fact.rules;

/**
 * Entidad que el motor de reglas reconoce y hace uso
 * para leer la información y poder aplicar la regla de
 * recomendación de ideas.
 * @author Pablo Gaitan
 *
 */
public class IdeaFact {
	
	private String idIdea;
	
	private Double distancia;
	
	private Boolean arriba;
	
	public IdeaFact(String id , Double dist,Boolean b){
		idIdea = id;
		distancia = dist;
		arriba = b;
	}
	
	/**
	 * @return the arriba
	 */
	public Boolean getArriba() {
		return arriba;
	}


	/**
	 * @param arriba the arriba to set
	 */
	public void setArriba(Boolean arriba) {
		this.arriba = arriba;
	}


	/**
	 * @return the idIdea
	 */
	public String getIdIdea() {
		return idIdea;
	}
	
	/**
	 * @param idIdea the idIdea to set
	 */
	public void setIdIdea(String idIdea) {
		this.idIdea = idIdea;
	}
	
	/**
	 * @return the distancia
	 */
	public Double getDistancia() {
		return distancia;
	}
	
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
}
