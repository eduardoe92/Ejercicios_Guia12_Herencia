package Entidades;

import java.util.Scanner;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoDeInstalacion;

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo " + nombre + ", tipo de instalacion: " + tipoDeInstalacion;
    }
    
    @Override
    public void calcularSuperficie() {
        double superficie = getLargo() * getAncho();
        System.out.println("La superficie del Polideportivo " + nombre +" es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = getLargo() * getAncho() * getAlto();
        System.out.println("El volumen del Polideportivo " + nombre +" es: " + volumen);
    }
}
