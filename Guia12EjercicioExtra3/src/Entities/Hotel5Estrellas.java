package Entities;

public class Hotel5Estrellas extends Hotel4Estrellas {

    public Integer cantSalones;
    public Integer cantSuites;
    public Integer cantLimosinas;
    private double precioFinal4;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalones, Integer cantSuites, Integer cantLimosinas, double precioFinal4, char gimnasio, String nombreRestaurant, Integer capacRest, Integer cantHabit, Integer cantCamas, Integer cantPisos, Double precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurant, capacRest, cantHabit, cantCamas, cantPisos, precioHabit, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.precioFinal4 = precioFinal4;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public double getPrecioFinal4() {
        return precioFinal4;
    }

    public void setPrecioFinal4(double precioFinal4) {
        this.precioFinal4 = precioFinal4;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + ", precioFinal4=" + precioFinal4 + '}';
    }

    public Hotel5Estrellas crearHotel5() {
        super.crearHotel4();
        System.out.println("Cuantos salones de conferencia tiene ?");
        this.cantSalones = leer.nextInt();
        System.out.println("Cantidad de suites");
        this.cantSuites = leer.nextInt();
        System.out.println("Ingrese la cantidad de limosinas");
        this.cantLimosinas = leer.nextInt();
        double precio = precioFinal4;
        this.precioFinal4 = precio + (cantLimosinas * 15);

        return new Hotel5Estrellas(cantSalones, cantSuites, cantLimosinas, precioFinal4, gimnasio, nombreRestaurant, capacRest, cantHabit, cantCamas, cantPisos, precioHabit, nombre, direccion, localidad, gerente);
    }

}
