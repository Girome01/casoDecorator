package com.mycompany.casodecorator;

import com.mycompany.casodecorator.Adicional;
import com.mycompany.casodecorator.Pedido;
import com.mycompany.casodecorator.Sandwich;
import com.mycompany.casodecorator.iComponent;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

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

    public static int menuSandwiches(ArrayList<Sandwich> sandwiches) {
        System.out.println("Sandwiches          Precio");
        int option = 0;
        
        while (option < 1 || option > 12) {
            int count = 1;
            System.out.println("Seleccione un sandwich\n");
            for (Sandwich sandwich : sandwiches) {
                System.out.printf("%d- %s     $%.2f\n", count, sandwich.getDescripcion(), sandwich.getPrecio());
                count ++;
            }
            option = scanner.nextInt();
        }

        return option-1;
    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Escoja su opcion: ");
    }

    public static void main(String[] args) {

        ArrayList<Sandwich> menu = new ArrayList<>();

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

        menu.add(pavo15);
        menu.add(pavo30);
        menu.add(italiano15);
        menu.add(italiano30);
        menu.add(beef15);
        menu.add(beef30);
        menu.add(veggie15);
        menu.add(veggie30);
        menu.add(atun15);
        menu.add(atun30);
        menu.add(pollo15);
        menu.add(pollo30);


        int option = 1;

        System.out.println("Menú Subgüey, por favor escoja su opción:");
        Pedido pedido = new Pedido();
        int sandiwchSelection = -1;
        iComponent component = null;

        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        if (component != null) pedido.Orden.add(component);
                        sandiwchSelection = menuSandwiches(menu);
                        component = menu.get(sandiwchSelection);
                        break;
                    case 2:
                        int adic = 0;
                        while(adic != 7) {
                            if (sandiwchSelection != -1) {
                                if (menu.get(sandiwchSelection).getTamanno() == 15) {
                                    System.out.println("1 - Aguacate        - $1.5");
                                    System.out.println("2 - Doble Proteina  - $4.5");
                                    System.out.println("3 - Hongos          - $0.85");
                                    System.out.println("4 - Refresco        - $1");
                                    System.out.println("5 - Sopa            - $4.2");
                                    System.out.println("6 - Postre          - $3.5");
                                    System.out.println("7 - No agregar más  - $0");
                                    System.out.println("Seleccione el adicional que desea agregar");
                                    adic = scanner.nextInt();
                                    switch (adic){
                                        case 1:
                                            component = getAdicional("Aguacate 15", component);
                                            break;
                                        case 2:
                                                component = getAdicional("Doble Proteina 15", component);
                                                break;
                                        case 3:
                                                component = getAdicional("Hongos 15", component);
                                                break;
                                        case 4:
                                                component = getAdicional("Refresco 15", component);
                                                break;
                                        case 5:
                                                component = getAdicional("Sopa 15", component);
                                                break;
                                        case 6:
                                                component = getAdicional("Postre 15", component);
                                                break;
                                        case 7:
                                                break;
                                        default:
                                            exit(1);
                                        }
                                    }
                                //En caso de que el sandwich sea de 30 cm
                                else {
                                    System.out.println("1 - Aguacate        - $2.5");
                                    System.out.println("2 - Doble Proteina  - $8");
                                    System.out.println("3 - Hongos          - $1.45");
                                    System.out.println("4 - Refresco        - $1");
                                    System.out.println("5 - Sopa            - $4.2");
                                    System.out.println("6 - Postre          - $3.5");
                                    System.out.println("7 - No agregar más  - $0");
                                    System.out.println("Seleccione el adicional que desea agregar");
                                    adic = scanner.nextInt();
                                    switch (adic){
                                        case 1:
                                            component = getAdicional("Aguacate 30", component);
                                            break;
                                        case 2:
                                            component = getAdicional("Doble Proteina 30", component);
                                            break;
                                        case 3:
                                            component = getAdicional("Hongos 30", component);
                                            break;
                                        case 4:
                                            component = getAdicional("Refresco 30", component);
                                            break;
                                        case 5:
                                            component = getAdicional("Sopa 30", component);
                                            break;
                                        case 6:
                                            component = getAdicional("Postre 30", component);
                                            break;
                                        case 7:
                                            break;
                                        default:
                                            exit(1);
                                    }
                                }

                            } else {
                                System.out.println("Por favor seleccione un sandwich antes de agregar adicionales");
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Por favor indique el nombre del cliente");
                        pedido.cliente = scanner.next();
                        if (component != null) pedido.Orden.add(component);
                        pedido.printPedido();
                        break;

                    case 4:
                        exit(1);
                }
            } catch (Exception ex) {
                System.out.println("Ingrese un numero del 1 al 4");
                scanner.next();
            }
        }



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
