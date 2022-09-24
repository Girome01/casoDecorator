/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casodecorator;

/**
 *
 * @author Usuario
 */
public class Adicional extends ComponentDecorator{
    private double precio;
    private String descripcion;

    public Adicional(double precio, String descripcion, Object sandwich) {
        super(sandwich);
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return getSandwich().getDescripcion().concat(this.descripcion);
    }

    @Override
    public double getPrecio() {
        return getSandwich().getPrecio() + this.precio;
    }

    
    
}
