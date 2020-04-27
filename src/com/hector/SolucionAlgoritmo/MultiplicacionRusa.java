package com.hector.SolucionAlgoritmo;

/*
 * Algoritmo encapsulado en la clase
 */
public class MultiplicacionRusa implements IEstrategia {

    public String[][] resolverProblema(int multiplicador, int multiplicando) {

        float resultado = 0f;
        int filas = 0;
        int tempMultiplicador = multiplicador;
        int tempMultiplicando = multiplicando;
        while ((multiplicador != 0)) {
            multiplicador /= 2;
            multiplicando *= 2;
            filas++;
        }
        String solucion[][] = new String[filas][4];
        filas = 0;
        while ((tempMultiplicador != 0)) {
            if (tempMultiplicador % 2 != 0) {
                resultado += tempMultiplicando;
                solucion[filas][2] = String.valueOf("SI");
                solucion[filas][3] = String.valueOf(resultado);
                
            } else {
                solucion[filas][2] = String.valueOf("NO");
                solucion[filas][3] = String.valueOf("");
            }
            solucion[filas][0] = String.valueOf(tempMultiplicador);
            solucion[filas][1] = String.valueOf(tempMultiplicando);
            tempMultiplicador /= 2;
            tempMultiplicando *= 2;
            filas++;
        }
        
        return solucion;

    }

}
