package Entidades;

public class Ejercicio2Polideportivo extends Ejercicio2Edificio {

    protected boolean techado;

    public Ejercicio2Polideportivo() {
    }

    public Ejercicio2Polideportivo(boolean techado) {
        this.techado = techado;
    }

    public Ejercicio2Polideportivo(boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Ejercicio2Polideportivo{" + "techado=" + techado + '}';
    }

    public Ejercicio2Polideportivo llenarPolideportivo() {
        boolean techadoX = true;
        int techadoONo = (int) (Math.random() * 2 + 1);
        techadoX = techadoONo == 1;
        int anchoX = (int) ((Math.random() * 60) + 10);
        int largoX = (int) ((Math.random() * 60) + 10);
        int altoX = (int) ((Math.random() * 150) + 10);
        return new Ejercicio2Polideportivo(techadoX, anchoX, altoX, largoX);
    }

}
