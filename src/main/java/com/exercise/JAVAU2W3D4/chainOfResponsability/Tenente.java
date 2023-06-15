package com.exercise.JAVAU2W3D4.chainOfResponsability;

import lombok.Data;

@Data
public class Tenente extends Ufficiale {
	public Tenente(Ufficiale responsabile) {
		super(responsabile, 3000);
	}
}