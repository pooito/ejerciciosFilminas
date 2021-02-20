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
	 * Description of the property dueÃ±o.
	 */
	private String dueño="";

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
	
	public Terreno(float ancho, float largo, String dueño) {
		super();
		this.ancho = ancho;
		this.largo = largo;
		this.dueño = dueño;
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
	 * Returns dueño.
	 * @return dueño 
	 */
	public String getDueño() {
		return this.dueño;
	}

	/**
	 * Sets a value to attribute dueño. 
	 * @param newDueño 
	 */
	public void setDueño(String newDueño) {
	    this.dueño = newDueño;
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
		return "Terreno [ancho=" + ancho + ", largo=" + largo + ", dueño=" + dueño + "]";
	}

	

}
