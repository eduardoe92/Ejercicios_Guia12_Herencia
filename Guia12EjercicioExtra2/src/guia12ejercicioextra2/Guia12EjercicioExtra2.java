
/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/

package guia12ejercicioextra2;

import Entidades.Edificio;
import Entidades.EdificioOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class Guia12EjercicioExtra2 {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edificaciones = new ArrayList();
        
        Polideportivo polideportivo1 = new Polideportivo("Santiago Bernabeu", "Techado", 50.0, 30.0, 20.0);
        Polideportivo polideportivo2 = new Polideportivo("Metropolitano", "Abierto", 40.0, 25.0, 18.0);
        
        EdificioOficinas edificioOficinas1 = new EdificioOficinas(10, 100, 5, 30.0, 15.0, 10.0);
        EdificioOficinas edificioOficinas2 = new EdificioOficinas(8, 80, 4, 25.0, 12.0, 8.0);
        
        edificaciones.add(polideportivo1);
        edificaciones.add(polideportivo2);
        edificaciones.add(edificioOficinas1);
        edificaciones.add(edificioOficinas2);
        
        for (Edificio edificio : edificaciones) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoDeInstalacion().equalsIgnoreCase("Techado")) {
                    System.out.println(polideportivo.getNombre() + " es un polideportivo techado.");
                } else {
                    System.out.println(polideportivo.getNombre() + " es un polideportivo abierto.");
                }
            } else if (edificio instanceof EdificioOficinas) {
                EdificioOficinas edificioOficinas = (EdificioOficinas) edificio;
                edificioOficinas.cantPersonas();
            }
            
            System.out.println();
        }
    }
}
