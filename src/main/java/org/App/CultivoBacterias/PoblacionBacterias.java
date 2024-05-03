package org.App.CultivoBacterias;

import java.util.*;

public class PoblacionBacterias {

    public enum Luminosidad {
        Alta, Media, Baja
    }

    String nombre;
    Date fechaInicio;
    Date fechaFin;
    int numInicialBacterias;
    double temperatura;
    Luminosidad luminosidad;

    public PoblacionBacterias(String nombre, Date fechaInicio, Date fechaFin, int numInicialBacterias, double temperatura, Luminosidad luminosidad) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numInicialBacterias = numInicialBacterias;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
    }

    


}
