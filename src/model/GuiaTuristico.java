package model;

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
     */
    public GuiaTuristico(String nombre, String idioma) {
        super(nombre);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Muestra los datos principales del guia turistico.
     *
     * @return resumen del guia
     */
    @Override
    public String mostrarResumen() {
        return "Guia turistico: " + getNombre() + " | Idioma: " + idioma;
    }
}
