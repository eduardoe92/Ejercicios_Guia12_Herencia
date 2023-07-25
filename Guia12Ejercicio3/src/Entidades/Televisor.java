package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, float precio, String color, char consumo, float peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean hasSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner scanner = new Scanner(System.in);
        crearElectrodomestico();

        System.out.println("Ingrese la resolución del televisor (en pulgadas): ");
        int resolucion = scanner.nextInt();
        System.out.println("¿Tiene sintonizador TDT incorporado? (S/N): ");
        String respuestaTDT = scanner.next();
        boolean sintonizadorTDT = respuestaTDT.equalsIgnoreCase("S");

        setResolucion(resolucion);
        setSintonizadorTDT(sintonizadorTDT);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (getResolucion() > 40) {
            float incrementoPorResolucion = getPrecio() * 0.30f;
            setPrecio(getPrecio() + incrementoPorResolucion);
        }

        if (hasSintonizadorTDT()) {
            setPrecio(getPrecio() + 500);
        }
    }
}
