package com.knowshare.dto.ludificacion;

/**
 * Representa la carrera que se muestra en el leaderboard.
 * @author Felipe Bautista
 *
 */
public class LeaderDTO {

	private String id;
	
	private String nombre;
	
	private int cantidad;
	
	private String aval;
	
	private int pos = 0;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public LeaderDTO setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the carrera
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public LeaderDTO setNombre(String carrera) {
		this.nombre = carrera;
		return this;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public LeaderDTO setCantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	/**
	 * @return the aval
	 */
	public String getAval() {
		return aval;
	}

	/**
	 * @param aval the aval to set
	 */
	public LeaderDTO setAval(String aval) {
		this.aval = aval;
		return this;
	}

	/**
	 * @return the pos
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * @param pos the pos to set
	 */
	public LeaderDTO setPos(int pos) {
		this.pos = pos;
		return this;
	}
}
