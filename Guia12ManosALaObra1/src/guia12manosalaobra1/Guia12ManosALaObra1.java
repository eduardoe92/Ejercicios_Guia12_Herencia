
package guia12manosalaobra1;

import java.util.ArrayList;

public class Guia12ManosALaObra1 {

    public static void main(String[] args) {
        
        ArrayList<Animal> array = new ArrayList();
        
        Animal a = new Animal();
        Perro p = new Perro();
        Gato g = new Gato();
        
        array.add(a);
        array.add(p);
        array.add(g);
        
        for (Animal aux : array) {
            aux.hacerRuido();
        }
    }

}
