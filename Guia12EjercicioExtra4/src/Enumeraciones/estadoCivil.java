
package Enumeraciones;

public enum estadoCivil {
    CASADO(1,"Casado/a"),
    SOLTERO(2,"Soltero/a"),
    VIUDO(3,"Viudo/a"),
    DIVORCIADO(4,"Divorciado/a"),
    CONVIVIENTE(5,"Conviviente");
    
    private final int index;
    private final String estado;

    private estadoCivil(int index, String estado) {
        this.index = index;
        this.estado = estado;
    }
    
    
}
