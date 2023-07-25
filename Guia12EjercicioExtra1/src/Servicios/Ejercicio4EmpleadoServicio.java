package Servicios;

import Entidades.Ejercicio4Empleado;
import Entidades.Ejercicio4Persona;
import Entidades.Ejercicio4PersonalDeServicio;
import Entidades.Ejercicio4Profesor;
import Enumeraciones.Ejercicio4CarrerasYAsignaturas;
import Enumeraciones.Ejercicio4PuestosDeTrabajo;

public class Ejercicio4EmpleadoServicio extends Ejercicio4PersonaServicio {

    public Ejercicio4Empleado crearEmpleado() {
        Ejercicio4Persona p = crearPersona();
        System.out.println("Ingrese el año de incorporación a la facultad");
        int anioIncorporacion = leer.nextInt();
        while (anioIncorporacion < 1900 || anioIncorporacion > 2024) {
            System.out.println("Error. Vuelva a ingresar el año de incorporación correctamente");
            anioIncorporacion = leer.nextInt();
        }
        System.out.println("Ingrese el número de despacho");
        int numDespacho = leer.nextInt();
        return new Ejercicio4Empleado(anioIncorporacion, numDespacho, p.getNombre(), p.getApellido(), p.getEstadoCivil(), p.getId(), p.getSexo());
    }

    public String crearMateria() {
        String nuevo = "";
        int cont = (int) (Math.random() * 21);
        int vuelta = 0;
        for (Ejercicio4CarrerasYAsignaturas aux : Ejercicio4CarrerasYAsignaturas.values()) {
            if (vuelta == cont) {
                nuevo = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return nuevo;
    }

    public Ejercicio4Profesor crearProfe() {
        Ejercicio4Empleado e = crearEmpleado();
        String materia = crearMateria();
        return new Ejercicio4Profesor(materia, e.getAnioIncorporacion(), e.getNumDespacho(), e.getNombre(), e.getApellido(), e.getEstadoCivil(), e.getId(), e.getSexo());
    }

    public Ejercicio4Profesor crearProfexCarrera() {
        String materia = cambioCarrera();
        Ejercicio4Empleado e = crearEmpleado();
        return new Ejercicio4Profesor(materia, e.getAnioIncorporacion(), e.getNumDespacho(), e.getNombre(), e.getApellido(), e.getEstadoCivil(), e.getId(), e.getSexo());
    }

    public Ejercicio4PersonalDeServicio crearPersServ() {
        Ejercicio4Empleado e = crearEmpleado();
        String seccion = service();
        return new Ejercicio4PersonalDeServicio(seccion, e.getAnioIncorporacion(), e.getNumDespacho(), e.getNombre(), e.getApellido(), e.getEstadoCivil(), e.getId(), e.getSexo());
    }

    public Ejercicio4PersonalDeServicio crearPersServxArea() {
        String seccion = cambioServicio();
        Ejercicio4Empleado e = crearEmpleado();
        return new Ejercicio4PersonalDeServicio(seccion, e.getAnioIncorporacion(), e.getNumDespacho(), e.getNombre(), e.getApellido(), e.getEstadoCivil(), e.getId(), e.getSexo());
    }

    public String service() {
        String nuevo = "";
        int cont = (int) (Math.random() * 16);
        int vuelta = 0;
        for (Ejercicio4PuestosDeTrabajo aux : Ejercicio4PuestosDeTrabajo.values()) {
            if (vuelta == cont) {
                nuevo = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return nuevo;
    }

    public void mostrarCarrera() {
        int cont = 0;
        System.out.println("Carreras disponibles: ");
        for (Ejercicio4CarrerasYAsignaturas aux : Ejercicio4CarrerasYAsignaturas.values()) {
            System.out.print(aux.getNum() + "). " + aux.getCodigo() + ". ");
            if (cont == 4) {
                cont = 0;
                System.out.println("");
            }
            cont++;
        }
    }

    public void mostrarServicios() {
        int cont = 0;
        System.out.println("Áreas de Servicio : ");
        for (Ejercicio4PuestosDeTrabajo aux : Ejercicio4PuestosDeTrabajo.values()) {
            System.out.print(aux.getNum() + "). " + aux.getCodigo() + ". ");
            if (cont == 5) {
                cont = 0;
                System.out.println("");
            }
            cont++;
        }
    }

    public String cambioCarrera() {
        mostrarCarrera();
        System.out.println("\nSeleccione la carrera por número");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Sólo ingrese números del 1 al 21");
            num = leer.nextInt();
        }
        String nuevo = auxCambiarCarrera(num);
        System.out.println("Tu carrera nueva es " + nuevo);
        return nuevo;
    }

    public String auxCambiarCarrera(int num) {
        String cambio = "";
        for (Ejercicio4CarrerasYAsignaturas aux : Ejercicio4CarrerasYAsignaturas.values()) {
            if (num == aux.getNum()) {
                cambio = aux.getCodigo();
                break;
            }
        }
        return cambio;
    }

    public String cambioServicio() {
        mostrarServicios();
        System.out.println("\nSeleccione el área de servicio por número =");
        int num = leer.nextInt();
        while (num < 1 || num > 16) {
            System.out.println("Sólo ingrese números del 1 al 16");
            num = leer.nextInt();
        }
        String cambio = auxCambiarServicio(num);
        System.out.println("El servicio nuevo asignado para prestar es " + cambio);

        return cambio;
    }

    public String auxCambiarServicio(int num) {
        String cambio = "";
        for (Ejercicio4PuestosDeTrabajo aux : Ejercicio4PuestosDeTrabajo.values()) {
            if (num == aux.getNum()) {
                cambio = aux.getCodigo();
                break;
            }
        }
        return cambio;
    }

}
