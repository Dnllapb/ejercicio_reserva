package org.example.CitaMedica;

import org.example.Persona.Persona;
import org.example.Reservar;

import java.util.Scanner;

public class CitaMedica extends Persona implements Reservar {

    private String centroMedico;
    private String direccionCentroMedico;
    private String nombreMedico;
    private String tipoConsulta;
    private double totalReserva;

    Scanner lectura = new Scanner(System.in);

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

    @Override
    public void realizarReserva( boolean confirmarReserva) {

        double totalReserva = 4800;
        if (confirmarReserva = true)
        {
            System.out.println("Gracias por confirmar tu cita medica:  " + "\n" + confirmarReserva + "El valor a cancelar es : \n " + totalReserva );
        }
        else System.out.println("Tu reserva no fue confirmada intentalo nuevamente");

    }

    @Override
    public void medioPago(int medioDePago) {

        System.out.println("Por favor ingresa el medio de pago");
        System.out.println("1. Efectivo "+ "\n" +
                "2. Tarjeta credito" + "\n" +
                "3. Tarjeta debito");
        medioDePago = lectura.nextInt();
        switch (medioDePago)
        {
            case 1:
                System.out.println("Tu medio de pago es efectivo el valor a cancelar es: " + totalReserva );
                break;
            case 2:
                System.out.println("Tu medio de pago es tarjeta credito el valor a cancelar es: " + totalReserva );
                break;
            case 3:
                System.out.println("Tu medio de pago es tarjeta debito el valor a cancelar es: " + totalReserva );
                break;
            default:
                System.out.println("Por favor selecciona una opcion");
        }
    }
}
