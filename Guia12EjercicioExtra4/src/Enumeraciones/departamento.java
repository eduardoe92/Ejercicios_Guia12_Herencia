
package Enumeraciones;

public enum departamento {
    CIENCIAS_ECONOMICAS(1,"Ciencias Económicas"),
    HUMANIDADES(2,"Humanidades"),
    SALUD(3,"Salud"),
    INGENIERIA(4,"Ingeniería"),
    FORMACION_CONTINUA(5,"Formación Continua"),
    DERECHO(6,"Derecho"),
    CIENCIA_Y_TECNOLOGÍA(7,"Ciencia Y tecnología");
    
    private final int index;
    private final String nombre;

    private departamento(int index, String nombre) {
        this.index = index;
        this.nombre = nombre;
    }
    
    public int getIndex() {
        return index;
    }

    public String getNombre() {
        return nombre;
    }
 
    
    
}
