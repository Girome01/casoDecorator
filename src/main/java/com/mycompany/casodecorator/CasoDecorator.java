/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.casodecorator;

/**
 *
 * @author Usuario
 */
public class CasoDecorator {

    public static void main(String[] args) {
        Sandwich pavo15 = getSandwich("Pavo 15");
        Sandwich pavo30 = getSandwich("Pavo 30");
        Sandwich italiano15 = getSandwich("Italiano 15");
        Sandwich italiano30 = getSandwich("Italiano 30");
        Sandwich beef15 = getSandwich("Beef 15");
        Sandwich beef30 = getSandwich("Beef 30");
        Sandwich veggie15 = getSandwich("Veggie 15");
        Sandwich veggie30 = getSandwich("Veggie 30");
        Sandwich atun15 = getSandwich("Atun 15");
        Sandwich atun30 = getSandwich("Atun 30");
        Sandwich pollo15 = getSandwich("Pollo 15");
        Sandwich pollo30 = getSandwich("Pollo 30");
        
    }
    
    public static Sandwich getSandwich(String nombre){
        /*Sandwich(proteina, precio, tamanno, tipo)*/
        if(nombre.equals("Pavo 15"))
            return new Sandwich("Pavo",12,15,"");
        if(nombre.equals("Pavo 30"))
            return new Sandwich("Pavo",18,30,"");

        if(nombre.equals("Italiano 15"))
            return new Sandwich("Italiano",9,15,"");
        if(nombre.equals("Italiano 30"))
            return new Sandwich("Italiano",16,30,"");

        if(nombre.equals("Beef 15"))
            return new Sandwich("Beef",10,15,"");
        if(nombre.equals("Beef 30"))
            return new Sandwich("Beef",16,30,"");

        if(nombre.equals("Veggie 15"))
            return new Sandwich("Veggie",8,15,"");
        if(nombre.equals("Veggie 30"))
            return new Sandwich("Veggie",14,30,"");

        if(nombre.equals("Atun 15"))
            return new Sandwich("Atún",11,15,"");
        if(nombre.equals("Atun 30"))
            return new Sandwich("Atún",17,30,"");

        if(nombre.equals("Pollo 15"))
            return new Sandwich("Pollo",12,15,"");
        if(nombre.equals("Pollo 30"))
            return new Sandwich("Pollo",18,30,"");
        return null;
    }

    public static Adicional getAdicional(String nombre, iComponent sandwich){
        if(nombre.equals("Aguacate 15"))
            return new Adicional(1.5, "Aguacate", sandwich);
        if(nombre.equals("Aguacate 30"))
            return new Adicional(2.5,"Aguacate",sandwich);

        if(nombre.equals("Doble proteina 15"))
            return new Adicional(4.5,"Doble proteína",sandwich);
        if(nombre.equals("Doble proteina 30"))
            return new Adicional(8,"Doble proteína",sandwich);

        if(nombre.equals("Hongos 15"))
            return new Adicional(0.85,"Hongos",sandwich);
        if(nombre.equals("Hongos 30"))
            return new Adicional(1.45,"Hongos",sandwich);

        if(nombre.equals("Refresco 15") || nombre.equals("Refresco 30"))
            return new Adicional(1,"Refresco",sandwich);

        if(nombre.equals("Sopa 15") || nombre.equals("Sopa 30"))
            return new Adicional(4.2,"Sopa",sandwich);

        if(nombre.equals("Postre 15") || nombre.equals("Postre 30"))
            return new Adicional(3.5,"Postre",sandwich);

        return null;
    }
    
}
