package org.App.CultivoBacterias;

public class Experimento {

    int idExperimento;
    int maxComida = 300;
    int[] cantidadComida = new int[30];
    PoblacionBacterias poblacionBacteriana;
    String nombreArchivo;

    public Experimento(int idExperimento, PoblacionBacterias poblacionBacteriana, String nombreArchivo) {
        this.idExperimento = idExperimento;
        this.poblacionBacteriana = poblacionBacteriana;
        this.nombreArchivo = nombreArchivo;
    }

    public void agregarComida(int dia, int cantidad) {
        if (dia > 1 && dia < 30) {

            for (int i = 0; i < dia; i++) {
                cantidadComida[i] = dia*4 + cantidad;

                if (cantidadComida[i] > maxComida) {
                    cantidadComida[i] = maxComida;
                }
            }

        }
    }

    public void quitarComida(int dia, int cantidad) {
        if (dia > 1 && dia < 30) {

            for (int i = dia; i < cantidadComida.length; i++) {
                cantidadComida[i] = dia*4 - cantidad;

                if (cantidadComida[i] < 0) {
                    cantidadComida[i] = 0;
                }
            }

        }
    }



}
