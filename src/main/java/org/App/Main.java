package org.App;

import java.util.Scanner;
import org.App.CultivoBacterias.*;
import org.App.ManejoArchivos.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // menu
        while(true) {
            System.out.println("1. Abrir un archivo que contenga un experimento");
            System.out.println("2. Crear un nuevo experimento");
            System.out.println("0. Salir");


            System.out.print("Ingrese una opcion: ");

                String opcion = sc.nextLine();

                switch(opcion) {
                    case "1":
                        System.out.println("Introduzca el nombre del archivo que desea abrir: ");
                        String nombreArchivo = sc.nextLine();
                        abrirExperimento(nombreArchivo);
                        break;
                    case "2":
                        System.out.println("Introduzca el nombre del experimento que desea crear: ");
                        String nombreArchivoEx = sc.nextLine();
                        ManejoArchivo.crearArchivo(nombreArchivoEx);
                        abrirExperimento(nombreArchivoEx);
                        break;
                    case "0":
                        System.out.println("Saliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }

        }
    }

    public static void abrirExperimento(String nombreArchivo) {
        //ManejoArchivo.leerArchivo(nombreArchivo);

        Experimento experimento = new Experimento(1, new PoblacionBacterias[3], nombreArchivo);

        while(true) {
            System.out.println("1. Crear una nueva población de bacterias y  añadirla a este experimento");
            System.out.println("2. Borrar una población de bacterias de este experimento");
            System.out.println("3. Visalizar los nombres de las poblaciones de bacterias de este experimento");
            System.out.println("4. Ver informacion detallada de una población de bacterias de este experimento");
            System.out.println("5. Guardar el experimento");
            System.out.println("6. Guardar el experimento como");
            System.out.println("7. Salir");

            System.out.print("Ingrese una opcion: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduzca el nombre de la población de bacterias: ");
                    String nombrePoblacion = sc.nextLine();
                    System.out.println("Introduzca la fecha de inicio de la población de bacterias: ");
                    String fechaInicio = sc.nextLine();
                    System.out.println("Introduzca el número inicial de bacterias: ");
                    int numInicialBacterias = sc.nextInt();
                    System.out.println("Introduzca la temperatura: ");
                    double temperatura = sc.nextDouble();
                    System.out.println("Introduzca la luminosidad: ");
                    String luminosidad = sc.nextLine();
                    experimento.crearPoblacionBacterias(nombrePoblacion, fechaInicio, numInicialBacterias, temperatura, luminosidad);
                    break;
                case "2":
                    System.out.println("Introduzca el nombre de la población de bacterias que desea borrar: ");
                    String nombrePoblacionBorrar = sc.nextLine();
                    experimento.borrarPoblacionBacterias();
                    break;
                case "3":
                    experimento.visualizarNombresPoblaciones();
                    break;
                case "4":
                    System.out.println("Introduzca el nombre de la población de bacterias de la que desea ver información detallada: ");
                    String nombrePoblacionDetalles = sc.nextLine();
                    experimento.verDetallesPoblacion();
                    break;
                case "5":
                    experimento.guardarExperimento();
                    break;
                case "6":
                    System.out.println("Introduzca el nombre del archivo en el que desea guardar el experimento: ");
                    String nombreArchivoGuardar = sc.nextLine();
                    experimento.guardarExperimentoComo();
                    break;
                case "7":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }

}