package Ejecutores;

import Entidades.*;
import java.util.ArrayList;

public class Ejercicio2VerEspecificaciones {

    public static void main(String[] args) {
        ArrayList<Ejercicio2Edificio> edificio = new ArrayList();
        Ejercicio2Polideportivo e1 = new Ejercicio2Polideportivo();
        Ejercicio2EdificioDeOficinas e2 = new Ejercicio2EdificioDeOficinas();
        edificio.add(e1.llenarPolideportivo());
        edificio.add(e1.llenarPolideportivo());
        edificio.add(e2.llenarEdificioOffice());
        edificio.add(e2.llenarEdificioOffice());
        int contP = 0;
        int contE = 0;
        for (Ejercicio2Edificio aux : edificio) {
            if (aux instanceof Ejercicio2Polideportivo) {
                contP++;
                System.out.println("Polideportivo n° " + contP);
                if (((Ejercicio2Polideportivo) aux).isTechado()) {
                    System.out.println("El polideportivo está techado");
                } else {
                    System.out.println("El polideportivo es a cielo abierto");
                }
                System.out.println("La superficie del polideportivo es de " + aux.calcularSuperficie() + " m^2");
                System.out.println("El volumen del polideportivo es de " + aux.calcularVolumen() + " m^3");
            }
            if (aux instanceof Ejercicio2EdificioDeOficinas) {
                contE++;
                System.out.println("Edificio de oficinas n° " + contE);
                int personasXEdificio = ((Ejercicio2EdificioDeOficinas) aux).getCantPersonasXOficina() * ((Ejercicio2EdificioDeOficinas) aux).getNumOficinas() * ((Ejercicio2EdificioDeOficinas) aux).getNumPisos();
                System.out.println(personasXEdificio + " personas trabajan en el edificio de oficinas");
                System.out.println("La superficie del edificio de oficinas es de " + aux.calcularSuperficie() + " m^2");
                System.out.println("El volumen del edificio de oficinas es de " + aux.calcularVolumen() + " m^3");
            }
        }
        System.out.println("Hay " + contP + " polideportivos");
        System.out.println("Hay " + contE + " edificios de oficinas");
    }

}
