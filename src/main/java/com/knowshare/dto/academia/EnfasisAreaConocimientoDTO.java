/**
 * 
 */
package com.knowshare.dto.academia;

import java.io.Serializable;
import java.util.List;

/**
 * @author miguel
 *
 */
public class EnfasisAreaConocimientoDTO implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> enfasis;
	
	private List<String> areaConocimiento;

	/**
	 * @return the enfasis
	 */
	public List<String> getEnfasis() {
		return enfasis;
	}

	/**
	 * @param enfasis the enfasis to set
	 */
	public EnfasisAreaConocimientoDTO setEnfasis(List<String> enfasis) {
		this.enfasis = enfasis;
		return this;
	}

	/**
	 * @return the areaConocimiento
	 */
	public List<String> getAreaConocimiento() {
		return areaConocimiento;
	}

	/**
	 * @param areaConocimiento the areaConocimiento to set
	 */
	public EnfasisAreaConocimientoDTO setAreaConocimiento(List<String> areaConocimiento) {
		this.areaConocimiento = areaConocimiento;
		return this;
	}

}
