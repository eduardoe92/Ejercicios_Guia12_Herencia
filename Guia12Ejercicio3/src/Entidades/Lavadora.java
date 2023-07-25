package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private float carga;

    public Lavadora() {
    }

    public Lavadora(float carga, float precio, String color, char consumo, float peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner scanner = new Scanner(System.in);
        crearElectrodomestico();

        System.out.println("Ingrese la carga de la lavadora en Kg: ");
        float carga = scanner.nextFloat();
        setCarga(carga);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500);
        }
    }
}





