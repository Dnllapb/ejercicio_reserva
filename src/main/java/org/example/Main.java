package org.example;

import org.example.Hotel.Hotel;
import org.example.Persona.Persona;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("-----------CREACION RESERVA HOTEL----------------------------------");
        Hotel hotel = new Hotel("Daniela Padilla",1032486410,32279,"14/10/2013","Reserva hotel","Hotel Decameon","Calle72 9 12","123456","Hotel 5 estrellas","Sencilla",54000f,5);

        System.out.println(hotel);
        hotel.realizarReserva(true );

        }

    }
