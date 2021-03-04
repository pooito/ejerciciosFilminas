/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.poo.ito;

import java.time.LocalDate;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of SmartPhone.
 * 
 * @author rherr
 */
public class SmartPhone {
	

	/**
	 * Description of the property marca.
	 */
	private String marca = "";

	/**
	 * Description of the property modelo.
	 */
	private String modelo = "";

	/**
	 * Description of the property memoriaRAM.
	 */
	private int memoriaRAM = 0;

	/**
	 * Description of the property memoriaROM.
	 */
	private int memoriaROM = 0;

	/**
	 * Description of the property fechaDeLanzamiento.
	 */
	private LocalDate fechaDeLanzamiento = null;

	/**
	 * Description of the property aplicaciones.
	 */
	private HashSet<String> aplicaciones = null;

	// Start of user code (user defined attributes for SmartPhone)

	// End of user code

	/**
	 * The constructor.
	 */
	public SmartPhone() {
		// Start of user code constructor for SmartPhone)
		super();
		this.aplicaciones= new HashSet<String>();
		// End of user code
	}
	
	public SmartPhone(String marca, String modelo, int memoriaRAM, int memoriaROM, LocalDate fechaDeLanzamiento,
			HashSet<String> aplicaciones) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaRAM = memoriaRAM;
		this.memoriaROM = memoriaROM;
		this.fechaDeLanzamiento = fechaDeLanzamiento;
		this.aplicaciones = aplicaciones;
	}
	
	public SmartPhone(String marca, String modelo, int memoriaRAM, int memoriaROM, LocalDate fechaDeLanzamiento) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaRAM = memoriaRAM;
		this.memoriaROM = memoriaROM;
		this.fechaDeLanzamiento = fechaDeLanzamiento;
		this.aplicaciones= new HashSet<String>();
	}

	/**
	 * Description of the method agregaAplicacion.
	 * @param aplicacion 
	 */
	public void agregaAplicacion(String aplicacion) {
		// Start of user code for method agregaAplicacion
		this.aplicaciones.add(aplicacion);
		// End of user code
	}

	/**
	 * Description of the method agregaMemoriaRAM.
	 * @param cantidad 
	 */
	public void agregaMemoriaRAM(int cantidad) {
		// Start of user code for method agregaMemoriaRAM
		this.memoriaRAM+=cantidad;
		// End of user code
	}

	// Start of user code (user defined methods for SmartPhone)

	// End of user code
	/**
	 * Returns marca.
	 * @return marca 
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Sets a value to attribute marca. 
	 * @param newMarca 
	 */
	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}

	/**
	 * Returns modelo.
	 * @return modelo 
	 */
	public String getModelo() {
		return this.modelo;
	}

	/**
	 * Sets a value to attribute modelo. 
	 * @param newModelo 
	 */
	public void setModelo(String newModelo) {
		this.modelo = newModelo;
	}

	/**
	 * Returns memoriaRAM.
	 * @return memoriaRAM 
	 */
	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

	/**
	 * Sets a value to attribute memoriaRAM. 
	 * @param newMemoriaRAM 
	 */
	public void setMemoriaRAM(int newMemoriaRAM) {
		this.memoriaRAM = newMemoriaRAM;
	}

	/**
	 * Returns memoriaROM.
	 * @return memoriaROM 
	 */
	public int getMemoriaROM() {
		return this.memoriaROM;
	}

	/**
	 * Sets a value to attribute memoriaROM. 
	 * @param newMemoriaROM 
	 */
	public void setMemoriaROM(int newMemoriaROM) {
		this.memoriaROM = newMemoriaROM;
	}

	/**
	 * Returns fechaDeLanzamiento.
	 * @return fechaDeLanzamiento 
	 */
	public LocalDate getFechaDeLanzamiento() {
		return this.fechaDeLanzamiento;
	}

	/**
	 * Sets a value to attribute fechaDeLanzamiento. 
	 * @param newFechaDeLanzamiento 
	 */
	public void setFechaDeLanzamiento(LocalDate newFechaDeLanzamiento) {
		this.fechaDeLanzamiento = newFechaDeLanzamiento;
	}

	/**
	 * Returns aplicaciones.
	 * @return aplicaciones 
	 */
	public HashSet<String> getAplicaciones() {
		return this.aplicaciones;
	}

	@Override
	public String toString() {
		return "SmartPhone [marca=" + marca + ", modelo=" + modelo + ", memoriaRAM=" + memoriaRAM + ", memoriaROM="
				+ memoriaROM + ", fechaDeLanzamiento=" + fechaDeLanzamiento + "]";
	}

}
