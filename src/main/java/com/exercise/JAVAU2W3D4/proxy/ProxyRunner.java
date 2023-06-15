package com.exercise.JAVAU2W3D4.proxy;

public class ProxyRunner {
	public static void main(String[] args) {

		Immagine immagine = new ProxyImmagine("test.jpg");

		// L'immagine viene caricata dal disco solo alla prima visualizzazione
		immagine.visualizza();
		System.out.println("");

		// L'immagine non viene ricaricata dal disco alle visualizzazioni successive
		immagine.visualizza();
		immagine.visualizza();
	}

}
