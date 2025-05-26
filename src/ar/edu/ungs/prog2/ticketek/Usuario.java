package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String email; // nombreDeUsuario
    private String nombre;
    private String apellido;
    private String contrasenia;
    private List<IEntrada> entradas;

    public Usuario(String email, String nombre, String apellido, String contrasenia) {
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.entradas = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean autenticar(String contraseniaIngresada) {
        return this.contrasenia.equals(contraseniaIngresada);
    }

    public void comprarEntrada(IEntrada entrada) {
        entradas.add(entrada);
    }

    public List<IEntrada> listarEntradasFuturas() {
        List<IEntrada> futuras = new ArrayList<>();
        for (IEntrada e : entradas) {
            if (e.esFutura()) { // este método se define en la clase Entrada
                futuras.add(e);
            }
        }
        return futuras;
    }

    public List<IEntrada> listarTodasLasEntradas() {
        return new ArrayList<>(entradas); // copia para evitar modificación externa
    }

    public boolean anularEntrada(String nombreEspectaculo, int codigoEntrada) {
        for (IEntrada e : entradas) {
            if (e.getNombreEspectaculo().equals(nombreEspectaculo) && e.getCodigo() == codigoEntrada) {
                return e.anular(); // asumimos que `Entrada` tiene un método anular()
            }
        }
        return false;
    }


    public void consultarValorEntrada(String nombreEspectaculo) {
        // este método probablemente también debería estar en Ticketek, ya que tiene acceso
        // a todas las funciones y sedes
        System.out.println("Consultar valor de entrada para " + nombreEspectaculo);
        // se mostrarán las sedes y precios (Ticketek puede proveer esa información)
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + email + ")";
    }
}
