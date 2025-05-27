package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String email;
    private String nombre;
    private String apellido;
    private String contrasenia;
    private List<Entrada> entradas;

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

    public void comprarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public List<IEntrada> listarEntradasFuturas() {
        List<IEntrada> futuras = new ArrayList<>();
        for (Entrada e : entradas) {
            if (e.esFutura()) {
                futuras.add(e);
            }
        }
        return futuras;
    }

    public List<IEntrada> listarTodasLasEntradas() {
        return new ArrayList<>(entradas); // copia como IEntrada
    }

    public boolean anularEntrada(String nombreEspectaculo, int codigoEntrada) {
        for (Entrada e : entradas) {
            if (e.getNombreEspectaculo().equals(nombreEspectaculo) && e.getCodigo() == codigoEntrada) {
                return e.anular();
            }
        }
        return false;
    }

    public void consultarValorEntrada(String nombreEspectaculo) {
        System.out.println("Consultar valor de entrada para " + nombreEspectaculo);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + email + ")";
    }
}
