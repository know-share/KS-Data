/**
 * 
 */
package com.knowshare.entities.idea;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.entities.perfilusuario.Usuario;
import com.knowshare.enums.TipoIdeaEnum;

/**
 * Representa una idea con su diferente informacion, el id
 * es el que mongo autogenera.
 * @author miguel
 *
 */
@Document(collection="idea")
public class Idea {

	@Id
	private ObjectId id;
	
	private String contenido;
	
	private String estado;
	
	private Date fechaCreacion;
	
	private String lugarEscritura;
	
	private TipoIdeaEnum tipo;
	
	private Integer numeroEstudiantes;
	
	private String alcance;
	
	private String problematica;
	
	@DBRef(lazy=true)
	private List<Idea> ideasProyecto;
	
	@DBRef
	private Usuario usuario;
	
	private Long lights;
	
	private Long comentarios;
	
	private List<OperacionIdea> operaciones;
	
	@DBRef
	private List<Tag> tags;
	
	public Idea(){
		operaciones = new ArrayList<>();
		tags = new ArrayList<>();
		lights = new Long(0);
		comentarios = new Long(0);
	}

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Idea setId(ObjectId id) {
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
	public Idea setContenido(String contenido) {
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
	public Idea setEstado(String estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public Idea setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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
	public Idea setLugarEscritura(String lugarEscritura) {
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
	public Idea setTipo(TipoIdeaEnum tipo) {
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
	public Idea setNumeroEstudiantes(Integer numeroEstudiantes) {
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
	public Idea setAlcance(String alcance) {
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
	public Idea setProblematica(String problematica) {
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
	public Idea setIdeasProyecto(List<Idea> ideasProyecto) {
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
	public Idea setUsuario(Usuario usuario) {
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
	public Idea setLights(Long lights) {
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
	public Idea setComentarios(Long comentarios) {
		this.comentarios = comentarios;
		return this;
	}

	/**
	 * @return the operaciones
	 */
	public List<OperacionIdea> getOperaciones() {
		return operaciones;
	}

	/**
	 * @param operaciones the operaciones to set
	 */
	public Idea setOperaciones(List<OperacionIdea> operaciones) {
		this.operaciones = operaciones;
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
	public Idea setTags(List<Tag> tags) {
		this.tags = tags;
		return this;
	}
}
