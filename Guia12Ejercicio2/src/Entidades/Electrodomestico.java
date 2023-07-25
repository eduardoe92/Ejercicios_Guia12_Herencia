package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    private float precio;
    private String color;
    private char consumo;
    private float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, char consumo, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char[] caracterConsumo = {'A', 'B', 'C', 'D', 'E'};
        char consumoEnergetico = Character.toUpperCase(letra);
        for (char caracter : caracterConsumo) {
            if (caracter == consumoEnergetico) {
                return consumoEnergetico;
            }
        }
        return 'F';
    }

    public String comprobarColor(String color) {
        String[] coloresValidos = {"Negro", "Rojo", "Azul", "Gris"};
        String colorValido = color.toLowerCase();
        for (String c : coloresValidos) {
            if (c.toLowerCase().equals(colorValido)) {
                return c;
            }
        }
        return "Blanco";
    }

    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el color del electrodomestico (Blanco, Negro, Rojo, Azul o Gris): ");
        String color = scanner.nextLine();
        System.out.println("Ingrese el consumo energetico (A-F): ");
        char consumo = scanner.nextLine().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico: ");
        float peso = scanner.nextFloat();

        setColor(comprobarColor(color));
        setConsumo(comprobarConsumoEnergetico(consumo));
        setPeso(peso);
        setPrecio(1000);
    }

    public void precioFinal() {
        float precioConsumo;
        float precioPeso;

        switch (getConsumo()) {
            case 'A':
                precioConsumo = 1000;
                break;
            case 'B':
                precioConsumo = 800;
                break;
            case 'C':
                precioConsumo = 600;
                break;
            case 'D':
                precioConsumo = 500;
                break;
            case 'E':
                precioConsumo = 300;
                break;
            default:
                precioConsumo = 100;
                break;
        }

        if (getPeso() >= 1 && getPeso() <= 19) {
            precioPeso = 100;
        } else if (getPeso() >= 20 && getPeso() <= 49) {
            precioPeso = 500;
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            precioPeso = 800;
        } else {
            precioPeso = 1000;
        }

        float precioFinal = getPrecio() + precioConsumo + precioPeso;
        setPrecio(precioFinal);
    }
}

