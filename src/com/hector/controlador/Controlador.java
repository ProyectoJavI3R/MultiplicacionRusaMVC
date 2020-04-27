package com.hector.controlador;

import com.hector.modelo.CrearTabla;
import com.hector.modelo.SolucionProblema;
import com.hector.vista.Ventana;
import com.hector.vista.VentanaSolucion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener{
    
    private Ventana vista;
    private VentanaSolucion vistaSolucion;
    private SolucionProblema modelo;
    private CrearTabla modeloTabla;
    private DefaultTableModel tabla;
    
    public Controlador(Ventana vista, VentanaSolucion vistaSolucion, SolucionProblema modelo, CrearTabla modeloTabla){
        this.vista = vista;
        this.vistaSolucion = vistaSolucion;
        this.modelo = modelo;
        this.modeloTabla = modeloTabla;
        this.tabla = modeloTabla.crearTabla();
        this.vista.botonSolucion.addActionListener(this);
    }

    public void iniciarComponentes() {
        vistaSolucion.tablaResultado.setModel(tabla);
        this.vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.botonSolucion){
            llenarTabla();
            vistaSolucion.setLocationRelativeTo(null);
            vistaSolucion.setVisible(true);
            
        }
    }
    
    public void llenarTabla(){
        String result[][] = modelo.solucionProblema(
                Integer.parseInt(vista.txtMultiplicador.getText()), 
                Integer.parseInt(vista.txtMiltiplicando.getText()));
        tabla.setNumRows(result.length);
        for(int i=0; i < result.length; i ++) {
            for(int j = 0; j < result[0].length; j++){
                tabla.setValueAt(result[i][j], i, j);
            }
        }
    }
    
}
