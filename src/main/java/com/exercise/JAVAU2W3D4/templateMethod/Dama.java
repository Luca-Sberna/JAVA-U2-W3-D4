package com.exercise.JAVAU2W3D4.templateMethod;

public class Dama extends Gioco {
	private int turni = 0;
	private int maxTurni = 50;

	@Override
	void inizializza() {
		System.out.println("Inizializzazione Dama");

	}

	@Override
	void eseguiTurno() {
		System.out.println("Esecuzione turno Dama");
		turni++;
	}

	@Override
	boolean haVinto() {
		return turni == maxTurni;

	}

	@Override
	void stampaVincitore() {
		System.out.println("Vincitore Dama");

	}

}
