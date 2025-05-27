package ar.edu.ungs.prog2.ticketek;

public class Teatro extends SedeConPlatea {

    public Teatro(String nombre, String direccion) {
        // La capacidad máxima total del teatro es la suma de los sectores
        // 200 + 300 + 100 + 50 = 650
        super(nombre, direccion, 650);
    }

    @Override
    public String getTipoSede() {
        return "Teatro";
    }
}
