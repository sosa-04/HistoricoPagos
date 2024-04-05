package hn.unah.lenguajes1900.pagos.DTOS;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PagosFechas {
    
    private String dni;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;
}
