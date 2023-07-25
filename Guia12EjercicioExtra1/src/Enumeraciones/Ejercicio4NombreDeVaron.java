package Enumeraciones;

public enum Ejercicio4NombreDeVaron {
    MATEO("Mateo"), BAUTISTA("Bautista"), JUAN("Juan"), FELIPE("Felipe"), BRUNO("Bruno"), NOAH("Noah"), BENICIO("Benicio"),
    THIAGO("Thiago"), CIRO("Ciro"), LIAM("Liam"), LORENZO("Lorenzo"), BENJAMIN("Benjamin"), VALENTINO("Valentino"),
    BASTIAN("Bastian"), SANTINO("Santino"), SANTIAGO("Santiago"), DANTE("Dante"), LAUTARO("Lautaro"), FRANCISCO("Francisco"), IAN("Ian");
    String codigo;

    private Ejercicio4NombreDeVaron() {
    }

    private Ejercicio4NombreDeVaron(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
