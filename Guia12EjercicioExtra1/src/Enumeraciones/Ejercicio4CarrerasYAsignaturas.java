package Enumeraciones;

public enum Ejercicio4CarrerasYAsignaturas {
    AGRONOMIA("Agronomía", 1), AGRICULTURA("Agricultura", 2), FILOSOFIA("Filosofía y Letras", 3), ARQUITECTURA("Arquitectura, Diseño y Urbanismo", 4),
    C_ECONOMICAS("Ciencias Económicas", 5), ARTE_Y_DISENO("Arte Creativo y Diseño", 6), LENGUAS_EXTRANJERAS("Lenguas Extranjeras", 7),
    C_PURAS_Y_APLICADAS("Ciencias Puras y Aplicadas", 8), C_SOCIALES("Ciencias Sociales y de la Comunicación", 9),
    TECNO_INFORMACION("Computación y Tecnologías de la Información", 10), C_EXACTAS_Y_NATURALES("Ciencias Exactas y Naturales", 11),
    ODONTOLOGIA("Odontología", 12), DERECHO("Derecho", 13), TURISMO_Y_HOSPITALIDAD("Turismo y Hospitalidad", 14), PSICOLOGIA("Psicología", 16),
    ADMINISTRACION_Y_NEGOCIOS("Negocios y Administración", 15), EDUCACION_Y_FORMACION("Educación y Formación", 17),
    HUMANIDADES("Humanidades", 18), INGENIERIA("Ingeniería", 19), MEDI_VETERINARIA("Medicina Veterinaria", 20), MEDI_Y_SALUD("Medicina y Salud", 21);
    String codigo;
    int num;

    private Ejercicio4CarrerasYAsignaturas() {
    }

    private Ejercicio4CarrerasYAsignaturas(String codigo, int num) {
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
