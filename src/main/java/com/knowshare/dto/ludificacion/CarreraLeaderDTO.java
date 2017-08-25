package com.knowshare.dto.ludificacion;

public class CarreraLeaderDTO {

	private String id;
	private String carrera;
	private int cantidad;
	
	
	public CarreraLeaderDTO() {
		
	}


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
	public String getCarrera() {
		return carrera;
	}


	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
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
	
	
	
}
