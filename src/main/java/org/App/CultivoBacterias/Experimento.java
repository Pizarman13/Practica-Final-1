package org.App.CultivoBacterias;

import java.io.*;
import java.time.LocalDate;

public class Experimento implements Serializable{

    int idExperimento;
    int maxComida = 300;
    int[] cantidadComida = new int[30];
    PoblacionBacterias[] poblacionBacteriana;
    String nombreArchivo;

    public Experimento(int idExperimento, PoblacionBacterias[] poblacionBacteriana) {
        this.idExperimento = idExperimento;
        this.poblacionBacteriana = poblacionBacteriana;
    }

    public void setIdExperimento(int idExperimento) {
        this.idExperimento = idExperimento;
    }

    public int getIdExperimento() {
        return idExperimento;
    }

    public void setPoblacionBacteriana(PoblacionBacterias[] poblacionBacteriana) {
        this.poblacionBacteriana = poblacionBacteriana;
    }

    public PoblacionBacterias[] getPoblacionBacteriana() {
        return poblacionBacteriana;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setCantidadComida(int[] cantidadComida) {
        this.cantidadComida = cantidadComida;
    }

    public int[] getCantidadComida() {
        return cantidadComida;
    }

    public int getMaxComida() {
        return maxComida;
    }

    public void regulacionLinealComida(int dia) {
        if (dia > 1 && dia < 30) {

            for (int i = 0; i < dia; i++) {
                cantidadComida[i] = dia*4 + 40;

                if (cantidadComida[i] > maxComida) {
                    cantidadComida[i] = maxComida;
                }
            }

            for (int i = dia; i < cantidadComida.length; i++) {
                cantidadComida[i] = dia*4 - 20;

                if (cantidadComida[i] < 0) {
                    cantidadComida[i] = 0;
                }
            }

        }
    }

    public void anadirPoblacionBacterias(PoblacionBacterias poblacionBacterias) {
        PoblacionBacterias[] poblacionBacteriasAux = new PoblacionBacterias[poblacionBacteriana.length + 1];

        for (int i = 0; i < poblacionBacteriana.length; i++) {
            poblacionBacteriasAux[i] = poblacionBacteriana[i];
        }

        poblacionBacteriasAux[poblacionBacteriana.length] = poblacionBacterias;
        poblacionBacteriana = poblacionBacteriasAux;

    }

    public void borrarPoblacionBacterias(String nombrePoblacion) {

        for (int i = 0; i < poblacionBacteriana.length; i++) {
            if (poblacionBacteriana[i].nombre.equals(nombrePoblacion)) {
                PoblacionBacterias[] poblacionBacteriasAux = new PoblacionBacterias[poblacionBacteriana.length - 1];
                int j = 0;
                for (int k = 0; k < poblacionBacteriana.length; k++) {
                    if (k != i) {
                        poblacionBacteriasAux[j] = poblacionBacteriana[k];
                        j++;
                    }
                }
                poblacionBacteriana = poblacionBacteriasAux;
            } else {
                System.out.println("No se encontró la población de bacterias con el nombre " + nombrePoblacion);
            }
        }
    }

    public void visualizarNombresPoblaciones() {
        for (int i = 0; i < poblacionBacteriana.length; i++) {
            System.out.println(poblacionBacteriana[i].nombre);
        }
    }


    public void verDetallesPoblacion(String nombrePoblacion) {
        for (int i = 0; i < poblacionBacteriana.length; i++) {
            if (poblacionBacteriana[i].nombre.equals(nombrePoblacion)) {
                System.out.println("Nombre: " + poblacionBacteriana[i].nombre);
                System.out.println("Fecha de inicio: " + poblacionBacteriana[i].fechaInicio);
                System.out.println("Número inicial de bacterias: " + poblacionBacteriana[i].numInicialBacterias);
                System.out.println("Temperatura: " + poblacionBacteriana[i].temperatura);
                System.out.println("Luminosidad: " + poblacionBacteriana[i].luminosidad);
                System.out.println("Fecha de fin: " + poblacionBacteriana[i].fechaFin);
            } else {
                System.out.println("No se encontró la población de bacterias con el nombre " + nombrePoblacion);
            }
        }
    }

    // Manejo archivos
    public void guardarExperimento() {
        if (nombreArchivo == null) {
            System.out.println("El nombre del archivo no puede ser nulo");
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.nombreArchivo))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarExperimentoComo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        guardarExperimento();
    }

    public static Experimento cargarExperimento(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (Experimento) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
