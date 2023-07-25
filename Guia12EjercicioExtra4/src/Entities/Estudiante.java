
package entities;

import java.util.ArrayList;

public final class Estudiante extends Persona {
    private ArrayList<String> cursos;

    public Estudiante(ArrayList<String> cursos, String nombre, Integer dni, Enum estCivil) {
        super(nombre, dni, estCivil);
        this.cursos = cursos;
    }

    public Estudiante() {
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudiante: "+super.toString() + "Curso: " + cursos+ "\n";
    }

}
