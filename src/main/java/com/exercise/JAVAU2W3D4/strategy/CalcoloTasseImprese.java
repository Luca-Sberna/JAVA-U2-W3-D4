package com.exercise.JAVAU2W3D4.strategy;

public class CalcoloTasseImprese implements CalcoloTasse {

	@Override
	public double calcolaTasse(double reddito) {
		return reddito * 0.4;
	}

}
