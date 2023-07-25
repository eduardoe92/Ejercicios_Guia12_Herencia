package Entidades;

public class Ejercicio3Hotel extends Ejercicio3Alojamiento {

    protected int cantHabitaciones, numCamas, numPisos;
    protected double precio;

    public Ejercicio3Hotel() {
    }

    public Ejercicio3Hotel(int cantHabitaciones, int numCamas, int numPisos, double precio) {
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precio = precio;
    }

    public Ejercicio3Hotel(int cantHabitaciones, int numCamas, int numPisos, double precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precio = precio;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de Habitaciones: " + cantHabitaciones + "\nNúmero de Camas: " + numCamas + "\nNúmero de Pisos: " + numPisos + "\nPrecio: " + precio;
    }

    public class Hotel4 extends Ejercicio3Hotel {

        protected String gym, nombreRestaurante;
        protected int capacidadRestaurante;

        public Hotel4() {
        }

        public Hotel4(String gym, String nombreRestaurante, int capacidadRestaurante) {
            this.gym = gym;
            this.nombreRestaurante = nombreRestaurante;
            this.capacidadRestaurante = capacidadRestaurante;
        }

        public Hotel4(String gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int numPisos, double precio) {
            super(cantHabitaciones, numCamas, numPisos, precio);
            this.gym = gym;
            this.nombreRestaurante = nombreRestaurante;
            this.capacidadRestaurante = capacidadRestaurante;
        }

        public Hotel4(String gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int numPisos, double precio, String nombre, String direccion, String localidad, String gerente) {
            super(cantHabitaciones, numCamas, numPisos, precio, nombre, direccion, localidad, gerente);
            this.gym = gym;
            this.nombreRestaurante = nombreRestaurante;
            this.capacidadRestaurante = capacidadRestaurante;
        }

        public String getGym() {
            return gym;
        }

        public void setGym(String gym) {
            this.gym = gym;
        }

        public String getNombreRestaurante() {
            return nombreRestaurante;
        }

        public void setNombreRestaurante(String nombreRestaurante) {
            this.nombreRestaurante = nombreRestaurante;
        }

        public int getCapacidadRestaurante() {
            return capacidadRestaurante;
        }

        public void setCapacidadRestaurante(int capacidadRestaurante) {
            this.capacidadRestaurante = capacidadRestaurante;
        }

        @Override
        public String toString() {
            return "Hotel4" + super.toString() + "\nGym: " + gym + "\nNombre del Restaurante: " + nombreRestaurante + "\nCapacidad del Restaurante: " + capacidadRestaurante + '}';
        }

        public Hotel4 llenarHotel4() {
            int tipoGym = (int) ((Math.random() * 2) + 1);
            int valorGym = 0, valorRestaurante = 0;
            String gymX;
            if (tipoGym == 1) {
                gymX = "A";
                valorGym = 50;
            } else {
                gymX = "B";
                valorGym = 30;
            }
            int capacidadRestauranteX = (int) ((Math.random() * 90) + 1);
            if (capacidadRestauranteX < 30) {
                valorRestaurante = 10;
            } else if (capacidadRestauranteX >= 30 && capacidadRestauranteX <= 50) {
                valorRestaurante = 30;
            } else if (capacidadRestauranteX > 50) {
                valorRestaurante = 50;
            }
            int numPisosX = (int) ((Math.random() * 20) + 1), cantHabitacionesX = (int) ((Math.random() * 20) + 1), numCamasX = (int) ((Math.random() * 4) + 1);
            String nombreRestauranteX = "", nombreHotel = "", direccionX = "", localidadX = "", gerenteX = "";
            String[] crearNombreRestaurante = {"Ituya", "Mi Pocha", "Costabella", "El Tirano"}, crearNombreHotel = {"Platino", "Casper", "Miranda", "Valqua"}, crearDireccion = {"Aguilar 2440", "Suipacha 1058", "Av. Maipú 255, Boulevard Galvez 1345"}, crearLocalidad = {"Belgrano", "Retiro", "Córdoba Capital", "Santa Fe Capital"}, crearGerente = {"Adriana Massei", "Fabián Troya", "Alfredo Cosia", "Noemí Alcaraz"};
            for (int i = 0; i < 3; i++) {
                nombreRestauranteX = crearNombreRestaurante[(int) (Math.random() * 3)];
                nombreHotel = crearNombreHotel[(int) (Math.random() * 3)];
                direccionX = crearDireccion[(int) (Math.random() * 3)];
                localidadX = crearLocalidad[(int) (Math.random() * 3)];
                gerenteX = crearGerente[(int) (Math.random() * 3)];
            }
            double precioX = 50 + (1 * (numPisosX * (numCamasX * cantHabitacionesX))) + valorRestaurante + valorGym;
            return new Hotel4(gymX, nombreRestauranteX, capacidadRestauranteX, cantHabitacionesX, numCamasX, numPisosX, precioX, nombreHotel, direccionX, localidadX, gerenteX);
        }

    }

    public class Hotel5 extends Hotel4 {

