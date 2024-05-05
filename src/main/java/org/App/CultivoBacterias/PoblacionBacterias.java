package org.App.CultivoBacterias;

import java.util.*;
import java.time.LocalDate;

public class PoblacionBacterias {

    public enum Luminosidad {
        Alta, Media, Baja
    }

    String nombre;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    int numInicialBacterias;
    double temperatura;
    Luminosidad luminosidad;

    public PoblacionBacterias(String nombre, LocalDate fechaInicio, int numInicialBacterias, double temperatura, Luminosidad luminosidad) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.numInicialBacterias = numInicialBacterias;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
        this.fechaFin = fechaInicio.plusDays(30);
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setLuminosidad(Luminosidad luminosidad) {
        this.luminosidad = luminosidad;
    }

    public Luminosidad getLuminosidad() {
        return luminosidad;
    }

    public void setNumInicialBacterias(int numInicialBacterias) {
        this.numInicialBacterias = numInicialBacterias;
    }

    public int getNumInicialBacterias() {
        return numInicialBacterias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }



}
