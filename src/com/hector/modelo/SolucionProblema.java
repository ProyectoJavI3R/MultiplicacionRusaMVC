
package com.hector.modelo;


public class SolucionProblema {
    
    public String[][] solucionProblema(int multiplicador, int multiplicando) {
        com.hector.SolucionAlgoritmo.IEstrategia estrategia ;
        estrategia = new  com.hector.SolucionAlgoritmo.MultiplicacionRusa();
        com.hector.SolucionAlgoritmo.Ejercicio ejericico = new com.hector.SolucionAlgoritmo.Ejercicio(estrategia);    
        return ejericico.resolverMultiplicacion(multiplicador, multiplicando);
    }
    
    public float resolverProblema(int multiplicador, int multiplicando) {
        com.hector.AlgoritmoMR.IEstrategia estrategia ;
        estrategia = new com.hector.AlgoritmoMR.MultiplicacionRusa();
        com.hector.AlgoritmoMR.Ejercicio ejericico = new com.hector.AlgoritmoMR.Ejercicio(estrategia);    
        return ejericico.resolverMultiplicacion(multiplicador, multiplicando);
    }
    
}
