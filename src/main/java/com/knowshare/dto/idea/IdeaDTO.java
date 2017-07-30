/**
 * 
 */
package com.knowshare.dto.idea;

import java.util.List;

import com.knowshare.entities.idea.Idea;
import com.knowshare.entities.idea.Tag;
import com.knowshare.enums.TipoIdeaEnum;

/**
 * Clase que es enviada de cliente a servidor y viceversa
 * que mapea las propiedades principales de {@link Idea}
 * @author Pablo Gaitan
 *
 */
public class IdeaDTO {
	
	private String id;
	
	private String contenido;
	
	private String estado;//TG y NTG
	
	private String lugarEscritura;
	
	private TipoIdeaEnum tipo;
	
	private Integer numeroEstudiantes;
	
	private String alcance;
	
	private String problematica;

	private List<IdeaDTO> ideasProyecto;
	
	private String usuario;
	
	private Long lights;
	
	private Long comentarios;
	
	private List<Tag> tags;
	
	private boolean isLight;

	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public IdeaDTO setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public IdeaDTO setContenido(String contenido) {
		this.contenido = contenido;
		return this;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public IdeaDTO setEstado(String estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * @return the lugarEscritura
	 */
	public String getLugarEscritura() {
		return lugarEscritura;
	}

	/**
	 * @param lugarEscritura the lugarEscritura to set
	 */
	public IdeaDTO setLugarEscritura(String lugarEscritura) {
		this.lugarEscritura = lugarEscritura;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoIdeaEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public IdeaDTO setTipo(TipoIdeaEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the numeroEstudiantes
	 */
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	/**
	 * @param numeroEstudiantes the numeroEstudiantes to set
	 */
	public IdeaDTO setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
		return this;
	}

	/**
	 * @return the alcance
	 */
	public String getAlcance() {
		return alcance;
	}

	/**
	 * @param alcance the alcance to set
	 */
	public IdeaDTO setAlcance(String alcance) {
		this.alcance = alcance;
		return this;
	}

	/**
	 * @return the problematica
	 */
	public String getProblematica() {
		return problematica;
	}

	/**
	 * @param problematica the problematica to set
	 */
	public IdeaDTO setProblematica(String problematica) {
		this.problematica = problematica;
		return this;
	}

	/**
	 * @return the ideasProyecto
	 */
	public List<IdeaDTO> getIdeasProyecto() {
		return ideasProyecto;
	}

	/**
	 * @param ideasProyecto the ideasProyecto to set
	 */
	public IdeaDTO setIdeasProyecto(List<IdeaDTO> ideasProyecto) {
		this.ideasProyecto = ideasProyecto;
		return this;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public IdeaDTO setUsuario(String usuario) {
		this.usuario = usuario;
		return this;
	}

	/**
	 * @return the lights
	 */
	public Long getLights() {
		return lights;
	}

	/**
	 * @param lights the lights to set
	 */
	public IdeaDTO setLights(Long lights) {
		this.lights = lights;
		return this;
	}

	/**
	 * @return the comentarios
	 */
	public Long getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios the comentarios to set
	 */
	public IdeaDTO setComentarios(Long comentarios) {
		this.comentarios = comentarios;
		return this;
	}

	/**
	 * @return the tags
	 */
	public List<Tag> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public IdeaDTO setTags(List<Tag> tags) {
		this.tags = tags;
		return this;
	}

	/**
	 * @return the isLight
	 */
	public boolean isIsLight() {
		return isLight;
	}

	/**
	 * @param isLight the isLight to set
	 */
	public void setIsLight(boolean isLight) {
		this.isLight = isLight;
	}
}
