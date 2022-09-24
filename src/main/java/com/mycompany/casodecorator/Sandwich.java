package com.mycompany.casodecorator;

public class Sandwich implements iComponent{
 
    private String proteina;
    private double precio;
    private int tamanno;
    private String tipo;

    public Sandwich(String proteina, double precio, int tamanno, String tipo) {
        this.proteina = proteina;
        this.precio = precio;
        this.tamanno = tamanno;
        this.tipo = tipo;
    }

    @Override
    public double getPrecio() {
        return this.precio;

        
    }
    @Override
    public String getDescripcion() {
        String descrString=this.proteina+" de "+this.tamanno+"cm "+"("+this.precio+")";
        return descrString;
    }

    public String getProteina() {
        return proteina;
    }

    public int getTamanno() {
        return tamanno;
    }

    public String getTipo() {
        return tipo;
    } 
}
