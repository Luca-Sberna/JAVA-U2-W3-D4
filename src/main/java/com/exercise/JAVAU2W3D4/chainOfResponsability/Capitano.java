package com.exercise.JAVAU2W3D4.chainOfResponsability;

import lombok.Data;

@Data
public class Capitano extends Ufficiale {
	public Capitano(Ufficiale responsabile) {
		super(responsabile, 1000);

	}

}
