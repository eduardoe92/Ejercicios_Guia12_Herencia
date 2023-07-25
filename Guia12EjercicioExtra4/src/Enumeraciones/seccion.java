
package Enumeraciones;

public enum seccion {
    BIBLIOTECA(1,"Biblioteca"),
    DECANATO(2,"Decanato"),
    SEGURIDAD(3,"Seguridad"),
    CANCHAS(4,"Canchas"),
    GIMNASIO(5,"Gimnasio");
    
    private final int index;
    private final String nombre;

    private seccion(int index, String nombre) {
        this.index = index;
        this.nombre = nombre;
    }
    
    
    
}
