package org.App.ManejoArchivos;

import java.io.*;

public class ManejoArchivo {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo + ".txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo + ".txt");
            escritor.write(contenido);
            escritor.close();
            System.out.println("Se escribió en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo + ".txt");
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        crearArchivo("experimentos\\archivoPrueba");
        escribirArchivo("experimentos\\archivoPrueba", "Hola, mundo!");
        leerArchivo("experimentos\\archivoPrueba");
    }

}
