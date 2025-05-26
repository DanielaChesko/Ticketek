package ar.edu.ungs.prog2.ticketek;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcion {
    private LocalDate fecha;
    private double precioBase = 30000.0;
    private Sede sede;

    public Funcion(String fechaStr, Sede sede, double precioBase) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fechaStr, formatter);
        this.sede = sede;
        this.precioBase = precioBase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getFechaComoString() {
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Sede getSede() {
        return sede;
    }

    @Override
    public String toString() {
        return "(" + getFechaComoString() + ") " + sede.getNombre();
    }
}
