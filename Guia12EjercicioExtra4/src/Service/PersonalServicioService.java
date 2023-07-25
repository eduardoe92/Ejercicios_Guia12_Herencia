
package Service;

import Enumeraciones.seccion;
import entities.Empleado;
import entities.PersonalServicio;

public class PersonalServicioService extends EmpleadoService{
    
    public PersonalServicio crearEmpleado(){
        Empleado e=super.crearEmpleado();
        return new PersonalServicio(seccion.DECANATO,e.getAnio(),e.getDespacho(),e.getNombre(),e.getDni(),e.getEstCivil());
    }
    
}
