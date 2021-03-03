package ito.poo.app;

import ito.poo.clases.Pista;
import ito.poo.clases.DiscoMusical;
import java.util.HashSet;


public class MyApp {
	
	static void run() {
		DiscoMusical disco;
		System.out.println(new Pista("Titulo de cancion",3));
		disco= new DiscoMusical("Disco 1","Banda","GMusic");
		System.out.println(disco);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
	}

}
