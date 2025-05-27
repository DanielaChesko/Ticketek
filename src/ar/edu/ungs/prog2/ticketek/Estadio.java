package ar.edu.ungs.prog2.ticketek;

public class Estadio extends Sede {

    private static String sector = "Campo";
    private static int capacidadMax = 1000;
    private static int precioFijo = 25000;

    public Estadio(String nombre, String direccion) {
        super(nombre, direccion, capacidadMax);
    }

    @Override
    public String getTipoSede() {
        return "Estadio";
    }

    @Override
    public double calcularPrecioEntrada(double precioBase, String sector, int asiento) {
        return precioFijo;
    }

    public String getSector() {
        return sector;
    }
}
