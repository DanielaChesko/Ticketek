package ar.edu.ungs.prog2.ticketek;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Entrada implements IEntrada {

    private int codigoEspectaculo;
    private String nombreEspectaculo;
    private String nombreSector;
    private int ubicacion; // numero de asiento (si aplica)
    private double precio;
    private String fecha; // en formato dd/mm/yyyy
    private String nombreUsuario;
    private String apellidoUsuario;
    private boolean anulada;

    public Entrada(int codigoEspectaculo, String nombreEspectaculo, String nombreSector, int ubicacion,
                   double precio, String fecha, String nombreUsuario, String apellidoUsuario) {
        this.codigoEspectaculo = codigoEspectaculo;
        this.nombreEspectaculo = nombreEspectaculo;
        this.nombreSector = nombreSector;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.fecha = fecha;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.anulada = false;
    }

    public int getCodigo() {
        return codigoEspectaculo;
    }

    public String getNombreEspectaculo() {
        return nombreEspectaculo;
    }

    public String getFecha() {
        return fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esFutura() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaFuncion = LocalDate.parse(fecha, formatter);
        return !fechaFuncion.isBefore(LocalDate.now());
    }

    public boolean anular() {
        if (!anulada) {
            anulada = true;
            return true;
        }
        return false;
    }

    public boolean estaAnulada() {
        return anulada;
    }

    @Override
    public String toString() {
        return "Entrada para " + nombreEspectaculo +
                " (" + fecha + "), Sector: " + nombreSector +
                ", Asiento: " + ubicacion +
                ", Precio: $" + precio +
                ", Comprador: " + nombreUsuario + " " + apellidoUsuario +
                (anulada ? " [ANULADA]" : "");
    }

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String ubicacion() {
		// TODO Auto-generated method stub
		return null;
	}
}
