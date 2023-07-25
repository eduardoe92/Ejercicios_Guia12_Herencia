package Entities;

public class AlojamientoExtraHotelero extends Alojamiento {

    public boolean privado;
    public Integer metros;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public void llenarDatosExtra() {
        System.out.println("Es privado ?");
        String resp = leer.next();
        this.privado = resp.equalsIgnoreCase("si");
        System.out.println("Cuantos metros cuadrados tiene ?");
        this.metros = leer.nextInt();
    }

    @Override
    public double getPrecio() {
        double precioHabitacion = 50.0;

        // Valor agregado por el restaurante
        int capacidadRestaurante = 0;
        if (capacidadRestaurante < 30) {
            precioHabitacion += 10.0;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            precioHabitacion += 30.0;
        } else {
            precioHabitacion += 50.0;
        }

        // Valor agregado por el gimnasio
        String tipoGimnasio = "";
        if (tipoGimnasio.equals("A")) {
            precioHabitacion += 50.0;
        } else if (tipoGimnasio.equals("B")) {
            precioHabitacion += 30.0;
        }

        // Valor agregado por las limosinas
        int cantidadLimosinas = 0;
        precioHabitacion += 15.0 * cantidadLimosinas;

        return precioHabitacion;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privado=" + privado + ", metros=" + metros + '}';
    }
}
