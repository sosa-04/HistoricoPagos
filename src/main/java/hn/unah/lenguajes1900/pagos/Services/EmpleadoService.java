package hn.unah.lenguajes1900.pagos.Services;


import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.pagos.Entities.Empleado;

public interface EmpleadoService {
    
    public Empleado crearEmpleado(Empleado empleado);

    public String eliminarEmpleado(String dni);

    public Optional<Empleado> buscarEmpleado(String dni);

    public List<Empleado> obtenerEmpleados();

    
}
