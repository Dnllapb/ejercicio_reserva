package org.example;

import org.example.CitaMedica.CitaMedica;
import org.example.Hotel.Hotel;
import org.example.Persona.Persona;
import org.example.Restaurante.Restaurante;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*System.out.println("-----------CREACION RESERVA HOTEL----------------------------------");
        Hotel hotel = new Hotel("Daniela Padilla",1032486410,32279,"14/10/2013","Reserva hotel","Hotel Decameon","Calle72 9 12","123456","Hotel 5 estrellas","Sencilla",54000f,5);

        System.out.println(hotel);
        hotel.realizarReserva(true );
        hotel.medioPago(1);

        System.out.println("-----------CREACION RESERVA CITA MEDICA----------------------------------");
        CitaMedica citamedica = new CitaMedica("Daniela Padilla",1032486410,32279,"14/10/2013","Reserva Cita medica","Sanitas calle 80", "Av. calle 80 18 23","Maria Morales","Consulta Gneneral");
        System.out.println(citamedica);
        hotel.realizarReserva(true );*/

        System.out.println("-----------CREACION RESERVA RESTAURANTE----------------------------------");
        Restaurante restaurante = new Restaurante("Daniela Padilla",1032486410,32279,"14/10/2013","Reserva restaurante","Papas toxicas", "Calle 72 15 20",20);
        System.out.println(restaurante);
        restaurante.realizarReserva(true );
        restaurante.medioPago(1);
        }

    }
