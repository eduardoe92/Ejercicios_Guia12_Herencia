package entities;

public class Persona {

    protected String nombre;
    protected Integer dni;
    protected Enum estCivil;

    public Persona(String nombre, Integer dni, Enum estCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.estCivil = estCivil;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Enum getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(Enum estCivil) {
        this.estCivil = estCivil;
    }

    @Override
    public String toString() {
        return nombre + ", Dni: " + dni + ", Estado Civil:" + estCivil + "\n";
    }

}
