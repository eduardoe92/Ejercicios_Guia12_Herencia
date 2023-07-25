package Enumeraciones;

public enum Ejercicio4Apellido {
    ROMERO("Romero"), BENITEZ("Benitez"), SOSA("Sosa"), RAMIREZ("Ramirez"), RUIZ("Ruiz"), ALVAREZ("Alvarez"), TORRES("Torres"), ACOSTA("Acosta"), ROJAS("Rojas"), MEDINA("Medina"), GONZALES("Gonzales"), RODRIGUEZ("Rodriguez"), GOMEZ("Gomez"),
    FERNANDEZ("Fernandez"), LOPEZ("Lopez"), MARTINEZ("Martinez"), DIAZ("Diaz"), GARCIA("Garcia"), PEREZ("Perez"), SANCHEZ("Sanchez");
    String codigo;

    private Ejercicio4Apellido() {
    }

    private Ejercicio4Apellido(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
