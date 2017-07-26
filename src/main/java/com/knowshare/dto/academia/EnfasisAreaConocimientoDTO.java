/**
 * 
 */
package com.knowshare.dto.academia;

import java.io.Serializable;
import java.util.List;

import com.knowshare.entities.academia.AreaConocimiento;
import com.knowshare.entities.perfilusuario.Enfasis;

/**
 * Clase que reune la lista de nombres de {@link Enfasis} y 
 * {@link AreaConocimiento}, con el fin de enviar a
 * presentación
 * @author Miguel Montañez
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
