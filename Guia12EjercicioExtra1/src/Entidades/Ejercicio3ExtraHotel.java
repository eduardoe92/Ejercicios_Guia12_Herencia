package Entidades;

public class Ejercicio3ExtraHotel extends Ejercicio3Alojamiento {

    protected boolean privado;
    protected double superficie;

    public Ejercicio3ExtraHotel() {
    }

    public Ejercicio3ExtraHotel(boolean privado, double superficie) {
        this.privado = privado;
        this.superficie = superficie;
    }

    public Ejercicio3ExtraHotel(boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrivado: " + privado + "\nSuperficie en m^2: " + superficie;
    }

    public class Camping extends Ejercicio3ExtraHotel {

        protected int capMaxDeCarpas, cantBanios;
        protected boolean restaurante;

        public Camping() {
        }

        public Camping(int capMaxDeCarpas, int cantBanios, boolean restaurante) {
            this.capMaxDeCarpas = capMaxDeCarpas;
            this.cantBanios = cantBanios;
            this.restaurante = restaurante;
        }

        public Camping(int capMaxDeCarpas, int cantBanios, boolean restaurante, boolean privado, double superficie) {
            super(privado, superficie);
            this.capMaxDeCarpas = capMaxDeCarpas;
            this.cantBanios = cantBanios;
            this.restaurante = restaurante;
        }

        public Camping(int capMaxDeCarpas, int cantBanios, boolean restaurante, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
            super(privado, superficie, nombre, direccion, localidad, gerente);
            this.capMaxDeCarpas = capMaxDeCarpas;
            this.cantBanios = cantBanios;
            this.restaurante = restaurante;
        }

        public int getCapMaxDeCarpas() {
            return capMaxDeCarpas;
        }

        public void setCapMaxDeCarpas(int capMaxDeCarpas) {
            this.capMaxDeCarpas = capMaxDeCarpas;
        }

        public int getCantBanios() {
            return cantBanios;
        }

        public void setCantBanios(int cantBanios) {
            this.cantBanios = cantBanios;
        }

        public boolean isRestaurante() {
            return restaurante;
        }

        public void setRestaurante(boolean restaurante) {
            this.restaurante = restaurante;
        }

        @Override
        public String toString() {
            return "Camping" + super.toString() + "\nCapacidad Máxima de Carpas: " + capMaxDeCarpas + "\nCantidad de Baños: " + cantBanios + "\nRestaurante: " + restaurante;
        }

        public Camping llenarCamping() {
            int capMaxDeCarpasX = (int) ((Math.random() * 70) + 1), cantBaniosX = (int) ((Math.random() * 10) + 1);
            boolean restauranteX = true;
            int restauranteONo = (int) (Math.random() * 2 + 1);
            restauranteX = restauranteONo == 1;
            boolean privadoX = true;
            int privadoOPublico = (int) (Math.random() * 2 + 1);
            privadoX = privadoOPublico == 1;
            double superficieX = (int) ((Math.random() * 4500) + 1);
            String nombreCamping = "", direccionX = "", localidadX = "", gerenteX = "";
            String[] crearNombreCamping = {"Onelli", "Vida Linda", "El Esturión", "La Gardaza"}, crearDireccion = {"Los Cerezos 5386", "Las Achiras 58", "Bernardino Valle 2360", "Avenida Juan Pablo II 1242"}, crearLocalidad = {"San Carlos De Bariloche", "Villa Traful", "Ituzaingó", "Apóstoles"}, crearGerente = {"Lorena Contardi", "Fuyuni Taroko", "Matías Fontana", "Silvino Uribelarrea"};
            for (int i = 0; i < 3; i++) {
                nombreCamping = crearNombreCamping[(int) (Math.random() * 3)];
                direccionX = crearDireccion[(int) (Math.random() * 3)];
                localidadX = crearLocalidad[(int) (Math.random() * 3)];
                gerenteX = crearGerente[(int) (Math.random() * 3)];
            }
            return new Camping(capMaxDeCarpasX, cantBaniosX, restauranteX, privadoX, superficieX, nombreCamping, direccionX, localidadX, gerenteX);
        }

    }

    public class Residencia extends Ejercicio3ExtraHotel {

        protected int cantHabitaciones;
        protected boolean descuento, campoDeportivo;

        public Residencia() {
        }

        public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo) {
            this.cantHabitaciones = cantHabitaciones;
            this.descuento = descuento;
            this.campoDeportivo = campoDeportivo;
        }

        public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, double superficie) {
            super(privado, superficie);
            this.cantHabitaciones = cantHabitaciones;
            this.descuento = descuento;
            this.campoDeportivo = campoDeportivo;
        }

        public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
            super(privado, superficie, nombre, direccion, localidad, gerente);
            this.cantHabitaciones = cantHabitaciones;
            this.descuento = descuento;
            this.campoDeportivo = campoDeportivo;
        }

        public int getCantHabitaciones() {
            return cantHabitaciones;
        }

        public void setCantHabitaciones(int cantHabitaciones) {
            this.cantHabitaciones = cantHabitaciones;
        }

        public boolean isDescuento() {
            return descuento;
        }

        public void setDescuento(boolean descuento) {
            this.descuento = descuento;
        }

        public boolean isCampoDeportivo() {
            return campoDeportivo;
        }

        public void setCampoDeportivo(boolean campoDeportivo) {
            this.campoDeportivo = campoDeportivo;
        }

        @Override
        public String toString() {
            return "Residencia" + super.toString() + "\nCantidad de Habitaciones: " + cantHabitaciones + "\nDescuento: " + descuento + "\nCampo Deportivo: " + campoDeportivo + '}';
        }

        public Residencia llenarResidencia() {
            int cantHabitacionesX = (int) ((Math.random() * 4) + 1);
            boolean descuentoX = true, campoDeportivoX = true;
            int descuentoONo = (int) (Math.random() * 2 + 1), campoDeportivoONo = (int) (Math.random() * 2 + 1);
            descuentoX = descuentoONo == 1;
            campoDeportivoX = campoDeportivoONo == 1;
            boolean privadoX = true;
            int privadoOPublico = (int) (Math.random() * 2 + 1);
            privadoX = privadoOPublico == 1;
            double superficieX = (int) ((Math.random() * 4500) + 1);
            String nombreCamping = "", direccionX = "", localidadX = "", gerenteX = "";
            String[] crearNombreCamping = {"Charcaña", "La Eternidad", "La Tutela", "El Polito"}, crearDireccion = {"Río Negro 1637", "Av. Güemes 1136", "Pellegrini 3341", "Av. Champagnat 2388"}, crearLocalidad = {"Jesús María", "San Francisco", "Bragado", "Pergamino"}, crearGerente = {"Alejandro Rupert", "Elena Volipe", "Marta Gardoni", "Mariano Itepayena"};
            for (int i = 0; i < 3; i++) {
                nombreCamping = crearNombreCamping[(int) (Math.random() * 3)];
                direccionX = crearDireccion[(int) (Math.random() * 3)];
                localidadX = crearLocalidad[(int) (Math.random() * 3)];
                gerenteX = crearGerente[(int) (Math.random() * 3)];
            }
            return new Residencia(cantHabitacionesX, descuentoX, campoDeportivoX, privadoX, superficieX, nombreCamping, direccionX, localidadX, gerenteX);
        }

    }

}
