package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;

public class Espectaculo {
    private int codigoUnico;
    private String nombre;
    private List<Funcion> funciones;

    public Espectaculo(int codigoUnico, String nombre) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.funciones = new ArrayList<>();
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Funcion> getFunciones() {
        return new ArrayList<>(funciones); // copia para proteger la lista interna
    }

    @Override
    public String toString() {
        return nombre + " (Código: " + codigoUnico + ") - Funciones: " + funciones.size();
    }
}
