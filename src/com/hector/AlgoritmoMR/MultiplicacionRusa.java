package com.hector.AlgoritmoMR;

/*
 * Algoritmo encapsulado en la clase
 */

public class MultiplicacionRusa implements IEstrategia{
	
	public float resolverProblema(int multiplicador, int multiplicando) {
		
		float resultado = 0f;
		
		while((multiplicador != 0)) {
			
			if(multiplicador % 2 != 0) 
				resultado += multiplicando;
			
			multiplicador /= 2;
			multiplicando *= 2;
			
		}
		
		return resultado;
		
	}
	
}
