package hn.unah.lenguajes1900.pagos.Services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.pagos.DTOS.PagosFechas;
import hn.unah.lenguajes1900.pagos.DTOS.dtoPagos;
import hn.unah.lenguajes1900.pagos.Entities.Pagos;
import hn.unah.lenguajes1900.pagos.Repositories.PagosRepository;
import hn.unah.lenguajes1900.pagos.Services.PagosService;

@Service
public class PagosServiceImpl implements PagosService {

    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public String crearPago(dtoPagos pago) {

        Pagos pagos = new Pagos();

        if((pago.getHorasTrabajadas()>0) && (pago.getPrecioPorHora()>0)){

            pagos.setFechaPago(LocalDate.now());
            pagos.setEmpleado(pago.getEmpleado());
            pagos.setHorasTrabajadas(pago.getHorasTrabajadas());
            pagos.setPrecioPorHora(pago.getPrecioPorHora());
            pagos.setTotalSueldo(((pago.getPrecioPorHora())*(pago.getHorasTrabajadas())));

            this.pagosRepository.save(pagos);

            return "Pago agregado con exito";
        }

        return "Horas trabajadas o precio por hora no valido";
    }

    @Override
    public List<Pagos> obtenerPagosPorFecha(PagosFechas pagosFechas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPagosPorFecha'");
    }
    
}
