package com.exercise.JAVAU2W3D4.templateMethod;

public class TemplateMethodRunner {
	public static void main(String[] args) {

		// creiamo un'istanza della classe Scacchi e la assegniamo a una variabile di
		// tipo Gioco, poi chiamo il metodo gioca sulla variabile per iniziare a giocare
		// stessa cosa per dama
		Gioco scacchi = new Scacchi();
		scacchi.gioca();

		System.out.println("");

		Gioco dama = new Dama();
		dama.gioca();
	}
}
