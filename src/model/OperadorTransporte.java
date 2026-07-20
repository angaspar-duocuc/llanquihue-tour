package model;

import utils.DatoInvalidoException;

/** Representa a un operador de transporte asociado a la agencia. */
public class OperadorTransporte extends RecursoAgencia implements Registrable {
    private String tipoTransporte;

    /**
     * Crea un operador sin dirección informada.
     *
     * @param nombre nombre del operador
     * @param tipoTransporte transporte ofrecido
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public OperadorTransporte(String nombre, String tipoTransporte) {
        this(nombre, tipoTransporte, new Direccion("Sin informar", "Sin informar"));
    }

    /**
     * Crea un operador con su dirección.
     *
     * @param nombre nombre del operador
     * @param tipoTransporte transporte ofrecido
     * @param direccion dirección asociada al operador
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public OperadorTransporte(String nombre, String tipoTransporte, Direccion direccion) {
        super(nombre, direccion);
        setTipoTransporte(tipoTransporte);
    }

    /**
     * Obtiene el tipo de transporte ofrecido.
     *
     * @return tipo de transporte
     */
    public String getTipoTransporte() { return tipoTransporte; }

    /**
     * Modifica el tipo de transporte ofrecido.
     *
     * @param tipoTransporte nuevo tipo de transporte
     * @throws DatoInvalidoException si el tipo es nulo o está vacío
     */
    public void setTipoTransporte(String tipoTransporte) {
        if (tipoTransporte == null || tipoTransporte.trim().isEmpty()) {
            throw new DatoInvalidoException("El tipo de transporte no puede estar vacio.");
        }
        this.tipoTransporte = tipoTransporte.trim();
    }

    /**
     * Retorna un resumen de los datos del operador.
     *
     * @return nombre, transporte y dirección del operador
     */
    @Override
    public String mostrarResumen() {
        return "Operador de transporte: " + getNombre() + " | Transporte: " + tipoTransporte
                + " | Direccion: " + getDireccion();
    }

    /**
     * Retorna el operador como texto.
     *
     * @return resumen del operador
     */
    @Override
    public String toString() { return mostrarResumen(); }
}
