package Entidades;

import java.util.Scanner;

public class EdificioOficinas extends Edificio {

    private int numOficinas;
    private int cantPersonas;
    private int numPisos;

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioOficinas() {
    }

    public EdificioOficinas(int numOficinas, int cantPersonas, int numPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "EdificioOficinas: " + "Numero de Oficinas: " + numOficinas + ", Cantidad de Personas: " + cantPersonas + ", Numero de Pisos: " + numPisos;
    }

    public void crearEdificio() {
        System.out.println("¿Cuántos pisos tiene el edificio?");
        numPisos = leer.nextInt();

        do {
            System.out.println("¿Cuantas oficinas tiene el edificio? (Mínimo una oficina por piso)");
            numOficinas = leer.nextInt();
        } while (numOficinas < numPisos);

        System.out.println("¿Cuantas personas pueden trabajar en cada oficina?");
        cantPersonas = leer.nextInt();
    }

    public void cantPersonas() {
        int cantPersonasPiso = cantPersonas * numOficinas;
        int cantPersonasTotal = cantPersonasPiso * numPisos;

        System.out.println("Cantidad de personas que entran por piso: " + cantPersonasPiso);
        System.out.println("Cantidad de personas que entran en todo el edificio: " + cantPersonasTotal);
    }

    @Override
    public void calcularSuperficie() {
        double superficie = getLargo() * getAncho() * numPisos;
        System.out.println("La superficie del edificio de oficinas es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = getLargo() * getAncho() * getAlto() * numPisos;
        System.out.println("El volumen del edificio de oficinas es: " + volumen);
    }
}
