
package Service;

import entities.Empleado;
import entities.Persona;

public class EmpleadoService extends PersonaService{
    
    public Empleado crearEmpleado(){
        Persona p=super.crearPersona();
        
        return new Empleado(1997,203,p.getNombre(),p.getDni(),p.getEstCivil());
    
    }
}
