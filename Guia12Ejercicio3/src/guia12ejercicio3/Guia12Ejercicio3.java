
/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package guia12ejercicio3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class Guia12Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Lavadora lavadora = new Lavadora(35, 1500, "blanco", 'A', 25);
        electrodomesticos.add(lavadora);

        Televisor televisor = new Televisor(40, true, 3000, "negro", 'B', 50);
        electrodomesticos.add(televisor);

        Lavadora lavadora2 = new Lavadora(30, 2000, "gris", 'C', 30);
        electrodomesticos.add(lavadora2);

        Televisor televisor2 = new Televisor(50, false, 4000, "azul", 'D', 60);
        electrodomesticos.add(televisor2);

        float precioTotal = 0;
        float precioTotalLavadoras = 0;
        float precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();

            precioTotal += electrodomestico.getPrecio();

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.getPrecio();
                System.out.print("Lavadora, ");
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.getPrecio();
                System.out.print("Televisor, ");
            }
            System.out.println("precio final: $" + electrodomestico.getPrecio());
        }

        System.out.println("");
        System.out.println("Precio total de todos los electrodomesticos: $" + precioTotal);
        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
    }
}
