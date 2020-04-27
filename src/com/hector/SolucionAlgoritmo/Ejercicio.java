package com.hector.SolucionAlgoritmo;

import com.hector.AlgoritmoMR.*;

public class Ejercicio {//Contexto -> Encapsulamos Todos los algoritmos
	
	private IEstrategia estrategia;
	
	public Ejercicio (IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public String[][] resolverMultiplicacion (int multiplicador, int multiplicado) {
		return this.estrategia.resolverProblema(multiplicador, multiplicado);
	}
	
}
