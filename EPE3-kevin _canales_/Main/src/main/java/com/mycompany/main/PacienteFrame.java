
package com.mycompany.main;

public class PacienteFrame {
    
    private String nombrePacientes;
    private String nombreMedicos;
    private String especialista;
    private String horasDisponibleAtencion;

    public PacienteFrame(String nombrePaciente, String nombreMedico, String especialidad, String horasDisponibles) {
        this.nombrePacientes = nombrePaciente;
        this.nombreMedicos = nombreMedico;
        this.especialista = especialidad;
        this.horasDisponibleAtencion = horasDisponibles;
    }

    public String getNombrePaciente() {
        return nombrePacientes;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePacientes = nombrePaciente;
    }

    public String getNombreMedico() {
        return nombreMedicos;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedicos = nombreMedico;
    }

    public String getEspecialidad() {
        return especialista;
    }

    public void setEspecialidad(String especialidad) {
        this.especialista = especialidad;
    }

    public String getHorasDisponibles() {
        return horasDisponibleAtencion;
    }

    public void setHorasDisponibles(String horasDisponibles) {
        this.horasDisponibleAtencion = horasDisponibles;
    }
    
    
   
}