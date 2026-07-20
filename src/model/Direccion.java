package model;

import utils.DatoInvalidoException;

/**
 * Representa la direccion asociada a un recurso de la agencia.
 */
public class Direccion {
    private String calle;
    private String comuna;

    /**
     * Crea una direccion con calle y comuna.
     *
     * @param calle calle de la direccion
     * @param comuna comuna de la direccion
     * @throws DatoInvalidoException si la calle o comuna son inválidas
     */
    public Direccion(String calle, String comuna) {
        setCalle(calle);
        setComuna(comuna);
    }

    /**
     * Obtiene la calle.
     *
     * @return calle de la direccion
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica la calle.
     *
     * @param calle nueva calle
     * @throws DatoInvalidoException si la calle es nula o está vacía
     */
    public void setCalle(String calle) {
        validarTexto(calle, "La calle no puede estar vacia.");
        this.calle = calle.trim();
    }

    /**
     * Obtiene la comuna.
     *
     * @return comuna de la direccion
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Modifica la comuna.
     *
     * @param comuna nueva comuna
     * @throws DatoInvalidoException si la comuna es nula o está vacía
     */
    public void setComuna(String comuna) {
        validarTexto(comuna, "La comuna no puede estar vacia.");
        this.comuna = comuna.trim();
    }

    /**
     * Valida que un texto contenga informacion.
     *
     * @param valor texto que se valida
     * @param mensaje mensaje de la excepcion
     * @throws DatoInvalidoException si el texto es nulo o está vacío
     */
    private void validarTexto(String valor, String mensaje) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new DatoInvalidoException(mensaje);
        }
    }

    /**
     * Retorna la direccion como texto.
     *
     * @return calle y comuna
     */
    @Override
    public String toString() {
        return calle + ", " + comuna;
    }
}
