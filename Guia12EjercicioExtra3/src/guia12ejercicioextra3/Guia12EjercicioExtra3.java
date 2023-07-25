
/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:

• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.

• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de Conferencia,
Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier cliente,
pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro será.

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) +
(valor agregado por gimnasio) + (valor agregado por limosinas).

Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos.
Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
Realizar un programa en el que se representen todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package guia12ejercicioextra3;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel;
import Entities.Hotel4Estrellas;
import Entities.Hotel5Estrellas;
import Entities.Residencia;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Guia12EjercicioExtra3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        List<Alojamiento> alojamientos = new ArrayList<>();

        List<Residencia> hoteles4Estrellas = new ArrayList<>();

// Creación de instancias de Residencia que son hoteles 4 estrellas
        Residencia hotel1 = new Residencia(10, true, true, true, 500, "Hotel 1", "Dirección 1", "Localidad 1", "Gerente 1");
        Residencia hotel2 = new Residencia(20, false, false, true, 800, "Hotel 2", "Dirección 2", "Localidad 2", "Gerente 2");
        Residencia hotel3 = new Residencia(15, true, true, false, 600, "Hotel 3", "Dirección 3", "Localidad 3", "Gerente 3");

// Agregar los hoteles a la lista de hoteles 4 estrellas
        hoteles4Estrellas.add(hotel1);
        hoteles4Estrellas.add(hotel2);
        hoteles4Estrellas.add(hotel3);

        boolean salir = false;
        while (!salir) {
            System.out.println("Menu:");
            System.out.println("1. Crear Hotel 4 Estrellas");
            System.out.println("2. Crear Hotel 5 Estrellas");
            System.out.println("3. Crear Residencia");
            System.out.println("4. Crear Camping");
            System.out.println("5. Mostrar Alojamientos");
            System.out.println("6. Hoteles de más caro a más barato");
            System.out.println("7. Campings con restaurante");
            System.out.println("8. Residencias con descuento");
            System.out.println("9. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Hotel4Estrellas hotel4 = new Hotel4Estrellas().crearHotel4();
                    alojamientos.add(hotel4);
                    System.out.println("Hotel 4 Estrellas creado correctamente.");
                    break;
                case 2:
                    Hotel5Estrellas hotel5 = new Hotel5Estrellas().crearHotel5();
                    alojamientos.add(hotel5);
                    System.out.println("Hotel 5 Estrellas creado correctamente.");
                    break;
                case 3:
                    Residencia residencia = new Residencia().crearResidencia();
                    alojamientos.add(residencia);
                    System.out.println("Residencia creada correctamente.");
                    break;
                case 4:
                    Camping camping = new Camping().crearCamping();
                    alojamientos.add(camping);
                    System.out.println("Camping creado correctamente.");
                    break;
                case 5:
                    System.out.println("Alojamientos registrados:");
                    for (Alojamiento alojamiento : alojamientos) {
                        if (alojamiento instanceof Hotel) {
                            System.out.println(alojamiento.toString());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Hoteles de mas caro a mas barato:");
                    alojamientos.stream()
                            .filter(a -> a instanceof Hotel)
                            .sorted(Comparator.comparingDouble(Alojamiento::getPrecio).reversed())
                            .forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Campings con restaurante:");
                    alojamientos.stream()
                            .filter(a -> a instanceof Camping)
                            .filter(a -> ((Camping) a).tieneRestaurante())
                            .forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Residencias con descuento:");
                    alojamientos.stream()
                            .filter(a -> a instanceof Residencia)
                            .filter(a -> ((Residencia) a).tieneDescuento())
                            .forEach(System.out::println);
                    break;
                case 9:
                    salir = true;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                    break;
            }
            System.out.println();
        }
    }
}
