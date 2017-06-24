/**
 * 
 */
package com.knowshare.dto.idea;

import java.util.List;

import org.bson.types.ObjectId;

import com.knowshare.entities.idea.Idea;
import com.knowshare.entities.idea.Tag;
import com.knowshare.entities.perfilusuario.Usuario;
import com.knowshare.enums.TipoIdeaEnum;

/**
 * @author pablo
 *
 */
public class IdeaDTO {
	
	private ObjectId id;
	
	private String contenido;
	
	private String estado;
	
	private String lugarEscritura;
	
	private TipoIdeaEnum tipo;
	
	private Integer numeroEstudiantes;
	
	private String alcance;
	
	private String problematica;

	private List<Idea> ideasProyecto;
	
	private Usuario usuario;
	
	private Long lights;
	
	private Long comentarios;
	
	private List<Tag> tags;

	
	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public IdeaDTO setId(ObjectId id) {
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
	public List<Idea> getIdeasProyecto() {
		return ideasProyecto;
	}

	/**
	 * @param ideasProyecto the ideasProyecto to set
	 */
	public IdeaDTO setIdeasProyecto(List<Idea> ideasProyecto) {
		this.ideasProyecto = ideasProyecto;
		return this;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public IdeaDTO setUsuario(Usuario usuario) {
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

}
