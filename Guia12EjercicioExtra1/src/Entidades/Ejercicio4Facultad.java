package Entidades;

import java.util.HashSet;

public class Ejercicio4Facultad {

    protected String nombreFacultad;
    protected HashSet<Ejercicio4Empleado> PersServ;
    protected HashSet<Ejercicio4Empleado> Profes;
    protected HashSet<Ejercicio4Persona> Est;

    public Ejercicio4Facultad() {
    }

    public Ejercicio4Facultad(String nombreFacultad, HashSet<Ejercicio4Empleado> PersServ, HashSet<Ejercicio4Empleado> Profes, HashSet<Ejercicio4Persona> Est) {
        this.nombreFacultad = nombreFacultad;
        this.PersServ = PersServ;
        this.Profes = Profes;
        this.Est = Est;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public HashSet<Ejercicio4Empleado> getPersServ() {
        return PersServ;
    }

    public void setPersServ(HashSet<Ejercicio4Empleado> PersServ) {
        this.PersServ = PersServ;
    }

    public HashSet<Ejercicio4Empleado> getProfes() {
        return Profes;
    }

    public void setProfes(HashSet<Ejercicio4Empleado> Profes) {
        this.Profes = Profes;
    }

    public HashSet<Ejercicio4Persona> getEst() {
        return Est;
    }

    public void setEst(HashSet<Ejercicio4Persona> Est) {
        this.Est = Est;
    }

}
