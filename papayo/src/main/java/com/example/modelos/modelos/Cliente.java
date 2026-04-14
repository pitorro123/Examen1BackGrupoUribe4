package com.example.modelos.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabla clientes")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String email;
    private String direccion;
    private String telefono;

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
(())
public Integer getEmail() {
    return email;
   }
   public void setEmail(Integer email) {
    this.email = email;
   }
   public Integer getDireccion() {
    return direccion;
   }
   public void getDireccion(Integer direccion) {
    this.direccion = direccion;
   }
   public Integer setTelefono() {
    return telefono;
   }
   public void setTelefono(Integer telefono) {
    this.telefono = telefono;

}
