package Entidades;

import Enumeraciones.Ejercicio4Sexo;

public class Ejercicio4Profesor extends Ejercicio4Empleado {

    private String departamento;

    public Ejercicio4Profesor() {
    }

    public Ejercicio4Profesor(String departamento) {
        this.departamento = departamento;
    }

    public Ejercicio4Profesor(String departamento, int anioIncorporacion, int numDespacho) {
        super(anioIncorporacion, numDespacho);
        this.departamento = departamento;
    }

    public Ejercicio4Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int id, Ejercicio4Sexo sexo) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, id, sexo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Ejercicio4Profesor{" + super.toString() + "departamento=" + departamento + '}';
    }

}
