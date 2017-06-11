/**
 * 
 */
package com.knowshare.entities.academia;

/**
 * Esta clase es un documento embebido por cada usuario que 
 * da a conocer la formacion academica de un usuario
 * @author miguel
 *
 */
public class FormacionAcademica {
	
	private String titulo;
	
	private Integer anio;
	
	private String tituloTG;
	
	private String universidad;

	/**
	 * 
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * 
	 * @param titulo
	 * @return
	 */
	public FormacionAcademica setTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getAnio() {
		return anio;
	}

	/**
	 * 
	 * @param anio
	 * @return
	 */
	public FormacionAcademica setAnio(Integer anio) {
		this.anio = anio;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public String getTituloTG() {
		return tituloTG;
	}

	/**
	 * 
	 * @param tituloTG
	 * @return
	 */
	public FormacionAcademica setTituloTG(String tituloTG) {
		this.tituloTG = tituloTG;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public String getUniversidad() {
		return universidad;
	}

	/**
	 * 
	 * @param universidad
	 * @return
	 */
	public FormacionAcademica setUniversidad(String universidad) {
		this.universidad = universidad;
		return this;
	}
}
