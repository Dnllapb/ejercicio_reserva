package org.example.Restaurante;

import org.example.Persona.Persona;
import org.example.Reservar;

import java.util.Scanner;

public class Restaurante extends Persona implements Reservar {

    private String nombreRestaurante;
    private String direccionRestaurante;
    private double totalReserva;
    private int mesasDisponibles;
    private double valorReserva= 20000;

    Scanner lectura = new Scanner(System.in);

    public Restaurante(String nombrePersona, int idPersona, int celularPersona, String fechaReserva, String tipoReserva, String nombreRestaurante, String direccionRestaurante,int mesasDisponibles) {
        super(nombrePersona, idPersona, celularPersona, fechaReserva, tipoReserva);
        this.nombreRestaurante = nombreRestaurante;
        this.direccionRestaurante = direccionRestaurante;
        this.mesasDisponibles = mesasDisponibles;
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
    public int getMesasDisponibles() {
        return mesasDisponibles;
    }

    public void setMesasDisponibles(int mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombreRestaurante='" + nombreRestaurante + '\'' +
                ", direccionRestaurante='" + direccionRestaurante + '\'' +
                '}';
    }

    public void realizarReserva( boolean confirmarReserva) {

        System.out.println("Por favor ingresa el numero de mesas a reservar");
        mesasDisponibles = lectura.nextInt();

        if (mesasDisponibles  >= 0)
        {
            System.out.println("Hay disponibilidad de mesas para reservar" );
        }
        if (confirmarReserva = true) {
            System.out.println("Por favor confirma tu reserva:  " + "\n" + confirmarReserva  );
        }
        else
        {
            System.out.println("Tu reserva no fue confirmada intentalo nuevamente");
        }

    }
    @Override
    public void medioPago(int medioDePago) {

        totalReserva = getMesasDisponibles()* valorReserva;
        System.out.println("Por favor ingresa el medio de pago");
        System.out.println("1. Efectivo "+ "\n" +
                "2. Tarjeta credito" + "\n" +
                "3. Tarjeta debito");
        medioDePago = lectura.nextInt();
        switch (medioDePago)
        {
            case 1:
                System.out.println("El valor de reserva por cada mesa es de :" + valorReserva);
                System.out.println("Tu medio de pago es efectivo el valor a cancelar es: " + totalReserva );
                break;
            case 2:
                System.out.println("El valor de reserva por cada mesa es de :" + valorReserva);

                System.out.println("Tu medio de pago es tarjeta credito el valor a cancelar es: " + totalReserva );
                break;
            case 3:
                System.out.println("El valor de reserva por cada mesa es de :" + valorReserva);
                System.out.println("Tu medio de pago es tarjeta debito el valor a cancelar es: " + totalReserva );
                break;
            default:
                System.out.println("Por favor selecciona una opcion");
        }


    }

}


