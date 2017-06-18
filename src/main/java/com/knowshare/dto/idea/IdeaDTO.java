/**
 * 
 */
package com.knowshare.dto.idea;

import java.util.Date;
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
	public void setId(ObjectId id) {
		this.id = id;
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
	public void setContenido(String contenido) {
		this.contenido = contenido;
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
	public void setEstado(String estado) {
		this.estado = estado;
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
	public void setLugarEscritura(String lugarEscritura) {
		this.lugarEscritura = lugarEscritura;
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
	public void setTipo(TipoIdeaEnum tipo) {
		this.tipo = tipo;
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
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
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
	public void setAlcance(String alcance) {
		this.alcance = alcance;
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
	public void setProblematica(String problematica) {
		this.problematica = problematica;
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
	public void setIdeasProyecto(List<Idea> ideasProyecto) {
		this.ideasProyecto = ideasProyecto;
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
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
	public void setLights(Long lights) {
		this.lights = lights;
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
	public void setComentarios(Long comentarios) {
		this.comentarios = comentarios;
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
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	

}
