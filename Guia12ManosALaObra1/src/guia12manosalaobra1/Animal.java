
package guia12manosalaobra1;
public class Animal {
    
    public void hacerRuido(){
        System.out.println("Hola!");
    }
}

class Perro extends Animal{
    @Override
    public void hacerRuido(){
        System.out.println("Guau!");
    }
}

class Gato extends Animal{
    @Override
    public void hacerRuido(){
        System.out.println("Miau!");
    }
}