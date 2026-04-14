package com.example.modelos.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabla de Ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numeroPedido;
    private Integer totalPagar;
    private String cantidadProductos;
    private Integer precioProducto;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public Integer getTotalPagar() {
        return totalPagar;
    }
    public void setTotalPagar(Integer totalPagar) {
        this.totalPagar = totalPagar;
    }
    public String getCantidadProductos() {
        return cantidadProductos;
    }
    public void setCantidadProductos(String cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    public Integer getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }
    public Venta(Integer id, Integer numeroPedido, Integer totalPagar, String cantidadProductos,
            Integer precioProducto) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.totalPagar = totalPagar;
        this.cantidadProductos = cantidadProductos;
        this.precioProducto = precioProducto;
    }



}
