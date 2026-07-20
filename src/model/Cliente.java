package model;

import utils.DatoInvalidoException;

/** Representa a un cliente de la agencia. */
public class Cliente extends RecursoAgencia implements Registrable {
    private String correo;

    /**
     * Crea un cliente sin dirección informada.
     *
     * @param nombre nombre del cliente
     * @param correo correo del cliente
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public Cliente(String nombre, String correo) {
        this(nombre, correo, new Direccion("Sin informar", "Sin informar"));
    }

    /**
     * Crea un cliente con su dirección.
     *
     * @param nombre nombre del cliente
     * @param correo correo del cliente
     * @param direccion dirección asociada al cliente
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public Cliente(String nombre, String correo, Direccion direccion) {
        super(nombre, direccion);
        setCorreo(correo);
    }

    /**
     * Obtiene el correo del cliente.
     *
     * @return correo del cliente
     */
    public String getCorreo() { return correo; }

    /**
     * Modifica el correo del cliente.
     *
     * @param correo nuevo correo
     * @throws DatoInvalidoException si el correo es nulo o está vacío
     */
    public void setCorreo(String correo) {
        if (correo == null || correo.trim().isEmpty()) {
            throw new DatoInvalidoException("El correo no puede estar vacio.");
        }
        this.correo = correo.trim();
    }

    /**
     * Retorna un resumen de los datos del cliente.
     *
     * @return nombre, correo y dirección del cliente
     */
    @Override
    public String mostrarResumen() {
        return "Cliente: " + getNombre() + " | Correo: " + correo
                + " | Direccion: " + getDireccion();
    }

    /**
     * Retorna el cliente como texto.
     *
     * @return resumen del cliente
     */
    @Override
    public String toString() { return mostrarResumen(); }
}
