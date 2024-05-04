package org.App;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // menu
        while(true) {
            System.out.println("1. Abrir un archivo que contenga un experimento");
            System.out.println("2. Crear un nuevo experimento");
            System.out.println("3. Crear una poblacion de bacterias y añadirla al experimento actual");
            System.out.println("4. Visualizar los nombres de las poblaciones de bacterias del experimento actual");
            System.out.println("5. Borrar una poblacion de bacterias del experimento actual");
            System.out.println("6. Ver informacion detallada de una poblacion de bacterias del experimento actual");
            System.out.println("7. Guardar el experimento actual");
            System.out.println("8. Guardar el experimento actual como un nuevo archivo");
            System.out.println("0. Salir");


            System.out.print("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    System.out.println("Lógica para abrir un archivo");
                    break;
                case 2:
                    System.out.println("Lógica para crear un nuevo experimento");
                    break;
                case 3:
                    System.out.println("Lógica para crear una nueva población de bacterias y añadirla al experimento actual");
                    break;
                case 4:
                    System.out.println("Lógica para visualizar los nombres de las poblaciones de bacterias del experimento actual");
                    break;
                case 5:
                    System.out.println("Lógica para borrar una población de bacterias del experimento actual");
                    break;
                case 6:
                    System.out.println("Lógica para ver información detallada de una población de bacterias del experimento actual");
                    break;
                case 7:
                    System.out.println("Lógica para guardar el experimento actual");
                    break;
                case 8:
                    System.out.println("Lógica para guardar el experimento actual como un nuevo archivo");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion no valida");
            }

        }
    }
}