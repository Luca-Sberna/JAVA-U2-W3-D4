package com.exercise.JAVAU2W3D4.chainOfResponsability;

import lombok.Data;

@Data
public class Maggiore extends Ufficiale {
	public Maggiore(Ufficiale responsabile) {
		super(responsabile, 2000);
	}
}