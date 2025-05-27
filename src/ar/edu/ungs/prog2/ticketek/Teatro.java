package ar.edu.ungs.prog2.ticketek;

public class Teatro extends SedeConPlatea {

    public Teatro(String nombre, String direccion) {
        // La capacidad maxima total del teatro es la suma de los sectores
        super(nombre, direccion, 650);
    }

    @Override
    public String getTipoSede() {
        return "Teatro";
    }
}
