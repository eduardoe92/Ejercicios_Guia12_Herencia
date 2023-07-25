package Service;

import Enumeraciones.departamento;
import entities.Empleado;
import entities.Profesor;


public class ProfesorService extends EmpleadoService {

    public Profesor crearProfesor() {
        Empleado e = super.crearEmpleado();

        return new Profesor(departamento.CIENCIAS_ECONOMICAS, e.getAnio(), e.getDespacho(), e.getNombre(), e.getDni(), e.getEstCivil());

    }

}
