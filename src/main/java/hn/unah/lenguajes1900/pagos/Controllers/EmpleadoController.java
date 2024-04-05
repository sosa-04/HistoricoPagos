package hn.unah.lenguajes1900.pagos.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.pagos.Entities.Empleado;
import hn.unah.lenguajes1900.pagos.Services.impl.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoServiceImpl empleadoServiceImpl;

    @PostMapping("/empleado/crear")
    public Empleado creareEmpleado(@RequestBody Empleado empleado){
        return this.empleadoServiceImpl.crearEmpleado(empleado);
    }

    @GetMapping("/empleado/buscar")
    public Optional<Empleado> buscarEmpleado(@RequestParam String dni){
        return this.empleadoServiceImpl.buscarEmpleado(dni);
    }

    @GetMapping("/empleado/obtener")
    public List<Empleado> obtenerEmpleados(){
        return this.empleadoServiceImpl.obtenerEmpleados();
    }

    @DeleteMapping("/empleado/eliminar")
    public String eliminarEmpleado(@RequestParam String dni){
        return this.empleadoServiceImpl.eliminarEmpleado(dni);
    }
}
