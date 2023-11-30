package com.mycompany.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       ArrayList<PacienteFrame> pacientes = new ArrayList<>();  // Crear la lista de pacientes
        PanelPrincipal panel = new PanelPrincipal(pacientes);  // Pasar la lista al constructor
        panel.setVisible(true);
    }
}
