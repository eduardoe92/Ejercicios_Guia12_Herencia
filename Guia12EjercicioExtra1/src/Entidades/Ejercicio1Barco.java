package Entidades;

public class Ejercicio1Barco {

    private String matricula;
    private double eslora;
    private int anioDeFabricacion;

    public Ejercicio1Barco() {
    }

    public Ejercicio1Barco(String matricula, double eslora, int anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "\nMatrícula: " + matricula + "\nEslora: " + eslora + "\nAño de Fabricación: " + anioDeFabricacion + '}';
    }

}
