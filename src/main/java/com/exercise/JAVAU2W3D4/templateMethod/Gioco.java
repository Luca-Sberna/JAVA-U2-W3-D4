package com.exercise.JAVAU2W3D4.templateMethod;

//la classe astratta Gioco definisce un metodo gioca che implementa l’algoritmo per giocare a un gioco. L’algoritmo è composto da tre passaggi:
//Il metodo inizializza viene chiamato una sola volta all’inizio del gioco per inizializzare lo stato del gioco
//Il metodo eseguiTurno viene chiamato ripetutamente per eseguire i turni del gioco fino a quando il gioco non termina
// il metodo stampaVincitore viene chiamato una sola volta alla fine del gioco per stampare il vincitore
abstract class Gioco {

	public final void gioca() {
		inizializza();
		while (!haVinto()) {
			eseguiTurno();
		}
		stampaVincitore();
	}

	abstract void inizializza();

	abstract void eseguiTurno();

	abstract boolean haVinto();

	abstract void stampaVincitore();
}
