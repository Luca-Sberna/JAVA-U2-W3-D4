package com.exercise.JAVAU2W3D4.chainOfResponsability;

public class ChainRunner {

	public static void main(String[] args) {
		// creo l'istanza di ciascun ufficiale e imposto il responsabile
		Generale generale = new Generale(null);
		Colonnello colonnello = new Colonnello(generale);
		Tenente tenente = new Tenente(colonnello);
		Maggiore maggiore = new Maggiore(tenente);
		Capitano capitano = new Capitano(maggiore);

		capitano.verificaStipendio(3096);
		capitano.verificaStipendio(3000);
		capitano.verificaStipendio(300496);

		System.out.println("");

		System.out.println("Questi sono gli stipendi percepiti dagli Ufficiali: ");
		System.out.println("Generale: " + generale.stipendio + "$");
		System.out.println("Colonnello: " + colonnello.stipendio + "$");
		System.out.println("Tenente: " + tenente.stipendio + "$");
		System.out.println("Maggiore: " + maggiore.stipendio + "$");
		System.out.println("Capitano: " + capitano.stipendio + "$");

	}

}
