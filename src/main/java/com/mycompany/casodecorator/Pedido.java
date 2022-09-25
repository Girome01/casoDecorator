package com.mycompany.casodecorator;

import java.util.ArrayList;

public class Pedido {
    public String cliente;
    public double precio;
    public ArrayList<iComponent> Orden = new ArrayList<iComponent>();

    public void printPedido() {
        System.out.printf("El pedido a nombre de %s contiene\n", this.cliente);
        float precioTotal = 0;
        for (iComponent component : this.Orden) {
            System.out.printf("%s       %.2f\n", component.getDescripcion(), component.getPrecio());
            precioTotal += component.getPrecio();
        }
        System.out.printf("Precio Total ----- %.2f\n", precioTotal);
        precio = precioTotal;
    }

}
