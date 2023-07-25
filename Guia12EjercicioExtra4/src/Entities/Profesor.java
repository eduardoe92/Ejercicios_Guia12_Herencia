package entities;

public final class Profesor extends Empleado {

    private Enum departamento;

    public Profesor(Enum departamento, Integer anio, Integer despacho, String nombre, Integer dni, Enum estCivil) {
        super(anio, despacho, nombre, dni, estCivil);
        this.departamento = departamento;
    }

    public Profesor(Integer anio, Integer despacho, String nombre, Integer dni, Enum estCivil) {
        super(anio, despacho, nombre, dni, estCivil);
    }

    public Enum getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Enum departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Departamento: " + departamento + "\n";
    }

}
