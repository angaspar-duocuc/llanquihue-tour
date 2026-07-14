package model;

/**
 * Representa un vehiculo utilizado por la agencia.
 */
public class Vehiculo extends RecursoAgencia implements Registrable {
    private String patente;

    /**
     * Crea un vehiculo.
     *
     * @param nombre nombre o modelo del vehiculo
     * @param patente patente del vehiculo
     */
    public Vehiculo(String nombre, String patente) {
        super(nombre);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * Muestra los datos principales del vehiculo.
     *
     * @return resumen del vehiculo
     */
    @Override
    public String mostrarResumen() {
        return "Vehiculo: " + getNombre() + " | Patente: " + patente;
    }
}
