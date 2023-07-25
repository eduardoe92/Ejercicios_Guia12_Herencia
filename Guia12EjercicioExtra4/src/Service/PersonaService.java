package Service;

import Enumeraciones.departamento;
import Enumeraciones.estadoCivil;
import Enumeraciones.seccion;
import entities.Empleado;
import entities.Estudiante;
import entities.Persona;
import entities.PersonalServicio;
import entities.Profesor;
import java.util.ArrayList;

public class PersonaService {

    private final ArrayList<Persona> universidad;

    public PersonaService() {
        universidad = new ArrayList();

        ArrayList<String> curso = new ArrayList();
        curso.add("Programacion Inicial");
        ArrayList<String> curso1 = new ArrayList();
        curso1.add("ARTE");

        universidad.add(new Estudiante(curso, "Eduardo", 8787613, estadoCivil.SOLTERO));
        universidad.add(new Estudiante(curso, "Malu", 37731613, estadoCivil.VIUDO));
        universidad.add(new Profesor(departamento.INGENIERIA, 2003, 114, "Sergio", 2657429, estadoCivil.CASADO));
        universidad.add(new Profesor(departamento.INGENIERIA, 2003, 300, "Osvaldo", 2657429, estadoCivil.CASADO));
        universidad.add(new PersonalServicio(seccion.BIBLIOTECA, 2019, 4, "Matias", 43584721, estadoCivil.SOLTERO));

//        for (Persona persona : universidad) {
//            System.out.println(persona.toString() + "\n");
//        }
//        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        String result = "";
        for (Persona persona : universidad) {
            result += persona.toString() + "\n";
        }
        return result;
    }

    public Persona crearPersona() {
        Persona p = new Persona("pepe", 63482534, estadoCivil.SOLTERO);
        return p;

    }

    public void cambiarEstCivil() {

        universidad.get(0).setEstCivil(estadoCivil.CASADO);
        System.out.println(universidad.get(0).toString());

    }

    public void cambiarDespacho() {

        Empleado e = (Empleado) universidad.get(2);

        e.setDespacho(205);

        universidad.set(2, e);
        System.out.println("Cambiar despacho\n");

        for (Persona persona : universidad) {
            System.out.println(persona.toString() + "\n");
        }

    }

    public void cambiarMatricula() {
        //UNA POSIBLE SOLUCIÓN ERA CREAR UN ENUM DE CURSOS
        //LA SOLUCIÓN ENCONTRADA FUE CREAR UN NUEVO ARRAYLIST EN BASE A OTRO, EN LUGAR DE IGUALARLOS EN LA LINEA 84 //*
        Estudiante eAux = (Estudiante) universidad.get(1);

//        System.out.println("TESTINICIAL");
//        System.out.println(universidad.get(0).toString());
        System.out.println(universidad.get(1).toString()); //Estudiante con su matricula antigua
//        System.out.println("TEST");

        ArrayList<String> cursosAux = new ArrayList(eAux.getCursos()); //*

        cursosAux.add("Matematica");
        cursosAux.set(0, "Programacion intermedia");

        eAux.setCursos(cursosAux);

        universidad.set(1, eAux);
        System.out.println("Cambiar Matricula \n");
        System.out.println(universidad.get(1).toString()); //Estudiante con su nueva matricula
        
//        for (Persona persona : universidad) {
//            System.out.println(persona.toString() + "\n");
//        }

    }

    public void cambiarDeDepartamento() {

        Profesor p = (Profesor) universidad.get(2);

        p.setDepartamento(departamento.SALUD);

        universidad.set(2, p);
        System.out.println("Cambiar departamento\n");

        for (Persona persona : universidad) {
            System.out.println(persona.toString() + "\n");
        }

    }

    public void cambiarDeSeccion() {

        PersonalServicio em = (PersonalServicio) universidad.get(4);

        em.setSeccion(seccion.GIMNASIO);

        universidad.set(3, em);
        System.out.println("Cambiar seccion\n");

        for (Persona persona : universidad) {
            System.out.println(persona.toString() + "\n");
        }
    }
}
