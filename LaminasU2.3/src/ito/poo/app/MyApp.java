package ito.poo.app;

import ito.poo.clases.SmartLamp;


public class MyApp {
	static void run() {
		 int i=0;
         System.out.println(new SmartLamp());
         SmartLamp sl= new SmartLamp(40, "Calido",1500,"Sin conectar");
         System.out.println(sl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 run();
     }

}
