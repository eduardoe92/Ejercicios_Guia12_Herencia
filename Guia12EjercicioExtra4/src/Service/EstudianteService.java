
package services;

import Service.PersonaService;
import entities.Persona;
import entities.Estudiante;
import java.util.ArrayList;

public final class EstudianteService extends PersonaService {
    
    public Estudiante crearEstudiante(){
        Persona p=super.crearPersona();
        ArrayList<String>cursos= new ArrayList();
        cursos.add("Programación Inicial");
        
        return new Estudiante(cursos,p.getNombre(),p.getDni(),p.getEstCivil());
            
    }
}
