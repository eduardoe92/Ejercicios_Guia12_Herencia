package Entities;

public class Hotel4Estrellas extends Hotel {

    public char gimnasio;
    public String nombreRestaurant;
    public Integer capacRest;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, Integer capacRest, Integer cantHabit, Integer cantCamas, Integer cantPisos, Double precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabit, cantCamas, cantPisos, precioHabit, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacRest = capacRest;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacRest() {
        return capacRest;
    }

    public void setCapacRest(Integer capacRest) {
        this.capacRest = capacRest;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurant=" + nombreRestaurant + ", capacRest=" + capacRest + '}';
    }

    public Hotel4Estrellas crearHotel4() {
        super.crearHotel();

        System.out.println("¿Que categoria de gimnasio es: A o B ?");
        this.gimnasio = leer.next().toUpperCase().charAt(0);
        while (gimnasio != 'A' && gimnasio != 'B') {
            System.out.println("Ingreselo nuevamente");
            this.gimnasio = leer.next().charAt(0);
        }

        System.out.println("Ingrese el nombre del restaurante");
        this.nombreRestaurant = leer.next();
        System.out.println("Ingrese la capacidad del restaurante");
        this.capacRest = leer.nextInt();
        this.precioHabit = this.precioHabit + calcularPlus();

        return new Hotel4Estrellas(gimnasio, nombreRestaurant, capacRest, cantHabit, cantCamas, cantPisos, precioHabit, nombre, direccion, localidad, gerente);
    }

    public double calcularPlus() {
        return 1 * cantHabit + valorAgregadoRes() + valorAgregadoGim();
    }

    public int valorAgregadoRes() {
        if (capacRest < 30) {
            return 10;
        } else if (capacRest >= 30 && capacRest <= 50) {
            return 30;
        } else {
            return 50;
        }
    }

    public int valorAgregadoGim() {
        if (gimnasio == 'A') {
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public double getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
