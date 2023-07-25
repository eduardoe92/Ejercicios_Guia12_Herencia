
/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos.

En el main se crearán las formas y se mostrará el resultado final.

Área circulo: PI * radio ^ 2 
Perímetro circulo: PI * diámetro.

Área rectángulo: base * altura
Perímetro rectángulo: (base + altura) * 2.
 */
package guia12ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class Guia12Ejercicio4 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(10); //Radio
        Rectangulo rectangulo = new Rectangulo(8, 5); //Base y Altura

        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();

        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();

        System.out.println("Circulo");
        System.out.println("Area: " + areaCirculo);
        System.out.println("Perimetro: " + perimetroCirculo);
        System.out.println("");
        System.out.println("Rectangulo");
        System.out.println("Area: " + areaRectangulo);
        System.out.println("Perimetro: " + perimetroRectangulo);

    }

}
