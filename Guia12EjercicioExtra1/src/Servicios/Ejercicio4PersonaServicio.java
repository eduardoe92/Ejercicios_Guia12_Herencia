package Servicios;

import Entidades.Ejercicio4Persona;
import Enumeraciones.Ejercicio4Apellido;
import Enumeraciones.Ejercicio4EstadoCivil;
import Enumeraciones.Ejercicio4NombreDeMujer;
import Enumeraciones.Ejercicio4NombreDeVaron;
import Enumeraciones.Ejercicio4Sexo;
import java.util.Scanner;

public class Ejercicio4PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ejercicio4Persona crearPersona() {
        System.out.println("Ingrese el sexo");
        mostrarSexo();
        String let = leer.next();
        Ejercicio4Sexo sexo = crearSexo(let);
        String nombre = crearNombre(sexo.getCodigo());
        String apellido = crearApellido();
        System.out.println("Ingrese la identificacion");
        int id = leer.nextInt();
        System.out.println("Ingrese el estado civil seleccionando un número que se mostrarán en pantalla");
        mostrarEstadosCiviles();
        int num = leer.nextInt();
        String estadoCivil = estadoCivil(num);
        return new Ejercicio4Persona(nombre, apellido, estadoCivil, id, sexo);
    }
    
    public void mostrarEstadosCiviles() {
        for (Ejercicio4EstadoCivil aux : Ejercicio4EstadoCivil.values()) {
            System.out.println(aux.getNum() + "_  " + aux.getCodigo() + ".");
        }
    }
    
    public String estadoCivil(int cont) {
        String nombre = Ejercicio4EstadoCivil.SOLTERX.getCodigo();
        for (Ejercicio4EstadoCivil aux : Ejercicio4EstadoCivil.values()) {
            if (aux.getNum() == cont) {
                nombre = aux.getCodigo();
                break;
            }
        }
        return nombre;
    }
    
    public void mostrarSexo() {
        for (Ejercicio4Sexo ver : Ejercicio4Sexo.values()) {
            System.out.print(ver.getCodigo() + ".  ");
        }
        System.out.println(" ");
    }
    
    public Ejercicio4Sexo crearSexo(String sex) {
        Ejercicio4Sexo s = Ejercicio4Sexo.OTRO;
        for (Ejercicio4Sexo res : Ejercicio4Sexo.values()) {
            String st = res.getCodigo();
            if (st.equalsIgnoreCase(sex)) {
                s = res;
            }
        }
        return s;
    }
    
    public String crearNombre(String sex) {
        int cont = (int) (Math.random() * 2);
        String nuevo = "";
        switch (sex) {
            case "Hombre":
                nuevo = nombreH();
                break;
            case "Mujer":
                nuevo = nombreM();
                break;
            case "Otro":
                nuevo = nombreMixto(cont);
                break;
        }
        return nuevo;
    }
    
    public String nombreH() {
        String nombre = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        for (Ejercicio4NombreDeVaron auxH : Ejercicio4NombreDeVaron.values()) {
            if (vuelta == cont) {
                nombre = auxH.getCodigo();
                break;
            }
            vuelta++;
        }
        return nombre;
    }
    
    public String nombreM() {
        String nombre = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        for (Ejercicio4NombreDeMujer auxM : Ejercicio4NombreDeMujer.values()) {
            if (vuelta == cont) {
                nombre = auxM.getCodigo();
                break;
            }
            vuelta++;
        }
        return nombre;
    }
    
    public String nombreMixto(int random) {
        String nombre = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        if (random == 1) {
            for (Ejercicio4NombreDeVaron auxM : Ejercicio4NombreDeVaron.values()) {
                if (vuelta == cont) {
                    nombre = auxM.getCodigo();
                    break;
                }
                vuelta++;
            }
        } else {
            for (Ejercicio4NombreDeMujer auxM : Ejercicio4NombreDeMujer.values()) {
                if (vuelta == cont) {
                    nombre = auxM.getCodigo();
                    break;
                }
                vuelta++;
            }
        }
        return nombre;
    }
    
    public String crearApellido() {
        String apellido = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        for (Ejercicio4Apellido aux : Ejercicio4Apellido.values()) {
            if (vuelta == cont) {
                apellido = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return apellido;
    }
    
    public void cambiarEstadoCivil(Ejercicio4Persona p) {
        System.out.println(p.getNombre() + " Seleccione el nuevo Estado Civil por numero :");
        mostrarEstadosCiviles();
        int num = leer.nextInt();
        String estado = estadoCivil(num);
        p.setEstadoCivil(estado);
        System.out.println("Ahora usted es : " + p.getEstadoCivil());
    }
    
}
