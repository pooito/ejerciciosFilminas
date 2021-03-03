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
	 * Description of the property due_o.
	 */
	private String due_o="";

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
		cantidad++;
	}
	
	public Terreno(float ancho, float largo, String due_o) {
		super();
		this.ancho = ancho;
		this.largo = largo;
		this.due_o = due_o;
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
	 * Returns due_o.
	 * @return due_o 
	 */
	public String getDue_o() {
		return this.due_o;
	}

	/**
	 * Sets a value to attribute due_o. 
	 * @param newDue_o 
	 */
	public void setDue_o(String newDue_o) {
	    this.due_o = newDue_o;
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
		return "Terreno [ancho=" + ancho + ", largo=" + largo + ", dueño=" + due_o + "]";
	}

	

}
