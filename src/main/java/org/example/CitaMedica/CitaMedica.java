package org.example.CitaMedica;

import org.example.Persona.Persona;

public class CitaMedica extends Persona {

    private String centroMedico;
    private String direccionCentroMedico;
    private String nombreMedico;
    private String tipoConsulta;

    public CitaMedica(String nombrePersona, int idPersona, int celularPersona, String fechaReserva, String tipoReserva, String centroMedico, String direccionCentroMedico, String nombreMedico, String tipoConsulta) {
        super(nombrePersona, idPersona, celularPersona, fechaReserva, tipoReserva);
        this.centroMedico = centroMedico;
        this.direccionCentroMedico = direccionCentroMedico;
        this.nombreMedico = nombreMedico;
        this.tipoConsulta = tipoConsulta;
    }


    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    public String getDireccionCentroMedico() {
        return direccionCentroMedico;
    }

    public void setDireccionCentroMedico(String direccionCentroMedico) {
        this.direccionCentroMedico = direccionCentroMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "centroMedico='" + centroMedico + '\'' +
                ", direccionCentroMedico='" + direccionCentroMedico + '\'' +
                ", nombreMedico='" + nombreMedico + '\'' +
                ", tipoConsulta='" + tipoConsulta + '\'' +
                '}';
    }
}
