package com.mycompany.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ReservaFrame extends JFrame {
    private JTable JTableTablaDeDatos;
    private JButton JButtonCerrar;
    private ArrayList<PacienteFrame> pacientes;

    public ReservaFrame(ArrayList<PacienteFrame> pacientes) {
        setLayout(null);
        setTitle("Reservas de Horas Medicas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JButtonCerrar = new JButton("Cerrar");
        JButtonCerrar.setBounds(200, 300, 90, 30);
        add(JButtonCerrar);
        
        JButtonCerrar.addActionListener(e -> {
            PanelPrincipal mainPanel = new PanelPrincipal(pacientes);
            mainPanel.setVisible(true);
            dispose();
        });

        this.pacientes = pacientes;

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nombre Medicos", "Nombre Pacientes", "Especialista", "Horas Disponibles"});

        for (PacienteFrame paciente : pacientes) {
            model.addRow(new Object[]{paciente.getNombreMedico(), paciente.getNombrePaciente(), paciente.getEspecialidad(), paciente.getHorasDisponibles()});
            
        }

        JTableTablaDeDatos = new JTable(model);

        JScrollPane jScrollPane = new JScrollPane(JTableTablaDeDatos);
        jScrollPane.setBounds(5, 10, 470, 250);
        add(jScrollPane);
    }
}