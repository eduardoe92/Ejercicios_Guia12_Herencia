package Servicios;

import Entidades.Ejercicio4Empleado;
import Entidades.Ejercicio4Estudiante;
import Entidades.Ejercicio4Facultad;
import Entidades.Ejercicio4Persona;
import Entidades.Ejercicio4PersonalDeServicio;
import Entidades.Ejercicio4Profesor;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4FacultadServicioGeneral {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejercicio4EmpleadoServicio emps = new Ejercicio4EmpleadoServicio();
    Ejercicio4EstudianteServicio ests = new Ejercicio4EstudianteServicio();
    Ejercicio4PersonaServicio pers = new Ejercicio4PersonaServicio();

    public Ejercicio4Facultad crearFacultad(HashSet<Ejercicio4Persona> estu, HashSet<Ejercicio4Empleado> persServ, HashSet<Ejercicio4Empleado> profe) {
        System.out.println("Ingrese el Nombre de la Facultad.");
        String nombre = leer.next();
        return new Ejercicio4Facultad(nombre, persServ, profe, estu);
    }

    public void crearListaDeEst(HashSet<Ejercicio4Persona> estu, int cont) {
        String opc;
        do {
            System.out.println("¿Desea seleccionar su carrera? S/N ");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Seleccione la opción correctamente S/N");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("S")) {
                estu.add(ests.crearEstxCarrera());
            } else {
                estu.add(ests.crearEstudiante());
            }
        } while (estu.size() != cont);
    }

    public void crearListaDePersDeServ(HashSet<Ejercicio4Empleado> PersServ, int cont) {
        String opc;
        do {
            System.out.println("¿Desea Seleccionar el área de servicio? S/N");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Seleccione la opción correctamente S/N");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("S")) {
                PersServ.add(emps.crearPersServxArea());
            } else {
                PersServ.add(emps.crearPersServ());
            }

        } while (PersServ.size() != cont);
    }

    public void crearListaDeProfes(HashSet<Ejercicio4Empleado> profe, int cont) {
        String opc;
        do {
            System.out.println("¿Desea seleccionar su especialidad? S/N ");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Seleccione la opción correctamente S/N");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("S")) {
                profe.add(emps.crearProfexCarrera());
            } else {
                profe.add(emps.crearProfe());
            }
        } while (profe.size() != cont);
    }

    public void MostrarEstudiantes(HashSet<Ejercicio4Persona> est) {
        System.out.println("Lista de estudiantes: ");
        for (Ejercicio4Persona per : est) {
            if (per instanceof Ejercicio4Estudiante) {
                System.out.println(per.getNombre() + ", " + per.getApellido() + ", Mat = " + ((Ejercicio4Estudiante) per).getCurso() + ".");
            }
        }
    }

    public void SeleccionarEstudiante(HashSet<Ejercicio4Persona> est) {
        MostrarEstudiantes(est);
        System.out.println("\nSeleccione el estudiante por nombre y apellido");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        boolean boo = false;
        for (Ejercicio4Persona alumno : est) {
            if (alumno instanceof Ejercicio4Estudiante) {
                if (alumno.getNombre().equalsIgnoreCase(nombre) && alumno.getApellido().equalsIgnoreCase(apellido)) {
                    CambioOpcionEstud((Ejercicio4Estudiante) alumno);
                    boo = true;
                    break;
                }
            }
        }
        if (!boo) {
            System.out.println("Estudiante " + nombre + " " + apellido + " no se encuentra en la lista");
        }
    }

    public void MostrarPersServ(HashSet<Ejercicio4Empleado> perS) {
        System.out.println("Lista de personal de servicio: ");
        for (Ejercicio4Empleado emple : perS) {
            if (emple instanceof Ejercicio4PersonalDeServicio) {
                System.out.println(emple.getNombre() + ", " + emple.getApellido() + ", Serv = " + ((Ejercicio4PersonalDeServicio) ((Ejercicio4Empleado) emple)).getSeccion() + ".");
            }
        }
    }

    public void SeleccionarPersServ(HashSet<Ejercicio4Empleado> perS) {
        MostrarPersServ(perS);
        System.out.println("\nSeleccione el personal por nombre y apellido");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        boolean boo = false;
        for (Ejercicio4Empleado emple : perS) {
            if (emple instanceof Ejercicio4PersonalDeServicio) {
                if (emple.getNombre().equalsIgnoreCase(nombre) && emple.getApellido().equalsIgnoreCase(apellido)) {
                    CambioOpcionPersServ((Ejercicio4PersonalDeServicio) emple);
                    boo = true;
                    break;
                }
            }
        }
        if (!boo) {
            System.out.println("El personal de servicio " + nombre + " " + apellido + " no se encuentra en la lista");
        }
    }

    public void MostrarProfesores(HashSet<Ejercicio4Empleado> prof) {
        System.out.println("Lista de Profesores : ");
        for (Ejercicio4Empleado emple : prof) {
            if (emple instanceof Ejercicio4Profesor) {
                System.out.println(emple.getNombre() + ", " + emple.getApellido()+ ", mat = " + ((Ejercicio4Profesor) emple).getDepartamento()+ ".");
            }
        }
    }

    public void SeleccionarProfesor(HashSet<Ejercicio4Empleado> profe) {
        MostrarProfesores(profe);
        System.out.println("\nSeleccione el profesor por nombre y apellido");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        boolean boo = false;
        for (Ejercicio4Persona prof : profe) {
            if (prof instanceof Ejercicio4Profesor) {
                if (prof.getNombre().equalsIgnoreCase(nombre) && prof.getApellido().equalsIgnoreCase(apellido)) {
                    CambioOpcionProfe((Ejercicio4Profesor) prof);
                    boo = true;
                    break;
                }
            }
        }
        if (!boo) {
            System.out.println("Profesor " + nombre + ", " + apellido + " no se encuentra en la lista");
        }
    }

    public void CambioOpcionEstud(Ejercicio4Estudiante e) {
        System.out.println("¿Qué desea cambiar? ¿Estado Civil o Materia? E/M ");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("E") && !opc.equalsIgnoreCase("M")) {
            System.out.println("Seleccione la opción correctamente E/M");
            opc = leer.next();
        }
        switch (opc.toUpperCase()) {
            case "M":
                ests.CambiarCarrera(e);
                break;
            case "E":
                pers.cambiarEstadoCivil(e);
                break;
        }
    }

    public void CambioOpcionProfe(Ejercicio4Profesor p) {
        System.out.println("¿Qué desea cambiar? ¿Estado Civil o Materia? E/M");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("E") && !opc.equalsIgnoreCase("M")) {
            System.out.println("Seleccione la opción correctamente E/M");
            opc = leer.next();
        }
        switch (opc.toUpperCase()) {
            case "M":
                p.setDepartamento(emps.cambioCarrera());
                break;
            case "E":
                pers.cambiarEstadoCivil(p);
                break;
        }
    }

    public void CambioOpcionPersServ(Ejercicio4PersonalDeServicio p) {
        System.out.println("¿Qué desea cambiar? ¿Estado civil o área de servicio? A/E");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("E") && !opc.equalsIgnoreCase("A")) {
            System.out.println("Seleccione la opción correctamente. A/E");
            opc = leer.next();
        }
        switch (opc.toUpperCase()) {
            case "A":
                p.setSeccion(emps.cambioServicio());
                break;
            case "E":
                pers.cambiarEstadoCivil(p);
                break;
        }
    }

    public void MostrarListaEst(HashSet<Ejercicio4Persona> estu) {
        System.out.println("Lista de estudiantes: ");
        for (Ejercicio4Persona per : estu) {
            if (per instanceof Ejercicio4Estudiante) {
                Ejercicio4Estudiante ob = (Ejercicio4Estudiante) per;
                System.out.println(ob.toString());
            }
        }
    }

    public void MostrarListaProfe(HashSet<Ejercicio4Empleado> profe) {
        System.out.println("Lista de profesores: ");
        for (Ejercicio4Empleado emple : profe) {
            if (emple instanceof Ejercicio4Profesor) {
                Ejercicio4Profesor ob = (Ejercicio4Profesor) emple;
                System.out.println(ob.toString());
            }
        }
    }

    public void MostrarListaPersServ(HashSet<Ejercicio4Empleado> persServ) {
        System.out.println("Lista de personal de servicio: ");
        for (Ejercicio4Empleado emple : persServ) {
            if (emple instanceof Ejercicio4PersonalDeServicio) {
                Ejercicio4PersonalDeServicio ob = (Ejercicio4PersonalDeServicio) emple;
                System.out.println(ob.toString());
            }
        }
    }

    public void Menu(Ejercicio4Facultad f) {
        int opc;
        boolean op1 = false;
        boolean op2 = false;
        boolean op3 = false;
        do {
            System.out.println("> > Menu < < Facultad " + f.getNombreFacultad()+ " < <");
            System.out.println("1 - Crear lista de estudiantes");
            System.out.println("2 - Crear lista de profesores");
            System.out.println("3 - Crear Lista de personal servicio");
            System.out.println("4 - Mostrar lista de estudiantes");
            System.out.println("5 - Mostrar lista de profesores");
            System.out.println("6 - Mostrar lista del personal servicio");
            System.out.println("7 - Cambiar datos de estudiantes");
            System.out.println("8 - Cambiar datos de profesores");
            System.out.println("9 - Cambiar datos de personal servicio");
            System.out.println("10 - Buscar estudiantes por carrera");
            System.out.println("11 - Buscar profesor por carrera");
            System.out.println("12 - Buscar personal servicio por área");
            System.out.println("13 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("¿Cuántos estudiantes quieres crear?");
                    int num = leer.nextInt();
                    crearListaDeEst(f.getEst(), num);
                    op1 = true;
                    break;
                case 2:
                    System.out.println("¿Cuántos profesores quieres crear?");
                    int num2 = leer.nextInt();
                    crearListaDeProfes(f.getProfes(), num2);
                    op2 = true;
                    break;
                case 3:
                    System.out.println("¿Cuántos personales de servicio quieres crear?");
                    int num3 = leer.nextInt();
                    crearListaDePersDeServ(f.getPersServ(), num3);
                    op3 = true;
                    break;
                case 4:
                    if (op1) {
                        MostrarListaEst(f.getEst());
                    } else {
                        System.out.println("Primero llene los datos de los estudiantes");
                    }
                    break;
                case 5:
                    if (op2) {
                        MostrarListaProfe(f.getProfes());
                    } else {
                        System.out.println("Primero llene los datos de los profesores");
                    }
                    break;
                case 6:
                    if (op3) {
                        MostrarListaPersServ(f.getPersServ());
                    } else {
                        System.out.println("Primero llene los datos del personal de servicio");
                    }
                    break;
                case 7:
                    if (op1) {
                        SeleccionarEstudiante(f.getEst());
                    } else {
                        System.out.println("Primero llene los datos de los estudiantes");
                    }
                    break;
                case 8:
                    if (op2) {
                        SeleccionarProfesor(f.getProfes());
                    } else {
                        System.out.println("Primero llene los datos de los profesores");
                    }
                    break;
                case 9:
                    if (op3) {
                        SeleccionarPersServ(f.getPersServ());
                    } else {
                        System.out.println("Primero llene los datos del personal de servicio");
                    }
                    break;
                case 10:
                    if (op1) {
                        BuscarEstxCarrera(f.getEst());
                    } else {
                        System.out.println("Primero llene los datos de los estudiantes");
                    }
                    break;
                case 11:
                    if (op2) {
                        BuscarProfxCarrera(f.getProfes());
                    } else {
                        System.out.println("Primero llene los datos de los profesores");
                    }
                    break;
                case 12:
                    if (op3) {
                        BuscarPerSxArea(f.getPersServ());
                    } else {
                        System.out.println("Primero llene los datos del personal de servicio");
                    }
                    break;
                case 13:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Dígito inválido");
            }
        } while (opc != 13);
    }

    public void BuscarEstxCarrera(HashSet<Entidades.Ejercicio4Persona> estu) {
        HashSet<Ejercicio4Persona> nuevo = new HashSet();
        emps.mostrarCarrera();
        System.out.println("\nSeleccione la materia por número: ");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Solamente ingrese números de 1 a 21");
            num = leer.nextInt();
        }
        String mat = emps.auxCambiarCarrera(num);
        for (Ejercicio4Persona pe : estu) {
            if (pe instanceof Ejercicio4Estudiante) {
                Ejercicio4Estudiante ob = (Ejercicio4Estudiante) pe;
                if (ob.getCurso().equalsIgnoreCase(mat)) {
                    nuevo.add(pe);
                }
            }
        }
        if (nuevo.isEmpty()) {
            System.out.println("No hay estudiantes en " + mat);
        } else {
            MostrarListaEst(nuevo);
        }

    }

    public void BuscarProfxCarrera(HashSet<Ejercicio4Empleado> profe) {
        HashSet<Ejercicio4Empleado> nuevo = new HashSet();
        emps.mostrarCarrera();
        System.out.println("\nSeleccione la materia por número: ");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Solamente ingrese números de 1 a 21");
            num = leer.nextInt();
        }
        String mat = emps.auxCambiarCarrera(num);
        for (Ejercicio4Empleado emple : profe) {
            if (emple instanceof Ejercicio4Profesor) {
                Ejercicio4Profesor ob = (Ejercicio4Profesor) emple;
                if (ob.getDepartamento().equalsIgnoreCase(mat)) {
                    nuevo.add(emple);
                }
            }
        }
        if (nuevo.isEmpty()) {
            System.out.println("No hay profesores en " + mat);
        } else {
            MostrarListaProfe(nuevo);
        }

    }

    public void BuscarPerSxArea(HashSet<Ejercicio4Empleado> persServ) {
        HashSet<Ejercicio4Empleado> nuevo = new HashSet();
        emps.mostrarServicios();
        System.out.println("\nSeleccione el área de servicio por número: ");
        int num = leer.nextInt();
        while (num < 1 || num > 16) {
            System.out.println("Solamente ingrese números de 1 a 16");
            num = leer.nextInt();
        }
        String serv = emps.auxCambiarServicio(num);
        for (Ejercicio4Empleado emple : persServ) {
            if (emple instanceof Ejercicio4PersonalDeServicio) {
                Ejercicio4PersonalDeServicio ob = (Ejercicio4PersonalDeServicio) emple;
                if (ob.getSeccion().equalsIgnoreCase(serv)) {
                    nuevo.add(emple);
                }
            }
        }
        if (nuevo.isEmpty()) {
            System.out.println("No hay personal en " + serv);
        } else {
            MostrarListaPersServ(nuevo);
        }

    }

}
