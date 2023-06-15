package com.exercise.JAVAU2W3D4.composite;

import lombok.Data;

@Data
public abstract class Elemento {
	public abstract void stampa();

	public abstract int getNumeroPagine();
}
