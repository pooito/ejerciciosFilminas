package ito.poo.clases;

public class SmartLamp {
	
	private float consumoWhatts;
	private String color;
	private int lumenes;
	private String estado; //  sin conectar, apagado, encendido, conectado, dañado 
	// Inicializador
	{
	    this.consumoWhatts=0;
	    this.color=null;
	    this.lumenes=0;
	    this.estado=null;
	}
	// Constructor por defecto
	public SmartLamp() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Segundo constructor
	public SmartLamp(float consumoWhatts, String color, int lumenes, String estado) {
		super();
		this.consumoWhatts = consumoWhatts;
		this.color = color;
		this.lumenes = lumenes;
		this.estado = estado;
	}
	public float getConsumoWhatts() {
		return consumoWhatts;
	}
	public void setConsumoWhatts(float consumoWhatts) {
		this.consumoWhatts = consumoWhatts;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLumenes() {
		return lumenes;
	}
	public void setLumenes(int lumenes) {
		this.lumenes = lumenes;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean isSinconectar() {
		return this.estado.compareToIgnoreCase("sin conectar")==0;
	}
	public boolean isConectado() {
		return this.estado.compareToIgnoreCase("conectado")==0;
	}
	public boolean isEncendido() {
		return this.estado.compareToIgnoreCase("encendido")==0;
	}
	public boolean isApagado() {
		return this.estado.compareToIgnoreCase("apagado")==0;
	}
	public boolean isDa_ado() {
		return this.estado.compareToIgnoreCase("dañado")==0;
	}
	@Override
	public String toString() {
		return "SmartLamp [consumoWhatts=" + consumoWhatts + ", color=" + color + ", lumenes=" + lumenes + ", estado="
				+ estado + "]";
	}
}
