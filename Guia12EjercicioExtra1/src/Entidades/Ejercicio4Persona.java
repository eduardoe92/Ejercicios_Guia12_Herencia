package Entidades;

import Enumeraciones.Ejercicio4Sexo;

public class Ejercicio4Persona {

    protected String nombre, apellido;
    protected String estadoCivil;
    protected int id;
    protected Ejercicio4Sexo sexo;

    public Ejercicio4Persona() {
    }

    public Ejercicio4Persona(String nombre, String apellido, String estadoCivil, int id, Ejercicio4Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.id = id;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ejercicio4Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Ejercicio4Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEstado Civil: " + estadoCivil + "\nID: " + id + "\nSexo: " + sexo;
    }

}
