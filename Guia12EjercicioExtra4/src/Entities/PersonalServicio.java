package entities;

public final class PersonalServicio extends Empleado {

    private Enum seccion;

    public PersonalServicio(Enum seccion, Integer anio, Integer despacho, String nombre, Integer dni, Enum estCivil) {
        super(anio, despacho, nombre, dni, estCivil);
        this.seccion = seccion;

    }

    public Enum getSeccion() {
        return seccion;
    }

    public void setSeccion(Enum seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Personal de Servicio " + super.toString() + "Seccion: " + seccion;
    }

}
