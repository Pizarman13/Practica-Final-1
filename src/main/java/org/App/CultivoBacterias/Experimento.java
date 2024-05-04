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

    public void setIdExperimento(int idExperimento) {
        this.idExperimento = idExperimento;
    }

    public int getIdExperimento() {
        return idExperimento;
    }

    public void setPoblacionBacteriana(PoblacionBacterias poblacionBacteriana) {
        this.poblacionBacteriana = poblacionBacteriana;
    }

    public PoblacionBacterias getPoblacionBacteriana() {
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

}
