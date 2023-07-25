
package entities;

public class Empleado extends Persona{
    protected Integer anio,despacho;

    public Empleado(Integer anio, Integer despacho, String nombre, Integer dni, Enum estCivil) {
        super(nombre, dni, estCivil);
        this.anio = anio;
        this.despacho = despacho;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Empleado: " +super.toString()+ "a#o: " + anio + ", Despacho: " + despacho + "\n";
    }
}
