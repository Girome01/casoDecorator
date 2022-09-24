/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casodecorator;

/**
 *
 * @author Usuario
 */
public abstract class ComponentDecorator implement iComponent{
    private iComponent sandwich;

    public ComponentDecorator(iComponent sandwich) {
        this.sandwich = sandwich;
    }

    public iComponent getSandwich() {
        return sandwich;
    }

    public void setSandwich(iComponent sandwich) {
        this.sandwich = sandwich;
    }
    
    public double getPrecio(){
        return getSandwich().getPrecio();
    }
    
    public String getDescripcion(){
        return getSandwich().getDescripcion();
    }
}
