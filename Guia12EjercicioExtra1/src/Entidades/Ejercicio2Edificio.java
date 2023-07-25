package Entidades;

import java.util.Scanner;

public abstract class Ejercicio2Edificio {

    protected double ancho, alto, largo;
    protected Scanner leer = new Scanner(System.in);

    public Ejercicio2Edificio() {
    }

    public Ejercicio2Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ejercicio2Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    public double calcularSuperficie() {
        return largo * ancho;
    }

    public double calcularVolumen() {
        return alto * largo * ancho;
    }

}
