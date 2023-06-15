package com.exercise.JAVAU2W3D4.composite;

public class CompositeRunner {
	public static void main(String[] args) {

		Libro libro = new Libro();
		libro.aggiungiAutore("Chuck Norris");
		libro.setPrezzo(1000.0);

		Sezione sezione1 = new Sezione();
		sezione1.aggiungiElemento(new Pagina());
		sezione1.aggiungiElemento(new Pagina());

		Sezione sezione2 = new Sezione();
		sezione2.aggiungiElemento(new Pagina());
		sezione2.aggiungiElemento(new Pagina());

		Sezione sottosezione = new Sezione();
		sottosezione.aggiungiElemento(new Pagina());
		sottosezione.aggiungiElemento(new Pagina());

		sezione2.aggiungiElemento(sottosezione);
		libro.aggiungiElemento(sezione1);
		libro.aggiungiElemento(sezione2);

		// secondo libro
		Libro libro2 = new Libro();
		libro2.aggiungiAutore("Bruce Lee");
		libro2.setPrezzo(2000.0);

		Sezione sezione1_2 = new Sezione();
		sezione1_2.aggiungiElemento(new Pagina());
		sezione1_2.aggiungiElemento(new Pagina());

		Sezione sezione2_2 = new Sezione();
		sezione2_2.aggiungiElemento(new Pagina());
		sezione2_2.aggiungiElemento(new Pagina());
		sezione2_2.aggiungiElemento(new Pagina());

		Sezione sottosezione2 = new Sezione();
		sottosezione2.aggiungiElemento(new Pagina());
		sottosezione2.aggiungiElemento(new Pagina());
		sottosezione2.aggiungiElemento(new Pagina());
		sottosezione2.aggiungiElemento(new Pagina());

		sezione2_2.aggiungiElemento(sottosezione2);
		libro2.aggiungiElemento(sezione1_2);
		libro2.aggiungiElemento(sezione2_2);

		// mostro a console il libro di chuck norris
		System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
		System.out.println("il prezzo è di " + libro.getPrezzo() + "$ per " + libro.getNumeroPagine()
				+ " pagine di libro" + " ma è di Chuck Norris quindi sold-out al day one");

		System.out.println("");

		// mostro a console il libro di bruce lee
		System.out.println("Numero totale di pagine: " + libro2.getNumeroPagine());
		System.out.println("Il prezzo è di " + libro2.getPrezzo() + "$ per " + libro2.getNumeroPagine()
				+ " pagine di puro Bruce Lee. Vale ogni centesimo!");
	}
}
