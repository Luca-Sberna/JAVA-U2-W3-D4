package com.exercise.JAVAU2W3D4.chainOfResponsability;

import lombok.Data;

@Data
public class Generale extends Ufficiale {
	public Generale(Ufficiale responsabile) {
		super(responsabile, 5000);
	}
}
