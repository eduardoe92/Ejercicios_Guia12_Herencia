package Entidades;

public class Ejercicio1Yate extends Ejercicio1Barco {

    private int potencia, numCamarotes;

    public Ejercicio1Yate() {
    }

    public Ejercicio1Yate(int potencia, int numCamarotes) {
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public Ejercicio1Yate(int potencia, int numCamarotes, String matricula, double eslora, int anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "\nMatrícula: " + super.getMatricula() + "\nEslora: " + super.getEslora() + "\nAño de Fabricación: " + super.getAnioDeFabricacion() + "\nPotencia instalada: " + potencia + "\nCantidad de Camarotes: " + numCamarotes + '}';
    }

}
