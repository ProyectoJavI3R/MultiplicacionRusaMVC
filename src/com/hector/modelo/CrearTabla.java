package com.hector.modelo;

import javax.swing.table.DefaultTableModel;

public class CrearTabla {
    public DefaultTableModel crearTabla() {
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };
        modelo.addColumn("Multiplicador");
        modelo.addColumn("Multiplicando");
        modelo.addColumn("Multiplicador Impar");
        modelo.addColumn("Suma");
        return modelo;
    }
}
