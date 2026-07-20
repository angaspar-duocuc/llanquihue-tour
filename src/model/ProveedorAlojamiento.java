package model;

import utils.DatoInvalidoException;

/** Representa a un proveedor de alojamiento asociado a la agencia. */
public class ProveedorAlojamiento extends RecursoAgencia implements Registrable {
    private String tipoAlojamiento;

    /**
     * Crea un proveedor sin dirección informada.
     *
     * @param nombre nombre del proveedor
     * @param tipoAlojamiento alojamiento ofrecido
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public ProveedorAlojamiento(String nombre, String tipoAlojamiento) {
        this(nombre, tipoAlojamiento, new Direccion("Sin informar", "Sin informar"));
    }

    /**
     * Crea un proveedor con su dirección.
     *
     * @param nombre nombre del proveedor
     * @param tipoAlojamiento alojamiento ofrecido
     * @param direccion dirección asociada al proveedor
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public ProveedorAlojamiento(String nombre, String tipoAlojamiento, Direccion direccion) {
        super(nombre, direccion);
        setTipoAlojamiento(tipoAlojamiento);
    }

    /**
     * Obtiene el tipo de alojamiento ofrecido.
     *
     * @return tipo de alojamiento
     */
    public String getTipoAlojamiento() { return tipoAlojamiento; }

    /**
     * Modifica el tipo de alojamiento ofrecido.
     *
     * @param tipoAlojamiento nuevo tipo de alojamiento
     * @throws DatoInvalidoException si el tipo es nulo o está vacío
     */
    public void setTipoAlojamiento(String tipoAlojamiento) {
        if (tipoAlojamiento == null || tipoAlojamiento.trim().isEmpty()) {
            throw new DatoInvalidoException("El tipo de alojamiento no puede estar vacio.");
        }
        this.tipoAlojamiento = tipoAlojamiento.trim();
    }

    /**
     * Retorna un resumen de los datos del proveedor.
     *
     * @return nombre, alojamiento y dirección del proveedor
     */
    @Override
    public String mostrarResumen() {
        return "Proveedor de alojamiento: " + getNombre() + " | Alojamiento: " + tipoAlojamiento
                + " | Direccion: " + getDireccion();
    }

    /**
     * Retorna el proveedor como texto.
     *
     * @return resumen del proveedor
     */
    @Override
    public String toString() { return mostrarResumen(); }
}
