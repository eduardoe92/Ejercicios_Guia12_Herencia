package Ejecutores;

import Entidades.Ejercicio1Alquiler;
import Servicios.Ejercicio1AlquilerServicio;
import java.util.ArrayList;

public class Ejercicio1AlquilarAmarres {

    public static void main(String[] args) {
        Ejercicio1AlquilerServicio as = new Ejercicio1AlquilerServicio();
        ArrayList<Ejercicio1Alquiler> alquileres = new ArrayList();
        alquileres.add(as.alquilarEmbarcacion());
        System.out.println(alquileres.toString());
        for (Ejercicio1Alquiler rent : alquileres) {
            System.out.println("El precio final del alquiler es de $" + rent.costoAlquiler());
        }
    }
}
