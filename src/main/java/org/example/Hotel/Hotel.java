package org.example.Hotel;

import org.example.Persona.Persona;
import org.example.Reservar;

import java.util.Scanner;

public class Hotel extends Persona implements Reservar {
    private String nombreHotel;
    private String direccionHotel;
    private String telefonoHotel;
    private String tipoDeHotel;
    private String tipoDeHabitacion;
    private double precioNoche;
    private int diasReserva;
    private double totalReserva;

    Scanner lectura = new Scanner(System.in);

    public Hotel(String nombrePersona, int idPersona, int celularPersona, String fechaReserva, String tipoReserva, String nombreHotel, String direccionHotel, String telefonoHotel, String tipoDeHotel, String tipoDeHabitacion, double precioNoche, int diasReserva) {
        super(nombrePersona,idPersona,celularPersona,fechaReserva,tipoReserva);
        this.nombreHotel = nombreHotel;
        this.direccionHotel = direccionHotel;
        this.telefonoHotel = telefonoHotel;
        this.tipoDeHotel = tipoDeHotel;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precioNoche = precioNoche;
        this.diasReserva = diasReserva;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(String telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

    public String getTipoDeHotel() {
        return tipoDeHotel;
    }

    public void setTipoDeHotel(String tipoDeHotel) {
        this.tipoDeHotel = tipoDeHotel;
    }

    public String getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

    @Override
    public String toString() {
        return "Información de Reserva:" +
                "nombre Hotel='" + nombreHotel + '\'' +
                ", direccion Hotel='" + direccionHotel + '\'' +
                ", telefono Hotel='" + telefonoHotel + '\'' +
                ", Hotel='" + tipoDeHotel + '\'' +
                ", tipoDeHabitacion='" + tipoDeHabitacion + '\'' +
                ", precioNoche='" + precioNoche + '\'' +
                ", diasReserva='" + diasReserva + '\'' +
                '.';
    }

    @Override
    public void realizarReserva( boolean confirmarReserva) {

        totalReserva = getDiasReserva()*getPrecioNoche();
        if (confirmarReserva = true)
        {
            System.out.println("Gracias por confirmar tu reserva:  " + "\n" + confirmarReserva  );
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
