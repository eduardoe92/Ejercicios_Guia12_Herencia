
package Entidades;
public class Circulo implements CalculoFormas{
    
    private double radio;

    public Circulo() {
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio; 
    }

    @Override
    public double calcularPerimetro() {
        return PI * radio * 2;
    }
}
