package org.App.CultivoBacterias;

public class Experimento {

    int idExperimento;
    int maxComida = 300;
    int[] cantidadComida = new int[30];
    PoblacionBacterias[] poblacionBacteriana;
    String nombreArchivo;

    public Experimento(int idExperimento, PoblacionBacterias[] poblacionBacteriana, String nombreArchivo) {
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

    public void crearPoblacionBacterias(String nombrePoblacion, String fechaInicio, int numInicialBacterias, double temperatura, String luminosidad) {
        PoblacionBacterias poblacionBacterias = new PoblacionBacterias(nombrePoblacion, fechaInicio, numInicialBacterias, temperatura, luminosidad);
        PoblacionBacterias[] poblacionBacteriasAux = new PoblacionBacterias[poblacionBacteriana.length + 1];

        for (int i = 0; i < poblacionBacteriana.length; i++) {
            poblacionBacteriasAux[i] = poblacionBacteriana[i];
        }

        poblacionBacteriasAux[poblacionBacteriasAux.length - 1] = poblacionBacterias;
        poblacionBacteriana = poblacionBacteriasAux;

    }

    public void borrarPoblacionBacterias(PoblacionBacterias[] poblacionBacterias, String nombrePoblacion) {
        PoblacionBacterias[] poblacionBacteriasAux = new PoblacionBacterias[poblacionBacterias.length - 1];
        int j = 0;

        for (int i = 0; i < poblacionBacterias.length; i++) {
            if (!poblacionBacterias[i].nombre.equals(nombrePoblacion)) {
                poblacionBacteriasAux[j] = poblacionBacterias[i];
                j++;
            }
        }

        poblacionBacterias = poblacionBacteriasAux;

    }

    public void visualizarNombresPoblaciones(PoblacionBacterias[] poblacionBacterias) {
        for (int i = 0; i < poblacionBacterias.length; i++) {
            System.out.println(poblacionBacterias[i].nombre);
        }

    }

    public void guardarExperimento() {

    }

    public void guardarExperimentoComo() {

    }

    public void verDetallesPoblacion(PoblacionBacterias[] poblacionBacteriana, String nombrePoblacion) {
        for (int i = 0; i < poblacionBacteriana.length; i++) {
            if (poblacionBacteriana[i].nombre.equals(nombrePoblacion)) {
                System.out.println("Nombre: " + poblacionBacteriana[i].nombre);
                System.out.println("Fecha de inicio: " + poblacionBacteriana[i].fechaInicio);
                System.out.println("Número inicial de bacterias: " + poblacionBacteriana[i].numInicialBacterias);
                System.out.println("Temperatura: " + poblacionBacteriana[i].temperatura);
                System.out.println("Luminosidad: " + poblacionBacteriana[i].luminosidad);
            }
        }

    }


}
