/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.

Generar una clase Main que realice lo siguiente:

public static void main(String[] args) {
// Declaración del obieto Perro
Animal perrol = new Perro("Stich", "Carnivoro", 15, "Doberman");
perrol.Alimentarse();
// Declaración de otro objeto Perro
Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua") :
perro2. Alimentarse();
//Declaración del objeto Gato
Animal gato1 = new Gato ("Pelusa", "Galletas", 15, "Siamés");
gato1. AlimentarseO);
//Declaración del objeto Caballo
Animal caballol1 = new Caballo("Trueno", "Pasto", 10, "Azabache");

 */
package guia12ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Guia12Ejercicio1 {

    public static void main(String[] args) {

        List<Animal> array = new ArrayList();

        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Kazumi", "Carnivora", 1, "Naranja");
        Animal caballo1 = new Caballo("Trueno", "Pasto", 10, "Azabache");

        array.add(perro1);
        array.add(perro2);
        array.add(gato1);
        array.add(caballo1);

        for (Animal aux : array) {
            aux.Alimentarse();
        }

    }

}
