package Ejecutores;

import Entidades.Ejercicio3Alojamiento;
import Entidades.Ejercicio3ExtraHotel;
import Entidades.Ejercicio3Hotel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio3VerPreciosYFiltros {

    public static void main(String[] args) {
        ArrayList<Ejercicio3Alojamiento> hospedaje = new ArrayList();
        Ejercicio3Hotel.Hotel4 a1 = new Ejercicio3Hotel().new Hotel4();
        Ejercicio3Hotel.Hotel5 a2 = new Ejercicio3Hotel().new Hotel5();
        Entidades.Ejercicio3ExtraHotel.Camping a3 = new Entidades.Ejercicio3ExtraHotel().new Camping();
        Entidades.Ejercicio3ExtraHotel.Residencia a4 = new Entidades.Ejercicio3ExtraHotel().new Residencia();
        for (int i = 0; i < 4; i++) {
            hospedaje.add(a1.llenarHotel4());
            hospedaje.add(a2.llenarHotel5());
            hospedaje.add(a3.llenarCamping());
            hospedaje.add(a4.llenarResidencia());
        }
        ArrayList<Ejercicio3Hotel.Hotel4> comp = new ArrayList();
        System.out.println("Todos los alojamientos:\n");
        for (Ejercicio3Alojamiento ejercicio3Alojamiento : hospedaje) {
            System.out.println(ejercicio3Alojamiento);
            if (ejercicio3Alojamiento instanceof Ejercicio3Hotel.Hotel4) {
                comp.add((Ejercicio3Hotel.Hotel4) ejercicio3Alojamiento);
            }
            System.out.println(" ");
        }
        Collections.sort(comp, Comparator.comparingDouble(Ejercicio3Hotel::getPrecio).reversed());
        System.out.println("");
        System.out.println("Precios de hoteles de mayor a menor:\n");
        for (Ejercicio3Alojamiento alojamiento : comp) {
            System.out.println(alojamiento);
        }
        System.out.println("");
        System.out.println("Campings con restaurante:\n");
        for (Ejercicio3Alojamiento contRestaurante : hospedaje) {
            if (contRestaurante instanceof Entidades.Ejercicio3ExtraHotel.Camping) {
                if (((Ejercicio3ExtraHotel.Camping) contRestaurante).isRestaurante()) {
                    System.out.println(contRestaurante);
                }
            }
        }
        System.out.println("");
        System.out.println("Residencias que ofrecen descuento:\n");
        for (Ejercicio3Alojamiento contDescuento : hospedaje) {
            if (contDescuento instanceof Entidades.Ejercicio3ExtraHotel.Residencia) {
                if (((Ejercicio3ExtraHotel.Residencia) contDescuento).isDescuento()) {
                    System.out.println(contDescuento);
                }
            }
        }
    }

}
