package Entities;

public class Camping extends AlojamientoExtraHotelero {
    
    public Integer capacCarpas;
    public Integer baños;
    public boolean restaurant;

    public Camping() {
    }

    public Camping(Integer capacCarpas, Integer baños, boolean restaurant, boolean privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.capacCarpas = capacCarpas;
        this.baños = baños;
        this.restaurant = restaurant;
    }

    public Integer getCapacCarpas() {
        return capacCarpas;
    }

    public void setCapacCarpas(Integer capacCarpas) {
        this.capacCarpas = capacCarpas;
    }

    public Integer getBaños() {
        return baños;
    }

    public void setBaños(Integer baños) {
        this.baños = baños;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacCarpas=" + capacCarpas + ", baños=" + baños + ", restaurant=" + restaurant + '}';
    }
    
    public boolean tieneRestaurante() {
        return restaurant; 
    }

    public Camping crearCamping() {
        super.llenarDatosExtra();
        System.out.println("Ingrese la capacidad de la carpa");
        this.capacCarpas = leer.nextInt();
        System.out.println("Ingrese la cantidad de baños");
        this.baños = leer.nextInt();
        System.out.println("Tiene restaurante Si o No ?");
        String resp = leer.next();
        this.restaurant = resp.equalsIgnoreCase("Si");

        return new Camping(capacCarpas, baños, restaurant, privado, metros, nombre, direccion, localidad, gerente);
    }
}

