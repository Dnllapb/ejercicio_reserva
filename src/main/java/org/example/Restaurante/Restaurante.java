package org.example.Restaurante;

import org.example.Persona.Persona;

public class Restaurante extends Persona {

    private String nombreRestaurante;
    private String direccionRestaurante;

    public Restaurante(String nombrePersona, int idPersona, int celularPersona, String fechaReserva, String tipoReserva, String nombreRestaurante, String direccionRestaurante) {
        super(nombrePersona, idPersona, celularPersona, fechaReserva, tipoReserva);
        this.nombreRestaurante = nombreRestaurante;
        this.direccionRestaurante = direccionRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getDireccionRestaurante() {
        return direccionRestaurante;
    }

    public void setDireccionRestaurante(String direccionRestaurante) {
        this.direccionRestaurante = direccionRestaurante;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombreRestaurante='" + nombreRestaurante + '\'' +
                ", direccionRestaurante='" + direccionRestaurante + '\'' +
                '}';
    }
}
