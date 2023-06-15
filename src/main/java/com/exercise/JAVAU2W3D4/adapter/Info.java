package com.exercise.JAVAU2W3D4.adapter;

import java.util.Date;

import lombok.Data;

//classe che rappresenta le informazioni su un utente
@Data
public class Info {
	private String nome;
	private String cognome;
	private Date dataDiNascita;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void DataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
}
