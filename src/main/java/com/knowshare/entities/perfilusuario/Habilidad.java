/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.entities.academia.Carrera;
import com.knowshare.enums.TipoHabilidadEnum;

/**
 * Habilidades que un usuario puede tener dentro de la aplicacion para
 * completar la informacion de su perfil
 * @author Miguel Montañez
 *
 */
@Document(collection = "habilidad")
public class Habilidad{
	
	@Id
	private ObjectId id;
	
	private String nombre;
	
	private TipoHabilidadEnum tipo;
	
	@DBRef
	private Carrera carrera;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Habilidad setId(ObjectId id) {
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
	public Habilidad setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoHabilidadEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public Habilidad setTipo(TipoHabilidadEnum tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * @return the carrera
	 */
	public Carrera getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public Habilidad setCarrera(Carrera carrera) {
		this.carrera = carrera;
		return this;
	}
}
