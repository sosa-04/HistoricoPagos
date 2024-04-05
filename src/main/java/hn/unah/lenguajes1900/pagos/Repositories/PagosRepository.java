package hn.unah.lenguajes1900.pagos.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.pagos.Entities.Pagos;

public interface PagosRepository extends CrudRepository<Pagos, Long> {
    
}
