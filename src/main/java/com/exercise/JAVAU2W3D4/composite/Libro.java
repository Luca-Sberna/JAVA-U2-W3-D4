package com.exercise.JAVAU2W3D4.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	private List<String> autori;
	private double prezzo;
	private List<Elemento> elementi;

	public Libro() {
		this.autori = new ArrayList<>();
		this.elementi = new ArrayList<>();
	}

	public void aggiungiAutore(String autore) {
		this.autori.add(autore);
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void aggiungiElemento(Elemento elemento) {
		this.elementi.add(elemento);
	}

	public int getNumeroPagine() {
		int numeroPagine = 0;
		for (Elemento elemento : elementi) {
			numeroPagine += elemento.getNumeroPagine();
		}
		return numeroPagine;
	}
}
