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
        System.out.println("Hello World!");
        printMenu(options);
    }

}
