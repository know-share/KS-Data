/**
 * 
 */
package com.knowshare.dto.perfilusuario;

import java.io.Serializable;
import java.util.List;

import com.knowshare.dto.academia.CarreraDTO;
import com.knowshare.entities.academia.AreaConocimiento;
import com.knowshare.entities.perfilusuario.Cualidad;
import com.knowshare.entities.perfilusuario.Enfasis;
import com.knowshare.entities.perfilusuario.Gusto;
import com.knowshare.entities.perfilusuario.Personalidad;
import com.knowshare.enums.PreferenciaIdeaEnum;
import com.knowshare.enums.TipoUsuariosEnum;

/**
 * @author miguel
 *
 */
public class UsuarioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String password;
	
	private String username;
	
	private TipoUsuariosEnum tipoUsuario;
	
	private CarreraDTO carrera;
	
	private CarreraDTO segundaCarrera;
	
	private Integer semestre;
	
	private boolean seminario;
	
	private boolean temaTG;
	
	private Personalidad personalidad;
	
	private List<Gusto> gustos;
	
	private List<Enfasis> enfasis;
	
	private List<AreaConocimiento> areasConocimiento;
	
	private List<HabilidadDTO> habilidades;
	
	private List<Cualidad> cualidades;
	
	private PreferenciaIdeaEnum preferenciaIdea;

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
	public boolean isSeminario() {
		return seminario;
	}

	/**
	 * @param seminario the seminario to set
	 */
	public UsuarioDTO setSeminario(boolean seminario) {
		this.seminario = seminario;
		return this;
	}

	/**
	 * @return the temaTG
	 */
	public boolean isTemaTG() {
		return temaTG;
	}

	/**
	 * @param temaTG the temaTG to set
	 */
	public UsuarioDTO setTemaTG(boolean temaTG) {
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
	public List<Cualidad> getCualidades() {
		return cualidades;
	}

	/**
	 * @param cualidades the cualidades to set
	 */
	public UsuarioDTO setCualidades(List<Cualidad> cualidades) {
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
}
