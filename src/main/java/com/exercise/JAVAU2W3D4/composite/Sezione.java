package com.exercise.JAVAU2W3D4.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione extends Elemento {

	private List<Elemento> elementi;

	public Sezione() {
		this.elementi = new ArrayList<>();
	}

	public void aggiungiElemento(Elemento elemento) {
		this.elementi.add(elemento);
	}

	// questo metodo stampa la sezione e tutti i suoi elementi. Per farlo, itera
	// sulla lista di elementi e chiama il metodo stampa su ciascun elemento.
	@Override
	public void stampa() {
		for (Elemento elemento : elementi) {
			elemento.stampa();
		}
	}

	// questo metodo restituisce il numero di pagine della sezione. Per farlo,
	// inizializza una variabile numeroPagine e poi itera sulla lista di
	// elementi. Per ciascun elemento, chiama il metodo getNumeroPagine e aggiunge
	// il valore restituito alla variabile numeroPagine.
	@Override
	public int getNumeroPagine() {
		int numeroPagine = 0;
		for (Elemento elemento : elementi) {
			numeroPagine += elemento.getNumeroPagine();
		}
		return numeroPagine;
	}

}
