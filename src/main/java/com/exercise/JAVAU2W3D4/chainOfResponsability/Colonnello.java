package com.exercise.JAVAU2W3D4.chainOfResponsability;

import lombok.Data;

@Data
public class Colonnello extends Ufficiale {
	public Colonnello(Ufficiale responsabile) {
		super(responsabile, 4000);
	}

}
