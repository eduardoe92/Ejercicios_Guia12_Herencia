package Entidades;

import Enumeraciones.Ejercicio4Sexo;

public class Ejercicio4Estudiante extends Ejercicio4Persona {

    private String curso;

    public Ejercicio4Estudiante() {
    }

    public Ejercicio4Estudiante(String curso) {
        this.curso = curso;
    }

    public Ejercicio4Estudiante(String curso, String nombre, String apellido, String estadoCivil, int id, Ejercicio4Sexo sexo) {
        super(nombre, apellido, estadoCivil, id, sexo);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante" + super.toString() + "\nCurso: " + curso;
    }

}
