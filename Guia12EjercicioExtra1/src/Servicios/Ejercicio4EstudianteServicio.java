package Servicios;

import Entidades.Ejercicio4Estudiante;
import Entidades.Ejercicio4Persona;
import Enumeraciones.Ejercicio4CarrerasYAsignaturas;

public class Ejercicio4EstudianteServicio extends Ejercicio4PersonaServicio {

    Ejercicio4EmpleadoServicio es = new Ejercicio4EmpleadoServicio();

    public Ejercicio4Estudiante crearEstudiante() {
        Ejercicio4Persona p = super.crearPersona();
        String curso = crearCarrera();
        return new Ejercicio4Estudiante(curso, p.getNombre(), p.getApellido(), p.getEstadoCivil(), p.getId(), p.getSexo());
    }

    public Ejercicio4Estudiante crearEstxCarrera() {
        Ejercicio4Persona p = super.crearPersona();
        String curso = es.cambioCarrera();
        return new Ejercicio4Estudiante(curso, p.getNombre(), p.getApellido(), p.getEstadoCivil(), p.getId(), p.getSexo());
    }

    public String crearCarrera() {
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
    
        public void CambiarCarrera(Ejercicio4Estudiante e) {
        es.mostrarCarrera();
        System.out.println("\n" + e.getNombre() + " " + e.getApellido()+ ", seleccione la nueva carrera por número :");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Sólo ingrese números del 1 al 21");
            num = leer.nextInt();
        }
        String nuevo = es.auxCambiarCarrera(num);
        e.setCurso(nuevo);
        System.out.println(e.getNombre() + " " + e.getApellido()+ ". Cambio de carrera exitoso");
        System.out.println("Tu carrera nueva es " + e.getCurso());
    }

}
