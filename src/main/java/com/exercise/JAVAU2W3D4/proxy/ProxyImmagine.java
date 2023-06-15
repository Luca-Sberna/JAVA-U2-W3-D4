package com.exercise.JAVAU2W3D4.proxy;

public class ProxyImmagine implements Immagine {
	private String nomeFile;
	private ImmagineReale immagineReale;

	public ProxyImmagine(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	@Override
	public void visualizza() {
		if (immagineReale == null) {
			immagineReale = new ImmagineReale(nomeFile);
		}
		immagineReale.visualizza();
	}
}
