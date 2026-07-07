package model;

/**
 * Subclase que representa un paseo lacustre.
 * Hereda nombre y duracion desde ServicioTuristico y agrega tipo de embarcacion.
 */
public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    /**
     * Crea un paseo lacustre.
     *
     * @param nombre nombre del paseo
     * @param duracionHoras duracion estimada en horas
     * @param tipoEmbarcacion tipo de embarcacion utilizada
     */
    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Obtiene el tipo de embarcacion.
     *
     * @return tipo de embarcacion
     */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    /**
     * Modifica el tipo de embarcacion.
     *
     * @param tipoEmbarcacion nuevo tipo de embarcacion
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Muestra la informacion especifica del paseo lacustre.
     *
     * @return informacion completa del paseo lacustre
     */
    @Override
    public String mostrarInformacion() {
        return "PaseoLacustre{" +
                "nombre='" + getNombre() + '\'' +
                ", duracionHoras=" + getDuracionHoras() +
                ", tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }

    /**
     * Retorna la informacion completa del paseo lacustre.
     *
     * @return descripcion del paseo lacustre
     */
    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
