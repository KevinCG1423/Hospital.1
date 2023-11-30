package com.mycompany.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;

public class PanelPrincipal extends JFrame {
    private JButton JButtonMedico;
    private JButton JButtonReservas;
    private JButton JButtonCerrar;
    private ArrayList<PacienteFrame> pacientes;

    public PanelPrincipal(ArrayList<PacienteFrame> pacientes) {
        setLayout(null);
        setTitle("Reserva de hora para medico");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButtonMedico = new JButton("Medico");
        JButtonMedico.setBounds(30, 90, 100, 50);
        add(JButtonMedico);

        JButtonReservas = new JButton("Reservas");
        JButtonReservas.setBounds(150, 90, 100, 50);
        add(JButtonReservas);

        JButtonCerrar = new JButton("Cerrar");
        JButtonCerrar.setBounds(270, 90, 100, 50);
        add(JButtonCerrar);
        JButtonCerrar.addActionListener(e -> System.exit(0));

        this.pacientes = pacientes;

        JButtonMedico.addActionListener(e -> {
            MedicosFrame panelMedicosPanel = new MedicosFrame(pacientes);
            panelMedicosPanel.setVisible(true);
        });

        JButtonReservas.addActionListener(e -> {
            ReservaFrame reservasPanel = new ReservaFrame(pacientes);
            reservasPanel.setVisible(true);
        });
    }
}