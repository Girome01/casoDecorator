import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

package com.mycompany.CasoDecorator;

/**
 *
 * @author Usuario
 */
public class CasoDecorator {

    static Scanner scanner = new Scanner(System.in);

    static String[] options = { "1- Sandwiches",
            "2- Adicionales",
            "3- Confirmar pedido",
            "4- Salir"
    };

    public void menu() {

        int option = 1;

        System.out.println("Menú Subgüey, por favor escoja alguna opción:");

        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        menuSandwiches();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;

                    case 4:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Ingrese un numero del 1 al 4" + options.length);
                scanner.next();
            }
        }
    }

    private int menuSandwiches() {
        System.out.println("Seleccione un sandwich\n");
        System.out.println("Sandwiches          Precio 15 CM        Precio 30 CM");
        int option = 0;
        while (option != 0) {
            //System.out.println("%s     %f      %f", sadwichPavo.name    , sandiwchPavo.precio15cm),     sandwichPavo.precio30cm);
            //System.out.println("%s     %d      %f", sadwichItaliano.name, sadwichItaliano.precio15cm),  sandwichItaliano.precio30cm);
            //System.out.println("%s     %d      %f", sadwichBeef.name    , sadwichBeef.precio15cm),      sandwichBeef.precio30cm);
            //System.out.println("%s     %d      %f", sadwichVeggie.name  , sadwichVeggie.precio15cm),    sandwichVeggie.precio30cm);
            //System.out.println("%s     %d      %f", sadwichAtun.name    , sadwichAtun.precio15cm),      sandwichAtun.precio30cm);
            //System.out.println("%s     %d      %f", sadwichPollo.name   , sadwichPollo.precio15cm),     sandwichPollo.precio30cm);
        }

        return
    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Escoja su opcion: ");
    }

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
