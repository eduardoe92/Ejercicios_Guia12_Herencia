package Entidades;

import java.util.Date;

public class Ejercicio1Alquiler {

    private String nombre;
    private int dniCliente, posAmarre;
    private Date alquiler, devolucion;
    private Ejercicio1Barco barco;

    public Ejercicio1Alquiler() {
    }

    public Ejercicio1Alquiler(String nombre, int dniCliente, int posAmarre, Date alquiler, Date devolucion, Ejercicio1Barco barco) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.posAmarre = posAmarre;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Date getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public Ejercicio1Barco getBarco() {
        return barco;
    }

    public void setBarco(Ejercicio1Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "\nNombre: " + nombre + "\nDNI del Cliente: " + dniCliente + "\nPosición de Amarre: " + posAmarre + "\nFecha de Alquiler: " + alquiler + "\nFecha de Devolución: " + devolucion + "\nTipo de Barco: " + barco + '}';
    }

    public double costoAlquiler() {
        long fechaInicial = alquiler.getTime();
        long fechaFinal = devolucion.getTime();
        long diferencia = fechaFinal - fechaInicial;
        int dias = (int) ((((diferencia / 1000) / 60) / 60) / 24);
        double precioFinal = (barco.getEslora() * 10) * dias;
        if (barco instanceof Ejercicio1Velero) {
            Ejercicio1Velero velero = (Ejercicio1Velero) barco;
            precioFinal += velero.getNumMastiles();
        } else if (barco instanceof Ejercicio1BarcoAMotor) {
            Ejercicio1BarcoAMotor barcoMotorizado = (Ejercicio1BarcoAMotor) barco;
            precioFinal += barcoMotorizado.getPotencia();
        } else if (barco instanceof Ejercicio1Yate) {
            Ejercicio1Yate yate = (Ejercicio1Yate) barco;
            precioFinal += yate.getPotencia() + yate.getNumCamarotes();
        }
        return precioFinal;
    }

}
