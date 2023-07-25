
/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio.

A continuación, se detalla qué tipo de información debe gestionar esta aplicación:

• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package guia12ejercicioextra4;

import Service.PersonaService;
import java.util.Scanner;

public class Guia12EjercicioExtra4 {

    public static void main(String[] args) {
        menu();
    }

    public static void showMenu() {
        System.out.println("===========================");
        System.out.println("           MENU      ");
        System.out.println("===========================");
        System.out.println("");
        System.out.println("1- Cambiar el estado civil de una persona");
        System.out.println("2- Reasignacion de despacho de un empleado");
        System.out.println("3- Cambiar matricula de un estudiante");
        System.out.println("4- Cambio de departamento de un profesor");
        System.out.println("5- Traslado de seccion del personal de servicio");
        System.out.println("6- Mostrar toda la informacion");
        System.out.println("7- Salir");
        System.out.println("");
        System.out.print("Ingrese un valor y luego presione la tecla enter: ");
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        int opcion;
        do {
            showMenu();
            opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    ps.cambiarEstCivil();
                    break;
                case 2:
                    ps.cambiarDespacho();
                    break;
                case 3:
                    ps.cambiarMatricula();
                    break;
                case 4:
                    ps.cambiarDeDepartamento();
                    break;
                case 5:
                    ps.cambiarDeSeccion();
                    break;
                case 6:
                    System.out.println(ps.toString());
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 7);
    }
}
