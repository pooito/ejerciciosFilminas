package app.poo.ito;

import clases.poo.ito.Terreno;

public class MiApp {
	
	static void run() {
		Terreno t,x;  // Declaración de variable t,x de tipo Terreno
		System.out.println(Terreno.getCantidad());
		System.out.println(new Terreno(30,50,"Lucas Ramos"));
		System.out.println(Terreno.getCantidad());
		t= new Terreno(50,70,"Peter Down");
		System.out.println(t);
		System.out.println(Terreno.getCantidad());
		x= new Terreno();
		System.out.println(x);
		System.out.println(Terreno.getCantidad());
		x.setDue_o("Dora Exploradora");
		System.out.println(x);
		System.out.println(Terreno.getCantidad());
		x.setAncho(70);
		System.out.println(x);
		System.out.println(Terreno.getCantidad());
		t.setLargo(20);
		System.out.println(t);
		System.out.println(Terreno.getCantidad());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
	}

}
