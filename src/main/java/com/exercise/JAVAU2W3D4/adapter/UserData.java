package com.exercise.JAVAU2W3D4.adapter;

import com.exercise.JAVAU2W3D4.adapter.interfaces.DataSource;

import lombok.Data;

//classe che utilizza l'interfaccia 

@Data
public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}
}
