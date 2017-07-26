/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

import com.knowshare.dto.academia.CarreraDTO;
import com.knowshare.entities.academia.AreaConocimiento;
import com.knowshare.entities.academia.FormacionAcademica;
import com.knowshare.entities.academia.TrabajoGrado;
import com.knowshare.entities.perfilusuario.Enfasis;
import com.knowshare.entities.perfilusuario.Gusto;
import com.knowshare.entities.perfilusuario.InfoUsuario;
import com.knowshare.entities.perfilusuario.Personalidad;
import com.knowshare.entities.perfilusuario.Usuario;
import com.knowshare.enums.PreferenciaIdeaEnum;
import com.knowshare.enums.TipoUsuariosEnum;

/**
 * Clase que mapea las principales propiedades de la
 * entidad {@link Usuario} para ser enviada a presentación.
 * @author Miguel Montañez
 *
 */
public class UsuarioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ObjectId id;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String password;
	
	private String username;
	
	private TipoUsuariosEnum tipoUsuario;
	
	private CarreraDTO carrera;
	
	private CarreraDTO segundaCarrera;
	
	private Integer semestre;
	
	private Boolean seminario;
	
	private Boolean temaTG;
	
	private Personalidad personalidad;
	
	private List<Gusto> gustos;
	
	private List<Enfasis> enfasis;
	
	private List<AreaConocimiento> areasConocimiento;
	
	private List<HabilidadDTO> habilidades;
	
	private List<CualidadDTO> cualidades;
	
	private PreferenciaIdeaEnum preferenciaIdea;
	
	private Integer cantidadAmigos;
	
	private List<InfoUsuario> amigos;
	
	private Integer cantidadSeguidores;
	
	private List<InfoUsuario> seguidores;
	
	private List<InfoUsuario> siguiendo;
	
	private List<String> insignias;
	
	private List<String> solicitudesAmistad;
	
	private List<TrabajoGrado> tgDirigidos;
	
	private List<FormacionAcademica> formacionAcademica;
	
	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public UsuarioDTO setId(ObjectId id) {
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
	public UsuarioDTO setNombre(String nombre) {
		this.nombre = nombre;
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
	public UsuarioDTO setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public UsuarioDTO setEmail(String email) {
		this.email = email;
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
	public UsuarioDTO setPassword(String password) {
		this.password = password;
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
	public UsuarioDTO setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * @return the tipoUsuario
	 */
	public TipoUsuariosEnum getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public UsuarioDTO setTipoUsuario(TipoUsuariosEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
		return this;
	}

	/**
	 * @return the carrera
	 */
	public CarreraDTO getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public UsuarioDTO setCarrera(CarreraDTO carrera) {
		this.carrera = carrera;
		return this;
	}

	/**
	 * @return the segundaCarrera
	 */
	public CarreraDTO getSegundaCarrera() {
		return segundaCarrera;
	}

	/**
	 * @param segundaCarrera the segundaCarrera to set
	 */
	public UsuarioDTO setSegundaCarrera(CarreraDTO segundaCarrera) {
		this.segundaCarrera = segundaCarrera;
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
	public UsuarioDTO setSemestre(Integer semestre) {
		this.semestre = semestre;
		return this;
	}

	/**
	 * @return the seminario
	 */
	public Boolean isSeminario() {
		return seminario;
	}

	/**
	 * @param seminario the seminario to set
	 */
	public UsuarioDTO setSeminario(Boolean seminario) {
		this.seminario = seminario;
		return this;
	}

	/**
	 * @return the temaTG
	 */
	public Boolean isTemaTG() {
		return temaTG;
	}

	/**
	 * @param temaTG the temaTG to set
	 */
	public UsuarioDTO setTemaTG(Boolean temaTG) {
		this.temaTG = temaTG;
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
	public UsuarioDTO setPersonalidad(Personalidad personalidad) {
		this.personalidad = personalidad;
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
	public UsuarioDTO setGustos(List<Gusto> gustos) {
		this.gustos = gustos;
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
	public UsuarioDTO setEnfasis(List<Enfasis> enfasis) {
		this.enfasis = enfasis;
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
	public UsuarioDTO setAreasConocimiento(List<AreaConocimiento> areasConocimiento) {
		this.areasConocimiento = areasConocimiento;
		return this;
	}

	/**
	 * @return the habilidades
	 */
	public List<HabilidadDTO> getHabilidades() {
		return habilidades;
	}

	/**
	 * @param habilidades the habilidades to set
	 */
	public UsuarioDTO setHabilidades(List<HabilidadDTO> habilidades) {
		this.habilidades = habilidades;
		return this;
	}

	/**
	 * @return the cualidades
	 */
	public List<CualidadDTO> getCualidades() {
		return cualidades;
	}

	/**
	 * @param cualidades the cualidades to set
	 */
	public UsuarioDTO setCualidades(List<CualidadDTO> cualidades) {
		this.cualidades = cualidades;
		return this;
	}

	/**
	 * @return the preferenciaIdea
	 */
	public PreferenciaIdeaEnum getPreferenciaIdea() {
		return preferenciaIdea;
	}

	/**
	 * @param preferenciaIdea the preferenciaIdea to set
	 */
	public UsuarioDTO setPreferenciaIdea(PreferenciaIdeaEnum preferenciaIdea) {
		this.preferenciaIdea = preferenciaIdea;
		return this;
	}

	/**
	 * @return the cantidadAmigos
	 */
	public Integer getCantidadAmigos() {
		return cantidadAmigos;
	}

	/**
	 * @param cantidadAmigos the cantidadAmigos to set
	 */
	public UsuarioDTO setCantidadAmigos(Integer cantidadAmigos) {
		this.cantidadAmigos = cantidadAmigos;
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
	public UsuarioDTO setAmigos(List<InfoUsuario> amigos) {
		this.amigos = amigos;
		return this;
	}

	/**
	 * @return the cantidadSeguidores
	 */
	public Integer getCantidadSeguidores() {
		return cantidadSeguidores;
	}

	/**
	 * @param cantidadSeguidores the cantidadSeguidores to set
	 */
	public UsuarioDTO setCantidadSeguidores(Integer cantidadSeguidores) {
		this.cantidadSeguidores = cantidadSeguidores;
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
	public UsuarioDTO setSeguidores(List<InfoUsuario> seguidores) {
		this.seguidores = seguidores;
		return this;
	}

	/**
	 * @return the insignias
	 */
	public List<String> getInsignias() {
		return insignias;
	}

	/**
	 * @param insignias the insignias to set
	 */
	public UsuarioDTO setInsignias(List<String> insignias) {
		this.insignias = insignias;
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
	public UsuarioDTO setSolicitudesAmistad(List<String> solicitudesAmistad) {
		this.solicitudesAmistad = solicitudesAmistad;
		return this;
	}

	/**
	 * @return the tgDirigidos
	 */
	public List<TrabajoGrado> getTgDirigidos() {
		return tgDirigidos;
	}

	/**
	 * @param tgDirigidos the tgDirigidos to set
	 */
	public UsuarioDTO setTgDirigidos(List<TrabajoGrado> tgDirigidos) {
		this.tgDirigidos = tgDirigidos;
		return this;
	}

	/**
	 * @return the formacionAcademia
	 */
	public List<FormacionAcademica> getFormacionAcademica() {
		return formacionAcademica;
	}

	/**
	 * @param formacionAcademia the formacionAcademia to set
	 */
	public UsuarioDTO setFormacionAcademica(List<FormacionAcademica> formacionAcademica) {
		this.formacionAcademica = formacionAcademica;
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
	public UsuarioDTO setSiguiendo(List<InfoUsuario> siguiendo) {
		this.siguiendo = siguiendo;
		return this;
	}
}
