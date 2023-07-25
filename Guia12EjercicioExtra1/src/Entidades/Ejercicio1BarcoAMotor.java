package Entidades;

public class Ejercicio1BarcoAMotor extends Ejercicio1Barco {

    private int potencia;

    public Ejercicio1BarcoAMotor() {
    }

    public Ejercicio1BarcoAMotor(int potencia) {
        this.potencia = potencia;
    }

    public Ejercicio1BarcoAMotor(int potencia, String matricula, double eslora, int anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "\nMatrícula: " + super.getMatricula() + "\nEslora: " + super.getEslora() + "\nAño de Fabricación: " + super.getAnioDeFabricacion() + "\nPotencia instalada: " + potencia + '}';
    }
    
}
