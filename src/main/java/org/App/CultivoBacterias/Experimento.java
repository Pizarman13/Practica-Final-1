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




}
