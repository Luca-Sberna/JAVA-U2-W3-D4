package com.exercise.JAVAU2W3D4.strategy;

import com.exercise.JAVAU2W3D4.strategy.entities.Persona;

public class StrategyRunner {
	public static void main(String[] args) {
		Persona individuo = new Persona("Mario Rossi", 50000, new CalcoloTasseIndividui());
		System.out.println("Le tasse per " + individuo.getNome() + " con reddito di: " + individuo.getReddito()
				+ "$ annui" + " sono: " + individuo.calcolaTasse() + "$");

		System.out.println("");

		Persona famiglia = new Persona("Famiglia Rossi", 80000, new CalcoloTasseFamiglie());
		System.out.println("Le tasse per la " + famiglia.getNome() + " con reddito di: " + famiglia.getReddito()
				+ "$ annui" + " sono: " + famiglia.calcolaTasse() + "$");

		System.out.println("");

		Persona impresa = new Persona("Impresa Rossi", 100000, new CalcoloTasseImprese());
		System.out.println("Le tasse per l'" + impresa.getNome() + " con reddito di: " + impresa.getReddito()
				+ "$ annui" + " sono: " + impresa.calcolaTasse() + "$");
	}

}
