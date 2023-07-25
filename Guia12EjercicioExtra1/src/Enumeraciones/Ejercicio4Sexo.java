package Enumeraciones;

public enum Ejercicio4Sexo {
    HOMBRE("Hombre"), MUJER("Mujer"), OTRO("Otro");
    String codigo;

    private Ejercicio4Sexo() {
    }

    private Ejercicio4Sexo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
