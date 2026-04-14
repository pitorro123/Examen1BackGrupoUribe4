package com.example.modelos.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
    @Table(name="tabla proveedores")

    public class Proveedor {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   private String nombre;
   private String direccion;
   private String nit;
   private String numeroCuentaBancaria;
   public Integer getId() {
    return id;
   }
   public void setId(Integer id) {
    this.id = id;
   }
   public String getNombre() {
    return nombre;
   }
   public void setNombre(String nombre) {
    this.nombre = nombre;
   }
   public String getDireccion() {
    return direccion;
   }
   public void setDireccion(String direccion) {
    this.direccion = direccion;
   }
   public String getNit() {
    return nit;
   }
   public void setNit(String nit) {
    this.nit = nit;
   }
   public String getNumeroCuentaBancaria() {
    return numeroCuentaBancaria;
   }
   public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
    this.numeroCuentaBancaria = numeroCuentaBancaria;
   }
   public Proveedor(Integer id, String nombre, String direccion, String nit, String numeroCuentaBancaria) {
    this.id = id;
    this.nombre = nombre;
    this.direccion = direccion;
    this.nit = nit;
    this.numeroCuentaBancaria = numeroCuentaBancaria;
   }
   



}
