
package com.hector.Principal;

import com.hector.controlador.Controlador;
import com.hector.modelo.CrearTabla;
import com.hector.modelo.SolucionProblema;
import com.hector.vista.Ventana;
import com.hector.vista.VentanaSolucion;

public class Main {
    public static void main(String[] args) {
        Ventana vista = new Ventana();
        VentanaSolucion vistaSolucion = new VentanaSolucion(vista, true);
        SolucionProblema modelo = new SolucionProblema();
        CrearTabla modeloTabla = new CrearTabla();
        Controlador controlador = new Controlador(vista, vistaSolucion, modelo, modeloTabla);
        
        controlador.iniciarComponentes();
        vista.setVisible(true);
    }
}
