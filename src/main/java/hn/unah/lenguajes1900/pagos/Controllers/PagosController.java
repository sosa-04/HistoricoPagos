package hn.unah.lenguajes1900.pagos.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.pagos.DTOS.dtoPagos;
import hn.unah.lenguajes1900.pagos.Services.impl.PagosServiceImpl;

@RestController
@RequestMapping("/api")
public class PagosController {
    
    @Autowired
    private PagosServiceImpl pagosServiceImpl;

    @PostMapping("/pagos/crear")
    public String crearPago(@RequestBody dtoPagos pago){
        return this.pagosServiceImpl.crearPago(pago);
    }
}
