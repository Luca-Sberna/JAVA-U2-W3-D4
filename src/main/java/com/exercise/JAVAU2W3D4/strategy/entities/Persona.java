package com.exercise.JAVAU2W3D4.strategy.entities;

import com.exercise.JAVAU2W3D4.strategy.CalcoloTasse;

import lombok.Data;

@Data
public class Persona {
	private String nome;
	private double reddito;
	private CalcoloTasse calcoloTasse;

	public Persona(String nome, double reddito, CalcoloTasse calcoloTasse) {
		this.nome = nome;
		this.reddito = reddito;
		this.calcoloTasse = calcoloTasse;
	}

	public double calcolaTasse() {
		return calcoloTasse.calcolaTasse(reddito);
	}
}
