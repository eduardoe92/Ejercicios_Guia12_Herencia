package Entidades;

import Enumeraciones.Ejercicio4Sexo;

public class Ejercicio4PersonalDeServicio extends Ejercicio4Empleado {

    public String seccion;

    public Ejercicio4PersonalDeServicio() {
    }

    public Ejercicio4PersonalDeServicio(String seccion) {
        this.seccion = seccion;
    }

    public Ejercicio4PersonalDeServicio(String seccion, int anioIncorporacion, int numDespacho) {
        super(anioIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    public Ejercicio4PersonalDeServicio(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int id, Ejercicio4Sexo sexo) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, id, sexo);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio | " + super.toString() + "Sección: " + seccion;
    }

}
