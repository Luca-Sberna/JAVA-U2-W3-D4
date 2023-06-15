package com.exercise.JAVAU2W3D4.adapter;

import java.util.Calendar;

public class AdapterRunner {

	public static void main(String[] args) {

		Info info = new Info();

		info.setNome("Yokopoko");
		info.setCognome("Mayoko");
		Calendar calendar = Calendar.getInstance();
		calendar.set(1996, Calendar.APRIL, 30);
		info.setDataDiNascita(calendar.getTime());

		InfoAdapter adapter = new InfoAdapter(info);
		UserData userData = new UserData();

		userData.getData(adapter);

		System.out.println("Nome completo: " + userData.getNomeCompleto());
		System.out.println("Età: " + userData.getEta());
	}

}
