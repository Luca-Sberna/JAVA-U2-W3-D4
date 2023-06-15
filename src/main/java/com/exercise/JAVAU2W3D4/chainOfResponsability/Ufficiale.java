package com.exercise.JAVAU2W3D4.chainOfResponsability;

public abstract class Ufficiale {
	protected Ufficiale responsabile;
	protected int stipendio;

	public Ufficiale(Ufficiale responsabile, int stipendio) {
		this.responsabile = responsabile;
		this.stipendio = stipendio;
	}

	public void verificaStipendio(int importo) {
		if (stipendio > importo) {
			System.out.println(this.getClass().getSimpleName() + " percepisce almeno " + importo + "$");
		} else if (stipendio == importo) {
			System.out.println(
					importo + "$" + " è lo stipendio esatto dell'ufficiale: " + this.getClass().getSimpleName());
		} else if (responsabile != null) {
			responsabile.verificaStipendio(importo);
		} else {
			System.out.println("Nessun ufficiale percepisce almeno " + importo + "$");
		}

	}
}
