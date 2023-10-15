package org.example.Persona;

import org.example.Reservar;

public abstract class Persona  {

    private String nombrePersona;
    private int idPersona;
    private int celularPersona;
    private String fechaReserva;
    private String tipoReserva;

    public Persona(String nombrePersona, int idPersona, int celularPersona, String fechaReserva, String tipoReserva) {
        this.nombrePersona = nombrePersona;
        this.idPersona = idPersona;
        this.celularPersona = celularPersona;
        this.fechaReserva = fechaReserva;
        this.tipoReserva = tipoReserva;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getCelularPersona() {
        return celularPersona;
    }

    public void setCelularPersona(int celularPersona) {
        this.celularPersona = celularPersona;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", idPersona=" + idPersona +
                ", celularPersona=" + celularPersona +
                ", fechaReserva='" + fechaReserva + '\'' +
                ", tipoReserva='" + tipoReserva + '\'' +
                '}';
    }
}
