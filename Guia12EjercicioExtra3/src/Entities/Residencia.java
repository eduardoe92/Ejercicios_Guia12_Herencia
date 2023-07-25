package Entities;

import java.util.stream.Stream;

public class Residencia extends AlojamientoExtraHotelero {

    public Integer cantHabit;
    public boolean descuento;
    public boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabit, boolean descuento, boolean campoDeportivo, boolean privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.cantHabit = cantHabit;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabit() {
        return cantHabit;
    }

    public void setCantHabit(Integer cantHabit) {
        this.cantHabit = cantHabit;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabit=" + cantHabit + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }

    public Residencia crearResidencia() {

        super.llenarDatosExtra();
        System.out.println("Ingrese la cantidad de habitaciones");
        this.cantHabit = leer.nextInt();
        System.out.println("Tiene descuento para gremios Si o No ?");
        String resp = leer.next();
        this.descuento = resp.equalsIgnoreCase("si");
        System.out.println("Tiene campo deportivo");
        resp = leer.next();
        this.campoDeportivo = resp.equalsIgnoreCase("si");
        return new Residencia(cantHabit, descuento, campoDeportivo, privado, metros, nombre, direccion, localidad, gerente);
    }

    public boolean tieneDescuento() {
        return descuento;
    }
}
