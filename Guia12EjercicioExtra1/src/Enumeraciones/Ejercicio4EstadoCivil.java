package Enumeraciones;

public enum Ejercicio4EstadoCivil {
    SOLTERX("Solterx", 1), CASADX("Casadx", 2), DIVORCIADX("Divorciadx", 3),
    SEPARADX("Separadx", 4), VIUDX("Viudx", 5), EN_PAREJA("En Pareja", 6);
    String codigo;
    int num;

    private Ejercicio4EstadoCivil() {
    }

    private Ejercicio4EstadoCivil(String codigo, int num) {
        this.codigo = codigo;
        this.num = num;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
