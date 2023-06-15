package com.exercise.JAVAU2W3D4.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import com.exercise.JAVAU2W3D4.adapter.interfaces.DataSource;

// classe che implementa l’interfaccia DataSource e 
//utilizza un’istanza della classe Info per recuperare le informazioni richieste
//In questo modo, la classe UserData può utilizzare l’interfaccia DataSource 
//per accedere ai dati della classe Info

public class InfoAdapter implements DataSource {
	private Info info;

	public InfoAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		// Calcola l'età in base alla data di nascita
		LocalDate oggi = LocalDate.now();
		LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return Period.between(dataDiNascita, oggi).getYears();
	}

}
