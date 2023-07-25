package Ejecutores;

import Entidades.Ejercicio4Empleado;
import Entidades.Ejercicio4Facultad;
import Entidades.Ejercicio4Persona;
import Servicios.Ejercicio4FacultadServicioGeneral;
import java.util.HashSet;

public class Ejercicio4RegistrarPersonasFacultad {

    public static void main(String[] args) {
        Ejercicio4FacultadServicioGeneral s = new Ejercicio4FacultadServicioGeneral();
        HashSet<Ejercicio4Empleado> personalDeServicio = new HashSet();
        HashSet<Ejercicio4Empleado> profesores = new HashSet();
        HashSet<Ejercicio4Persona> estudiantes = new HashSet();
        Ejercicio4Facultad f = s.crearFacultad(estudiantes, personalDeServicio, profesores);
        s.Menu(f);
    }
}
