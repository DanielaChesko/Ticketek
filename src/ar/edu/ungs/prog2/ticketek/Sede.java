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

    // Método abstracto para que cada sede defina su tipo
    public abstract String getTipoSede();

    // Método abstracto para calcular el precio real de una entrada según sede y sector
    public abstract double calcularPrecioEntrada(double precioBase, String sector, int asiento);

    @Override
    public String toString() {
        return nombre + " (" + getTipoSede() + ") - Dirección: " + direccion + ", Capacidad: " + capacidadMaxima;
    }
}
