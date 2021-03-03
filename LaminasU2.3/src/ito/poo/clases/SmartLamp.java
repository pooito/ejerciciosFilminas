package ito.poo.clases;

public class SmartLamp {
	
	private float consumoWhatts;
	private String color;
	private int lumenes;
	private String estado; // Sin conectar, conectado, encendido, apagado, inservible
	// Inicializador
	{
		System.out.println("Ha ocurrido una inicialización");
		this.consumoWhatts=0;
		this.color=null;
		this.lumenes=0;
		this.estado=null;
	}

	public SmartLamp() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Ha ocurrido un constructor vacio");
	}
	
	public SmartLamp(float consumoWhatts, String color, int lumenes,
			String estado) {
		super();
		this.consumoWhatts = consumoWhatts;
		this.color = color;
		this.lumenes = lumenes;
		this.estado = estado;
		System.out.println("Ha ocurrido un constructor");
	}

	public void consumoWhatts(int whatts) {
		this.consumoWhatts+=whatts;
	}
	
	public void consumoWhatts(float whatts) {
		this.consumoWhatts+=whatts;
	}
	
	public float consumoWhatts() {
		return this.consumoWhatts;
	}
	
	public boolean isInservible() {
		return this.estado.compareTo("inservible")==0;
	}
	
	public boolean isDesconectado() {
		return this.estado.compareTo("Sin conectar")==0;
	}
	
	public boolean isConectado() {
		return this.estado.compareTo("conectado")==0;
	}
	
	
	public boolean isEncendido() {
		return this.estado.compareTo("encendido")==0;
	}
	
	public boolean isApagado() {
		return this.estado.compareTo("apagado")==0;
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

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Se ha destruido la instancia"+this.consumoWhatts);
	}

	@Override
	public String toString() {
		return "SmartLamp [consumoWhatts=" + consumoWhatts + ", color=" + color + ", lumenes=" + lumenes + ", estado="
				+ estado + "]";
	}
	
}
