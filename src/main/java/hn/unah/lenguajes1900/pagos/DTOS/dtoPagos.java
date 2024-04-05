package hn.unah.lenguajes1900.pagos.DTOS;

import hn.unah.lenguajes1900.pagos.Entities.Empleado;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class dtoPagos {
    
    private String dni;

    private int horasTrabajadas;

    private double precioPorHora;

    private Empleado empleado;
}
