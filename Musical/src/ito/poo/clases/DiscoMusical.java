/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;


import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DiscoMusical.
 * 
 * @author rherrera
 */
public class DiscoMusical {
	

	/**
	 * Description of the property tituloDisco.
	 */
	private String tituloDisco = "";

	/**
	 * Description of the property pistasMusica.
	 */
	private HashSet<Pista> pistasMusica = new HashSet<Pista>();

	/**
	 * Description of the property estiloMusica.
	 */
	private String estiloMusica = "";

	/**
	 * Description of the property productor.
	 */
	private String productor = "";

	// Start of user code (user defined attributes for DiscoMusical)

	// End of user code

	/**
	 * The constructor.
	 */
	public DiscoMusical() {
		// Start of user code constructor for DiscoMusical)
		super();
		// End of user code
	}

	public DiscoMusical(String tituloDisco, String estiloMusica, String productor) {
		super();
		this.tituloDisco = tituloDisco;
		this.estiloMusica = estiloMusica;
		this.productor = productor;
	}
	/**
	 * Description of the method addPista.
	 * @param pista 
	 */
	public void addPista(Pista pista) {
		// Start of user code for method addPista
		// End of user code
	}

	/**
	 * Description of the method deletePista.
	 * @param indice 
	 * @return 
	 */
	public boolean deletePista(int indice) {
		// Start of user code for method deletePista
		boolean deletePista = false;
		return deletePista;
		// End of user code
	}

	// Start of user code (user defined methods for DiscoMusical)

	// End of user code
	/**
	 * Returns tituloDisco.
	 * @return tituloDisco 
	 */
	public String getTituloDisco() {
		return this.tituloDisco;
	}

	/**
	 * Sets a value to attribute tituloDisco. 
	 * @param newTituloDisco 
	 */
	public void setTituloDisco(String newTituloDisco) {
		this.tituloDisco = newTituloDisco;
	}

	/**
	 * Returns pistasMusica.
	 * @return pistasMusica 
	 */
	public HashSet<Pista> getPistasMusica() {
		return this.pistasMusica;
	}

	/**
	 * Returns estiloMusica.
	 * @return estiloMusica 
	 */
	public String getEstiloMusica() {
		return this.estiloMusica;
	}

	/**
	 * Sets a value to attribute estiloMusica. 
	 * @param newEstiloMusica 
	 */
	public void setEstiloMusica(String newEstiloMusica) {
		this.estiloMusica = newEstiloMusica;
	}

	/**
	 * Returns productor.
	 * @return productor 
	 */
	public String getProductor() {
		return this.productor;
	}

	/**
	 * Sets a value to attribute productor. 
	 * @param newProductor 
	 */
	public void setProductor(String newProductor) {
		this.productor = newProductor;
	}

	@Override
	public String toString() {
		return "DiscoMusical [tituloDisco=" + tituloDisco + ", estiloMusica=" + estiloMusica + ", productor="
				+ productor + "]";
	}

}
