package hn.unah.lenguajes1900.pagos.Entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "historicopagos")
@Data
public class Pagos {
    
    @Id
    @Column(name = "idpago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPago;

    @Column(name = "horastrabajadas")
    private int horasTrabajadas;

    @Column(name = "precioporhora")
    private double precioPorHora;

    @Column(name = "totalsueldo")
    private double totalSueldo;

    @Column(name = "fechapago")
    private LocalDate fechaPago;

    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Empleado empleado;
}
