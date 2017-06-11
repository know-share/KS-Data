/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.entities.academia.Carrera;
import com.knowshare.entities.academia.Enfasis;
import com.knowshare.entities.academia.FormacionAcademica;
import com.knowshare.entities.academia.TrabajoGrado;
import com.knowshare.entities.ludificacion.CualidadAval;
import com.knowshare.entities.ludificacion.HabilidadAval;
import com.knowshare.entities.ludificacion.Insignia;
import com.knowshare.entities.ludificacion.UsuarioAval;
import com.knowshare.enums.TipoProfesorEnum;
import com.knowshare.enums.TipoUsuariosEnum;

/**
 * Representa la informacion de un usuario dentro de la aplicacion
 * @author miguel
 *
 */
@Document(collection = "usuario")
public class Usuario{

	@Id
	private String username;
	
	private String apellido;
	
	private String correo;
	
	private Date fechaNacimiento;
	
	private TipoUsuariosEnum tipo;
	
	private String grupoInvestigacion;
	
	private TipoProfesorEnum tipoProfesor;
	
	private String disponibilidad;
	
	private Integer periodoTG;
	
	private String estado;
	
	private Integer semestre;
	
	private List<FormacionAcademica> formacionesAcademicas;
	
	@DBRef
	private List<Gusto> gustos;
	
	private List<HabilidadAval> habilidades;
	
	private List<UsuarioAval> personasAvaladas;
	
	@DBRef
	private List<Carrera> carreras;
	
	@DBRef
	private List<Enfasis> enfasis;
	
	private List<CualidadAval> cualidades;
	
	@DBRef
	private List<Insignia> insignias;
	
	@DBRef(lazy = true)
	private List<TrabajoGrado> trabajosGrado;
	
	@DBRef(lazy = true)
	private List<TrabajoGrado> trabajosGradoDirigidos;
	
	private Amigos amigos;
	
	private Amigos seguidores;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public Usuario setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public Usuario setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public Usuario setCorreo(String correo) {
		this.correo = correo;
		return this;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public Usuario setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoUsuariosEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public Usuario setTipo(TipoUsuariosEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the grupoInvestigacion
	 */
	public String getGrupoInvestigacion() {
		return grupoInvestigacion;
	}

	/**
	 * @param grupoInvestigacion the grupoInvestigacion to set
	 */
	public Usuario setGrupoInvestigacion(String grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
		return this;
	}

	/**
	 * @return the tipoProfesor
	 */
	public TipoProfesorEnum getTipoProfesor() {
		return tipoProfesor;
	}

	/**
	 * @param tipoProfesor the tipoProfesor to set
	 */
	public Usuario setTipoProfesor(TipoProfesorEnum tipoProfesor) {
		this.tipoProfesor = tipoProfesor;
		return this;
	}

	/**
	 * @return the disponibilidad
	 */
	public String getDisponibilidad() {
		return disponibilidad;
	}

	/**
	 * @param disponibilidad the disponibilidad to set
	 */
	public Usuario setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
		return this;
	}

	/**
	 * @return the periodoTG
	 */
	public Integer getPeriodoTG() {
		return periodoTG;
	}

	/**
	 * @param periodoTG the periodoTG to set
	 */
	public Usuario setPeriodoTG(Integer periodoTG) {
		this.periodoTG = periodoTG;
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
	public Usuario setEstado(String estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * @return the semestre
	 */
	public Integer getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre the semestre to set
	 */
	public Usuario setSemestre(Integer semestre) {
		this.semestre = semestre;
		return this;
	}

	/**
	 * @return the formacionesAcademicas
	 */
	public List<FormacionAcademica> getFormacionesAcademicas() {
		return formacionesAcademicas;
	}

	/**
	 * @param formacionesAcademicas the formacionesAcademicas to set
	 */
	public Usuario setFormacionesAcademicas(List<FormacionAcademica> formacionesAcademicas) {
		this.formacionesAcademicas = formacionesAcademicas;
		return this;
	}

	/**
	 * @return the gustos
	 */
	public List<Gusto> getGustos() {
		return gustos;
	}

	/**
	 * @param gustos the gustos to set
	 */
	public Usuario setGustos(List<Gusto> gustos) {
		this.gustos = gustos;
		return this;
	}

	/**
	 * @return the habilidades
	 */
	public List<HabilidadAval> getHabilidades() {
		return habilidades;
	}

	/**
	 * @param habilidades the habilidades to set
	 */
	public Usuario setHabilidades(List<HabilidadAval> habilidades) {
		this.habilidades = habilidades;
		return this;
	}

	/**
	 * @return the personasAvaladas
	 */
	public List<UsuarioAval> getPersonasAvaladas() {
		return personasAvaladas;
	}

	/**
	 * @param personasAvaladas the personasAvaladas to set
	 */
	public Usuario setPersonasAvaladas(List<UsuarioAval> personasAvaladas) {
		this.personasAvaladas = personasAvaladas;
		return this;
	}

	/**
	 * @return the carreras
	 */
	public List<Carrera> getCarreras() {
		return carreras;
	}

	/**
	 * @param carreras the carreras to set
	 */
	public Usuario setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
		return this;
	}

	/**
	 * @return the enfasis
	 */
	public List<Enfasis> getEnfasis() {
		return enfasis;
	}

	/**
	 * @param enfasis the enfasis to set
	 */
	public Usuario setEnfasis(List<Enfasis> enfasis) {
		this.enfasis = enfasis;
		return this;
	}

	/**
	 * @return the cualidades
	 */
	public List<CualidadAval> getCualidades() {
		return cualidades;
	}

	/**
	 * @param cualidades the cualidades to set
	 */
	public Usuario setCualidades(List<CualidadAval> cualidades) {
		this.cualidades = cualidades;
		return this;
	}

	/**
	 * @return the insignias
	 */
	public List<Insignia> getInsignias() {
		return insignias;
	}

	/**
	 * @param insignias the insignias to set
	 */
	public Usuario setInsignias(List<Insignia> insignias) {
		this.insignias = insignias;
		return this;
	}

	/**
	 * @return the trabajosGrado
	 */
	public List<TrabajoGrado> getTrabajosGrado() {
		return trabajosGrado;
	}

	/**
	 * @param trabajosGrado the trabajosGrado to set
	 */
	public Usuario setTrabajosGrado(List<TrabajoGrado> trabajosGrado) {
		this.trabajosGrado = trabajosGrado;
		return this;
	}

	/**
	 * @return the trabajosGradoDirigidos
	 */
	public List<TrabajoGrado> getTrabajosGradoDirigidos() {
		return trabajosGradoDirigidos;
	}

	/**
	 * @param trabajosGradoDirigidos the trabajosGradoDirigidos to set
	 */
	public Usuario setTrabajosGradoDirigidos(List<TrabajoGrado> trabajosGradoDirigidos) {
		this.trabajosGradoDirigidos = trabajosGradoDirigidos;
		return this;
	}

	/**
	 * @return the amigos
	 */
	public Amigos getAmigos() {
		return amigos;
	}

	/**
	 * @param amigos the amigos to set
	 */
	public Usuario setAmigos(Amigos amigos) {
		this.amigos = amigos;
		return this;
	}

	/**
	 * @return the seguidores
	 */
	public Amigos getSeguidores() {
		return seguidores;
	}

	/**
	 * @param seguidores the seguidores to set
	 */
	public Usuario setSeguidores(Amigos seguidores) {
		this.seguidores = seguidores;
		return this;
	}
}
