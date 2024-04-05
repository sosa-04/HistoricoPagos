package hn.unah.lenguajes1900.pagos.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.pagos.Entities.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, String> {
    
}
