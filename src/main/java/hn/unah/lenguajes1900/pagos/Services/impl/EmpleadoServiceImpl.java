package hn.unah.lenguajes1900.pagos.Services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.pagos.Entities.Empleado;
import hn.unah.lenguajes1900.pagos.Repositories.EmpleadoRepository;
import hn.unah.lenguajes1900.pagos.Services.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }

    @Override
    public String eliminarEmpleado(String dni) {
        if (this.empleadoRepository.findById(dni).isPresent()) {
            this.empleadoRepository.deleteById(dni);
            
            return "empleado eliminado";
        }
        
        return "El empleado no existe";
    }

    @Override
    public Optional<Empleado> buscarEmpleado(String dni) {
        return this.empleadoRepository.findById(dni);
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return (List<Empleado>) this.empleadoRepository.findAll();
    }
    
}
