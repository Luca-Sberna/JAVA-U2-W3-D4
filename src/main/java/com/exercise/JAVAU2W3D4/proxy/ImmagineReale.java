package com.exercise.JAVAU2W3D4.proxy;

public class ImmagineReale implements Immagine {
	private String nomeFile;

	public ImmagineReale(String nomeFile) {
		super();
		this.nomeFile = nomeFile;
		caricaDaDisco(nomeFile);
	}

	@Override
	public void visualizza() {
		System.out.println("Visualizzazione: " + nomeFile);
	}

	private void caricaDaDisco(String nomeFile) {
		System.out.println("Caricamento: " + nomeFile);
	}

}
