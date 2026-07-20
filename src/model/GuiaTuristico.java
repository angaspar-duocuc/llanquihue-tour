package model;

import utils.DatoInvalidoException;

/**
 * Representa a un guia turistico de la agencia.
 */
public class GuiaTuristico extends RecursoAgencia implements Registrable {
    private String idioma;

    /**
     * Crea un guia turistico.
     *
     * @param nombre nombre del guia
     * @param idioma idioma principal del guia
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public GuiaTuristico(String nombre, String idioma) {
        this(nombre, idioma, new Direccion("Sin informar", "Sin informar"));
    }

    /**
     * Crea un guia con una direccion asociada.
     *
     * @param nombre nombre del guia
     * @param idioma idioma principal
     * @param direccion direccion del guia
     * @throws DatoInvalidoException si algún dato obligatorio es inválido
     */
    public GuiaTuristico(String nombre, String idioma, Direccion direccion) {
        super(nombre, direccion);
        setIdioma(idioma);
    }

    /**
     * Obtiene el idioma principal.
     *
     * @return idioma del guia
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Modifica el idioma principal.
     *
     * @param idioma nuevo idioma
     * @throws DatoInvalidoException si el idioma es nulo o está vacío
     */
    public void setIdioma(String idioma) {
        if (idioma == null || idioma.trim().isEmpty()) {
            throw new DatoInvalidoException("El idioma no puede estar vacio.");
        }
        this.idioma = idioma.trim();
    }

    /**
     * Retorna el resumen del guia.
     *
     * @return datos del guia
     */
    @Override
    public String mostrarResumen() {
        return "Guia turistico: " + getNombre() + " | Idioma: " + idioma
                + " | Direccion: " + getDireccion();
    }

    /**
     * Retorna el guia como texto.
     *
     * @return resumen del guia
     */
    @Override
    public String toString() {
        return mostrarResumen();
    }
}
