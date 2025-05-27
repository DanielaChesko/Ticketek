package ar.edu.ungs.prog2.ticketek;

public class MiniEstadio extends SedeConPlatea {

    private int puestosDeComida;
    private int puestosDeMerchandising;
    private static final double CONSUMICION_FIJA = 15000.0;

    public MiniEstadio(String nombre, String direccion, int puestosDeComida, int puestosDeMerchandising) {
        // Capacidad total: misma que Teatro = 650 (sumatoria de sectores)
        super(nombre, direccion, 650);
        this.puestosDeComida = puestosDeComida;
        this.puestosDeMerchandising = puestosDeMerchandising;
    }

    @Override
    public String getTipoSede() {
        return "MiniEstadio";
    }

    public int calcularPuestos() {
        return puestosDeComida + puestosDeMerchandising;
    }

    @Override
    public double calcularPrecioEntrada(double precioBase, String sector, int asiento) {
        // Precio según SedeConPlatea + valor fijo de consumición
        double precioSinConsumicion = super.calcularPrecioEntrada(precioBase, sector, asiento);
        return precioSinConsumicion + CONSUMICION_FIJA;
    }

    public double getValorConsumicion() {
        return CONSUMICION_FIJA;
    }
}
