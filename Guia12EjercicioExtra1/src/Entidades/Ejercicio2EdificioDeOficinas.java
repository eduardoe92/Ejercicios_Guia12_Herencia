package Entidades;

public class Ejercicio2EdificioDeOficinas extends Ejercicio2Edificio {

    protected int numOficinas, cantPersonasXOficina, numPisos;

    public Ejercicio2EdificioDeOficinas() {
    }

    public Ejercicio2EdificioDeOficinas(int numOficinas, int cantPersonasXOficina, int numPisos) {
        this.numOficinas = numOficinas;
        this.cantPersonasXOficina = cantPersonasXOficina;
        this.numPisos = numPisos;
    }

    public Ejercicio2EdificioDeOficinas(int numOficinas, int cantPersonasXOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasXOficina = cantPersonasXOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasXOficina() {
        return cantPersonasXOficina;
    }

    public void setCantPersonasXOficina(int cantPersonasXOficina) {
        this.cantPersonasXOficina = cantPersonasXOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "Ejercicio2EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", cantPersonasXOficina=" + cantPersonasXOficina + ", numPisos=" + numPisos + '}';
    }

    public Ejercicio2EdificioDeOficinas llenarEdificioOffice() {
        System.out.println("Ingrese la cantidad de pisos del edificio");
        int pisosX = leer.nextInt();
        System.out.println("Ingrese la cantidad de oficinas por piso");
        int oficinasX = leer.nextInt();
        System.out.println("Ingrese la capacidad de la oficina");
        int CantPerxOfiX = leer.nextInt();
        int anchoX = (int) ((Math.random() * 60) + 10);
        int largoX = (int) ((Math.random() * 60) + 10);
        int altoX = (int) ((Math.random() * 150) + 10);
        return new Ejercicio2EdificioDeOficinas(oficinasX, CantPerxOfiX, pisosX, anchoX, altoX, largoX);
    }

//    public int cantPersonas() {
//        
//    }
}
