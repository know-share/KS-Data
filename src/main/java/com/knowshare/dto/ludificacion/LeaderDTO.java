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
	public void setId(String id) {
		this.id = id;
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
	public void setNombre(String carrera) {
		this.nombre = carrera;
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
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
	public void setAval(String aval) {
		this.aval = aval;
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
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	
}
