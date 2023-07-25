package Servicios;

import Entidades.Ejercicio1Alquiler;
import Entidades.Ejercicio1Barco;
import Entidades.Ejercicio1BarcoAMotor;
import Entidades.Ejercicio1Velero;
import Entidades.Ejercicio1Yate;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1AlquilerServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejercicio1Alquiler alquilarEmbarcacion() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su DNI");
        int dniCliente = leer.nextInt();
        int posAmarre = (int) (Math.random() * 25 + 1);
        System.out.println("Ingrese la fecha de alquiler: DD/MM/AAAA");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        System.out.println("Ingrese la fecha de devolución: DD/MM/AAAA");
        int diaFin = leer.nextInt();
        int mesFin = leer.nextInt();
        int anioFin = leer.nextInt();
        Ejercicio1Barco barco = this.crearBarco();
        return new Ejercicio1Alquiler(nombre, dniCliente, posAmarre, new Date(anio - 1900, mes - 1, dia), new Date(anioFin - 1900, mesFin - 1, diaFin), barco);
    }

    public Ejercicio1Barco crearBarco() {
        System.out.println("Ingrese la matrícula del barco");
        String matricula = leer.next();
        System.out.println("Ingrese la eslora en metros");
        double eslora = leer.nextDouble();
        System.out.println("Ingrese el año de fabricación del barco");
        int anioDeFabricacion = leer.nextInt();
        System.out.println("Ingrese el tipo de barco especial:\n1 - Velero\n2 - Barco motorizado\n3 - Yate");
        int tipo = leer.nextInt();
        while (tipo != 1 || tipo != 2 || tipo != 3) {
            switch (tipo) {
                case 1:
                    return this.completarVelero(matricula, eslora, anioDeFabricacion);
                case 2:
                    return this.completarBarcoMotorizado(matricula, eslora, anioDeFabricacion);
                case 3:
                    return this.completarYate(matricula, eslora, anioDeFabricacion);
                default:
                    System.out.println("La opción ingresada es incorrecta");
            }
        }
        return null;
    }

    public Ejercicio1Velero completarVelero(String matricula, double eslora, int anioDeFabricacion) {
        System.out.println("Ingrese la cantidad de mástiles equipados");
        int numMastiles = leer.nextInt();
        return new Ejercicio1Velero(numMastiles, matricula, eslora, anioDeFabricacion);
    }

    public Ejercicio1BarcoAMotor completarBarcoMotorizado(String matricula, double eslora, int anioDeFabricacion) {
        System.out.println("Ingrese la potencia instalada en caballos a vapor");
        int potencia = leer.nextInt();
        return new Ejercicio1BarcoAMotor(potencia, matricula, eslora, anioDeFabricacion);
    }

    public Ejercicio1Yate completarYate(String matricula, double eslora, int anioDeFabricacion) {
        System.out.println("Ingrese la potencia instalada en caballos a vapor");
        int potencia = leer.nextInt();
        System.out.println("Ingrese la cantidad de camarotes");
        int numCamarotes = leer.nextInt();
        return new Ejercicio1Yate(potencia, numCamarotes, matricula, eslora, anioDeFabricacion);
    }

}
