package ar.edu.ungs.prog2.ticketek;

public abstract class SedeConPlatea extends Sede {

	//utilizo final (variables constantes) para poder utilizar case de switch
    public static final String PLATEA_VIP = "Platea VIP";
    public static final String PLATEA_COMUN = "Platea Comun";
    public static final String PLATEA_BAJA = "Platea Baja";
    public static final String PLATEA_ALTA = "Platea Alta";

    // Capacidad total por sector
    private final int capacidadVip = 200;
    private final int capacidadComun = 300;
    private final int capacidadBaja = 100;
    private final int capacidadAlta = 50;

    // Aumento sobre precio base por sector
    private final double aumentoVip = 0.70;
    private final double aumentoComun = 0.40;
    private final double aumentoBaja = 0.50;
    private final double aumentoAlta = 0.0;

    // Asientos por fila por sector (extraído del enunciado)
    private final int asientosPorFilaVip = 20;
    private final int asientosPorFilaComun = 25;
    private final int asientosPorFilaBaja = 25;
    private final int asientosPorFilaAlta = 25;

    public SedeConPlatea(String nombre, String direccion, int capacidadMaxima) {
        super(nombre, direccion, capacidadMaxima);
    }

    public boolean asientoValido(String sector, int asiento) {
        switch (sector) {
            case PLATEA_VIP:
                return asiento >= 1 && asiento <= capacidadVip;
            case PLATEA_COMUN:
                return asiento >= 1 && asiento <= capacidadComun;
            case PLATEA_BAJA:
                return asiento >= 1 && asiento <= capacidadBaja;
            case PLATEA_ALTA:
                return asiento >= 1 && asiento <= capacidadAlta;
            default:
                return false;
        }
    }

    @Override
    public double calcularPrecioEntrada(double precioBase, String sector, int asiento) {
        if (!asientoValido(sector, asiento)) {
            throw new IllegalArgumentException("Asiento fuera de rango o sector inválido.");
        }

        switch (sector) {
            case PLATEA_VIP:
                return precioBase * (precioBase + aumentoVip);
            case PLATEA_COMUN:
                return precioBase * (precioBase + aumentoComun);
            case PLATEA_BAJA:
                return precioBase * (precioBase + aumentoBaja);
            case PLATEA_ALTA:
                return precioBase * (precioBase + aumentoAlta);
            default:
                throw new IllegalArgumentException("Sector inválido");
        }
    }

    public int asientosPorFila(String sector) {
        switch (sector) {
            case PLATEA_VIP:
                return asientosPorFilaVip;
            case PLATEA_COMUN:
                return asientosPorFilaComun;
            case PLATEA_BAJA:
                return asientosPorFilaBaja;
            case PLATEA_ALTA:
                return asientosPorFilaAlta;
            default:
                throw new IllegalArgumentException("Sector inválido");
        }
    }

    public int capacidadSector(String sector) {
        switch (sector) {
            case PLATEA_VIP:
                return capacidadVip;
            case PLATEA_COMUN:
                return capacidadComun;
            case PLATEA_BAJA:
                return capacidadBaja;
            case PLATEA_ALTA:
                return capacidadAlta;
            default:
                throw new IllegalArgumentException("Sector inválido");
        }
    }
}
