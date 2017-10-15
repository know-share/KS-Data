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
	
	private boolean arriba;
	
	private boolean recoBusqueda;
	
	public IdeaFact(String id , Double dist,boolean b,boolean reco){
		idIdea = id;
		distancia = dist;
		arriba = b;
		recoBusqueda = reco;
	}
	
	/**
	 * @return the arriba
	 */
	public boolean isArriba() {
		return arriba;
	}

	/**
	 * @param arriba the arriba to set
	 */
	public void setArriba(boolean arriba) {
		this.arriba = arriba;
	}

	/**
	 * @return the recoBusqueda
	 */
	public boolean isRecoBusqueda() {
		return recoBusqueda;
	}

	/**
	 * @param recoBusqueda the recoBusqueda to set
	 */
	public void setRecoBusqueda(boolean recoBusqueda) {
		this.recoBusqueda = recoBusqueda;
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
