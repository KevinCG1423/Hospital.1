package com.mycompany.main;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MedicosFrame extends JFrame {
    private JLabel labelNombreMedicos;
    private JLabel labelNombresPacientes;
    private JLabel labelEspecialista;
    private JLabel labelHorasDisponibleAtencion;
    private JLabel labelValorHora;
    private JLabel labelCobroHora;
    private JComboBox<String> comboBoxNombreMedicos;
    private JComboBox<String> comboBoxEspecialista;
    private JComboBox<String> comboBoxHorasDisponibleAtencion;
    private JTextField textFieldNombrePacientes;
    private JButton buttonAceptar;
    private JButton buttonCerrar;
    private ArrayList<PacienteFrame> pacientes;
    private JFrame frame;

    public MedicosFrame(ArrayList<PacienteFrame> pacientes) {
        setLayout(null);
        setTitle("Ingreso de Datos del Médico");
        setSize(420, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        labelNombreMedicos = new JLabel("Nombre del médico: ");
        labelNombreMedicos.setBounds(50, 10, 120, 50);
        add(labelNombreMedicos);

        String[] nombresMedicos = {"Juan Meza", "Pedro Pascal", "Juan Fernandez", "Ricardo Arraya", "Magdalena Montes", "Isidora Goyenechea"};
        comboBoxNombreMedicos = new JComboBox<>(nombresMedicos);
        comboBoxNombreMedicos.setBounds(230, 25, 140, 20);
        add(comboBoxNombreMedicos);

        labelNombresPacientes = new JLabel("Nombre del paciente: ");
        labelNombresPacientes.setBounds(50, 50, 140, 50);
        add(labelNombresPacientes);

        textFieldNombrePacientes = new JTextField();
        textFieldNombrePacientes.setBounds(230, 65, 140, 20);
        add(textFieldNombrePacientes);

        labelEspecialista = new JLabel("Especialista: ");
        labelEspecialista.setBounds(50, 90, 120, 50);
        add(labelEspecialista);

        String[] especialidades = {"Medicina General", "Pediatría", "Traumatología", "Oftalmología", "Ginecología", "Cardiología"};
        comboBoxEspecialista = new JComboBox<>(especialidades);
        comboBoxEspecialista.setBounds(230, 105, 140, 20);
        add(comboBoxEspecialista);

        labelHorasDisponibleAtencion = new JLabel("Horas Disponible de atencion: ");
        labelHorasDisponibleAtencion.setBounds(20, 130, 180, 50);
        add(labelHorasDisponibleAtencion);

        String[] horasDisponibles = {"10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00"};
        comboBoxHorasDisponibleAtencion = new JComboBox<>(horasDisponibles);
        comboBoxHorasDisponibleAtencion.setBounds(230, 145, 140, 20);
        add(comboBoxHorasDisponibleAtencion);

        labelValorHora = new JLabel("Valor Hora: ");
        labelValorHora.setBounds(50, 170, 120, 50);
        add(labelValorHora);

        labelCobroHora = new JLabel("$7.000");
        labelCobroHora.setBounds(120, 170, 120, 50);
        add(labelCobroHora);

        buttonAceptar = new JButton("Aceptar");
        buttonAceptar.setBounds(110, 220, 90, 40);
        add(buttonAceptar);

        buttonCerrar = new JButton("Cerrar");
        buttonCerrar.setBounds(230, 220, 90, 40);
        add(buttonCerrar);

        this.pacientes = pacientes;

        buttonAceptar.addActionListener(e -> {
            String nombreMedico = comboBoxNombreMedicos.getSelectedItem().toString();
            String nombrePaciente = textFieldNombrePacientes.getText();
            String especialista = comboBoxEspecialista.getSelectedItem().toString();
            String horaSeleccionada = comboBoxHorasDisponibleAtencion.getSelectedItem().toString();
            int valorHora = 7000;

            PacienteFrame nuevoPaciente = new PacienteFrame(nombrePaciente, nombreMedico, especialista, horaSeleccionada);
            pacientes.add(nuevoPaciente);
            textFieldNombrePacientes.setText("");

            JOptionPane.showMessageDialog(frame,
                    "Seleccionaste:\nNombre Médico: " + nombreMedico +
                            "\nNombre Paciente: " + nombrePaciente +
                            "\nEspecialista: " + especialista +
                            "\nHora Disponible: " + horaSeleccionada);
        });

        this.frame = new JFrame();
        frame.setVisible(true);

        buttonCerrar.addActionListener(e -> {
            PanelPrincipal mainPanel = new PanelPrincipal(pacientes);
            mainPanel.setVisible(true);
            dispose();
        });
    }
}