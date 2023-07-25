package Entidades;

import Enumeraciones.Ejercicio4Sexo;

public class Ejercicio4Empleado extends Ejercicio4Persona {

    protected int anioIncorporacion, numDespacho;

    public Ejercicio4Empleado() {
    }

    public Ejercicio4Empleado(int anioIncorporacion, int numDespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Ejercicio4Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int id, Ejercicio4Sexo sexo) {
        super(nombre, apellido, estadoCivil, id, sexo);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Ejercicio4Empleado{" + super.toString() + "Año de Incorporación: " + anioIncorporacion + ", Número de Despacho: " + numDespacho + '}';
    }

}
