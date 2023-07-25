package Entidades;

public class Ejercicio1Velero extends Ejercicio1Barco {

    private int numMastiles;

    public Ejercicio1Velero() {
    }

    public Ejercicio1Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Ejercicio1Velero(int numMastiles, String matricula, double eslora, int anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "\nMatrícula: " + super.getMatricula() + "\nEslora: " + super.getEslora() + "\nAño de Fabricación: " + super.getAnioDeFabricacion() + "\nCantidad de Mástiles: " + numMastiles + '}';
    }

}
