package hn.unah.lenguajes1900.pagos.Services;

import java.util.List;

import hn.unah.lenguajes1900.pagos.DTOS.PagosFechas;
import hn.unah.lenguajes1900.pagos.DTOS.dtoPagos;
import hn.unah.lenguajes1900.pagos.Entities.Pagos;

public interface PagosService {
    
    public String crearPago(dtoPagos pago);

    public List<Pagos> obtenerPagosPorFecha(PagosFechas pagosFechas);
}
