package com.example.modelos.modelos;
import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabla pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroPedido;
    private LocalDateTime fecha;
    private Integer montoTotal;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Integer getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }
    public Pedido(Integer id, String numeroPedido, LocalDateTime fecha, Integer montoTotal) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
    }
    
   

}
