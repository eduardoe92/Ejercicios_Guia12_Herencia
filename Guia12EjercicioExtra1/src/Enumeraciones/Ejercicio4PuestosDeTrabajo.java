package Enumeraciones;

public enum Ejercicio4PuestosDeTrabajo {
    DIRECTOR("Director", 1), JEFE_DE_ESTUDIOS("Jefe de Estudios", 2), 
    ASISTENTE_AUXILIAR("Asistente Auxiliar", 3), SECRETARIADO("Secretariado", 4), 
    COMEDOR("Comedor", 5), ENFERMERIA("Enfermería", 6), TECNICO("Técnico", 7),
    MONITOREO("Monitoreo", 8), PERSONAL_LIMPIEZA("Personal de Limpieza", 9), 
    PSICOLOGO("Psicólogo", 10), SEGURIDAD("Seguridad", 11), TUTORIA("Tutoría", 12),
    ORIENTACION("Orientación", 13), DECANO("Decano", 14), BIBLIOTECA("Biblioteca", 15),
    CONSERJE("Conserje", 16);

    String codigo;
    int num;

    private Ejercicio4PuestosDeTrabajo() {
    }

    private Ejercicio4PuestosDeTrabajo(String codigo, int num) {
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
