package ar.edu.ungs.prog2.ticketek;

public abstract class Sede {
    private String nombre;
    private String direccion;
    private int capacidadMaxima;

    public Sede(String nombre, String direccion, int capacidadMaxima) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public abstract String getTipoSede();

    public abstract double calcularPrecioEntrada(double precioBase, String sector, int asiento);

    @Override
    public String toString() {
        return nombre + " (" + getTipoSede() + ") - Dirección: " + direccion + ", Capacidad: " + capacidadMaxima;
    }
}
