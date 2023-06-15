package com.exercise.JAVAU2W3D4.templateMethod;

public class Scacchi extends Gioco {
	private int turni = 0;
	private int maxTurni = 100;

	@Override
	void inizializza() {
		System.out.println("Inizializzazione Scacchi");
	}

	@Override
	void eseguiTurno() {
		System.out.println("Esecuzione turno Scacchi");
		turni++;
	}

	@Override
	boolean haVinto() {
		return turni == maxTurni;
	}

	@Override
	void stampaVincitore() {
		System.out.println("Vincitore Scacchi");
	}

}
