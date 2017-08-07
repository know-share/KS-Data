/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.entities.academia.AreaConocimiento;
import com.knowshare.entities.academia.Carrera;
import com.knowshare.entities.academia.FormacionAcademica;
import com.knowshare.entities.academia.TrabajoGrado;
import com.knowshare.entities.app.PreferenciasUsuario;
import com.knowshare.entities.ludificacion.CualidadAval;
import com.knowshare.entities.ludificacion.HabilidadAval;
import com.knowshare.entities.ludificacion.Insignia;
import com.knowshare.entities.ludificacion.UsuarioAval;
import com.knowshare.enums.TipoProfesorEnum;
import com.knowshare.enums.TipoUsuariosEnum;

/**
 * Representa la informacion de un usuario dentro de la aplicacion
 * @author Miguel Montañez
 *
 */
@Document(collection = "usuario")
public class Usuario{

	@Id
	private ObjectId id;
	
	@Indexed(unique=true)
	private String username;
	
	private String password;
	
	private String nombre;
	
	private String apellido;
	
	private String genero;
	
	@Indexed(unique=true)
	private String correo;
	
	private Date fechaNacimiento;
	
	private TipoUsuariosEnum tipo;
	
	private String grupoInvestigacion;
	
	private TipoProfesorEnum tipoProfesor;
	
	private String disponibilidad;
	
	private String estado;
	
	private Integer semestre;
	
	private List<FormacionAcademica> formacionesAcademicas;
	
	@DBRef
	private List<Gusto> gustos;
	
	private List<HabilidadAval> habilidades;
	
	private List<UsuarioAval> personasAvaladas;
	
	@DBRef
	// A lo mucho 2 carreras
	private List<Carrera> carreras;
	
	// A lo mucho habrán 4 énfasis
	private List<Enfasis> enfasis;
	
	private List<AreaConocimiento> areasConocimiento;
	
	private List<CualidadAval> cualidadesProfesor;
	
	@DBRef
	private List<Insignia> insignias;
	
	@DBRef(lazy = true)
	private List<TrabajoGrado> trabajosGrado;
	
	@DBRef(lazy = true)
	private List<TrabajoGrado> trabajosGradoDirigidos;
	
	private List<InfoUsuario> amigos;
	
	private List<InfoUsuario> seguidores;
	
	private List<InfoUsuario> siguiendo;
	
	private List<String> solicitudesAmistad;
	
	@DBRef
	private Personalidad personalidad;
	
	private PreferenciasUsuario preferencias;
	
	private ImageProfile imagen;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Usuario setId(ObjectId id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public Usuario setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

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
	public List<CualidadAval> getCualidadesProfesor() {
		return cualidadesProfesor;
	}

	/**
	 * @param cualidades the cualidades to set
	 */
	public Usuario setCualidadesProfesor(List<CualidadAval> cualidadesProfesor) {
		this.cualidadesProfesor = cualidadesProfesor;
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
	public List<InfoUsuario> getAmigos() {
		return amigos;
	}

	/**
	 * @param amigos the amigos to set
	 */
	public Usuario setAmigos(List<InfoUsuario> amigos) {
		this.amigos = amigos;
		return this;
	}

	/**
	 * @return the seguidores
	 */
	public List<InfoUsuario> getSeguidores() {
		return seguidores;
	}

	/**
	 * @param seguidores the seguidores to set
	 */
	public Usuario setSeguidores(List<InfoUsuario> seguidores) {
		this.seguidores = seguidores;
		return this;
	}

	/**
	 * @return the personalidad
	 */
	public Personalidad getPersonalidad() {
		return personalidad;
	}

	/**
	 * @param personalidad the personalidad to set
	 */
	public Usuario setPersonalidad(Personalidad personalidad) {
		this.personalidad = personalidad;
		return this;
	}

	/**
	 * @return the preferencias
	 */
	public PreferenciasUsuario getPreferencias() {
		return preferencias;
	}

	/**
	 * @param preferencias the preferencias to set
	 */
	public Usuario setPreferencias(PreferenciasUsuario preferencias) {
		this.preferencias = preferencias;
		return this;
	}

	/**
	 * @return the areasConocimiento
	 */
	public List<AreaConocimiento> getAreasConocimiento() {
		return areasConocimiento;
	}

	/**
	 * @param areasConocimiento the areasConocimiento to set
	 */
	public Usuario setAreasConocimiento(List<AreaConocimiento> areasConocimiento) {
		this.areasConocimiento = areasConocimiento;
		return this;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public Usuario setPassword(String password) {
		this.password = password;
		return this;
	}
	
	/**
	 * @return the solicitudesAmistad
	 */
	public List<String> getSolicitudesAmistad() {
		return solicitudesAmistad;
	}

	/**
	 * @param solicitudesAmistad the solicitudesAmistad to set
	 */
	public Usuario setSolicitudesAmistad(List<String> solicitudesAmistad) {
		this.solicitudesAmistad = solicitudesAmistad;
		return this;
	}

	/**
	 * @return the siguiendo
	 */
	public List<InfoUsuario> getSiguiendo() {
		return siguiendo;
	}

	/**
	 * @param siguiendo the siguiendo to set
	 */
	public Usuario setSiguiendo(List<InfoUsuario> siguiendo) {
		this.siguiendo = siguiendo;
		return this;
	}
	
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public Usuario setGenero(String genero) {
		this.genero = genero;
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj != null && this.id.equals(((Usuario)obj).getId()));
	}

	/**
	 * @return the imagen
	 */
	public ImageProfile getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(ImageProfile imagen) {
		this.imagen = imagen;
	}
}
