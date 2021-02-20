/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.poo.ito;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Terreno.
 * 
 * @author rherr
 */
public class Terreno {
	

	/**
	 * Description of the property ancho.
	 */
	private float ancho = 0F;

	/**
	 * Description of the property largo.
	 */
	private float largo = 0F;

	/**
	 * Description of the property dueño.
	 */
	private String due�o="";

	/**
	 * Description of the property cantidad.
	 */
	private static int cantidad = 0;

	// Start of user code (user defined attributes for Terreno)

	// End of user code

	/**
	 * The constructor.
	 */
	public Terreno() {
		// Start of user code constructor for Terreno)
		super();
		// End of user code
	}
	
	public Terreno(float ancho, float largo, String due�o) {
		super();
		this.ancho = ancho;
		this.largo = largo;
		this.due�o = due�o;
		cantidad++;
	}

	

	// Start of user code (user defined methods for Terreno)

	// End of user code
	/**
	 * Returns ancho.
	 * @return ancho 
	 */
	public float getAncho() {
		return this.ancho;
	}

	/**
	 * Sets a value to attribute ancho. 
	 * @param newAncho 
	 */
	public void setAncho(float newAncho) {
		this.ancho = newAncho;
	}

	/**
	 * Returns largo.
	 * @return largo 
	 */
	public float getLargo() {
		return this.largo;
	}

	/**
	 * Sets a value to attribute largo. 
	 * @param newLargo 
	 */
	public void setLargo(float newLargo) {
		this.largo = newLargo;
	}

	/**
	 * Returns due�o.
	 * @return due�o 
	 */
	public String getDue�o() {
		return this.due�o;
	}

	/**
	 * Sets a value to attribute due�o. 
	 * @param newDue�o 
	 */
	public void setDue�o(String newDue�o) {
	    this.due�o = newDue�o;
	}

	/**
	 * Returns cantidad.
	 * @return cantidad 
	 */
	public static int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Terreno [ancho=" + ancho + ", largo=" + largo + ", due�o=" + due�o + "]";
	}

	

}
