/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Pista.
 * 
 * @author rherrera
 */
public class Pista {
	

	/**
	 * Description of the property titulo.
	 */
	private String titulo = "";

	/**
	 * Description of the property duracion.
	 */
	private int duracion = 0;

	// Start of user code (user defined attributes for Pista)

	// End of user code

	/**
	 * The constructor.
	 */
	public Pista() {
		// Start of user code constructor for Pista)
		super();
		// End of user code
	}
	
	public Pista(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}

	// Start of user code (user defined methods for Pista)

	// End of user code
	/**
	 * Returns titulo.
	 * @return titulo 
	 */
	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * Sets a value to attribute titulo. 
	 * @param newTitulo 
	 */
	public void setTitulo(String newTitulo) {
		this.titulo = newTitulo;
	}

	/**
	 * Returns duracion.
	 * @return duracion 
	 */
	public int getDuracion() {
		return this.duracion;
	}

	/**
	 * Sets a value to attribute duracion. 
	 * @param newDuracion 
	 */
	public void setDuracion(int newDuracion) {
		this.duracion = newDuracion;
	}

	@Override
	public String toString() {
		return "Pista [titulo=" + titulo + ", duracion=" + duracion + "]";
	}

}
