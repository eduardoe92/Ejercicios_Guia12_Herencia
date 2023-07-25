package Entities;

public abstract class Hotel extends Alojamiento {

    protected Integer cantHabit;
    protected Integer cantCamas;
    protected Integer cantPisos;
    protected Double precioHabit;

    public Hotel() {
    }

    public Hotel(Integer cantHabit, Integer cantCamas, Integer cantPisos, Double precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabit = cantHabit;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabit = precioHabit;
    }

    public Integer getCantHabit() {
        return cantHabit;
    }

    public void setCantHabit(Integer cantHabit) {
        this.cantHabit = cantHabit;
    }

    public Integer getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(Integer cantCamas) {
        this.cantCamas = cantCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabit() {
        return precioHabit;
    }

    public void setPrecioHabit(Double precioHabit) {
        this.precioHabit = precioHabit;
    }

    public void DatosBasicosHotel() {
        super.datosAlojamiento();
        System.out.println("Ingrese la cantidad de habitaciones");
        this.cantHabit = leer.nextInt();
        System.out.println("Ingrese la cantidad de camas");
        this.cantCamas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos");
        this.cantPisos = leer.nextInt();
        this.precioHabit = 50.0;
    }

    public Hotel crearHotel() {
        DatosBasicosHotel();
        return new Hotel(cantHabit, cantCamas, cantPisos, precioHabit, nombre, direccion, localidad, gerente) {
            public double getPrecio() {
                return cantHabit * precioHabit;
            }
        };
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHabit=" + cantHabit + ", cantCamas=" + cantCamas + ", cantPisos=" + cantPisos + ", precioHabit=" + precioHabit + '}';
    }
}