        protected int cantSalonesConf, cantSuites, cantLimosinas;

        public Hotel5() {
        }

        public Hotel5(int cantSalonesConf, int cantSuites, int cantLimosinas) {
            this.cantSalonesConf = cantSalonesConf;
            this.cantSuites = cantSuites;
            this.cantLimosinas = cantLimosinas;
        }

        public Hotel5(int cantSalonesConf, int cantSuites, int cantLimosinas, String gym, String nombreRestaurante, int capacidadRestaurante) {
            super(gym, nombreRestaurante, capacidadRestaurante);
            this.cantSalonesConf = cantSalonesConf;
            this.cantSuites = cantSuites;
            this.cantLimosinas = cantLimosinas;
        }

        public Hotel5(int cantSalonesConf, int cantSuites, int cantLimosinas, String gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int numPisos, double precio) {
            super(gym, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, numPisos, precio);
            this.cantSalonesConf = cantSalonesConf;
            this.cantSuites = cantSuites;
            this.cantLimosinas = cantLimosinas;
        }

        public Hotel5(int cantSalonesConf, int cantSuites, int cantLimosinas, String gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int numPisos, double precio, String nombre, String direccion, String localidad, String gerente) {
            super(gym, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, numPisos, precio, nombre, direccion, localidad, gerente);
            this.cantSalonesConf = cantSalonesConf;
            this.cantSuites = cantSuites;
            this.cantLimosinas = cantLimosinas;
        }

        public int getCantSalonesConf() {
            return cantSalonesConf;
        }

        public void setCantSalonesConf(int cantSalonesConf) {
            this.cantSalonesConf = cantSalonesConf;
        }

        public int getCantSuites() {
            return cantSuites;
        }

        public void setCantSuites(int cantSuites) {
            this.cantSuites = cantSuites;
        }

        public int getCantLimosinas() {
            return cantLimosinas;
        }

        public void setCantLimosinas(int cantLimosinas) {
            this.cantLimosinas = cantLimosinas;
        }

        @Override
        public String toString() {
            return "Hotel5" + super.toString() + "\nCantidad de Salones de Conferencia: " + cantSalonesConf + "\nCantidad de Suites: " + cantSuites + "\nCantidad de Limosinas: " + cantLimosinas + '}';
        }

        public Hotel5 llenarHotel5() {
            int cantSalonesConfX = (int) ((Math.random() * 5) + 1);
            int cantSuitesX = (int) ((Math.random() * 10) + 1);
            int cantLimosinasX = (int) ((Math.random() * 5) + 1);
            int valorLimosinas = cantLimosinasX * 15;
            int tipoGym = (int) ((Math.random() * 2) + 1);
            int valorGym = 0, valorRestaurante = 0;
            String gymX;
            if (tipoGym == 1) {
                gymX = "A";
                valorGym = 50;
            } else {
                gymX = "B";
                valorGym = 30;
            }
            int capacidadRestauranteX = (int) ((Math.random() * 90) + 1);
            if (capacidadRestauranteX < 30) {
                valorRestaurante = 10;
            } else if (capacidadRestauranteX >= 30 && capacidadRestauranteX <= 50) {
                valorRestaurante = 30;
            } else if (capacidadRestauranteX > 50) {
                valorRestaurante = 50;
            }
            int numPisosX = (int) ((Math.random() * 30) + 1), cantHabitacionesX = (int) ((Math.random() * 25) + 1), numCamasX = (int) ((Math.random() * 4) + 1);
            String nombreRestauranteX = "", nombreHotel = "", direccionX = "", localidadX = "", gerenteX = "";
            String[] crearNombreRestaurante = {"Los Yayos", "La Jefa", "Atelia", "Ronan"}, crearNombreHotel = {"Rubi", "Esmeralda", "Las Marías", "Havelium"}, crearDireccion = {"Juana Manso 775", "Av. Del Puerto 390", "Rivadavia 1036", "Av. Tres Fronteras"}, crearLocalidad = {"Puerto Madero", "Tigre", "Corrientes", "Puerto Iguazú"}, crearGerente = {"Florencia Hielpos", "Camilo Ruiz", "Gastón Flores", "Agustina Lara"};
            for (int i = 0; i < 3; i++) {
                nombreRestauranteX = crearNombreRestaurante[(int) (Math.random() * 3)];
                nombreHotel = crearNombreHotel[(int) (Math.random() * 3)];
                direccionX = crearDireccion[(int) (Math.random() * 3)];
                localidadX = crearLocalidad[(int) (Math.random() * 3)];
                gerenteX = crearGerente[(int) (Math.random() * 3)];
            }
            double precioX = 50 + (1 * (numPisosX * (numCamasX * cantHabitacionesX))) + valorRestaurante + valorGym + valorLimosinas;
            return new Hotel5(cantSalonesConfX, cantSuitesX, cantLimosinasX, gymX, nombreRestauranteX, capacidadRestauranteX, cantHabitacionesX, numCamasX, numPisosX, precioX, nombreHotel, direccionX, localidadX, gerenteX);
        }

    }

}
