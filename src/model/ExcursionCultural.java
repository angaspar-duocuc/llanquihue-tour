package model;

/**
 * Subclase que representa una excursion cultural.
 * Hereda nombre y duracion desde ServicioTuristico y agrega el lugar historico visitado.
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    /**
     * Crea una excursion cultural.
     *
     * @param nombre nombre de la excursion
     * @param duracionHoras duracion estimada en horas
     * @param lugarHistorico lugar historico asociado al recorrido
     */
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Obtiene el lugar historico.
     *
     * @return lugar historico visitado
     */
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    /**
     * Modifica el lugar historico.
     *
     * @param lugarHistorico nuevo lugar historico
     */
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Retorna la informacion completa de la excursion cultural.
     *
     * @return descripcion de la excursion cultural
     */
    @Override
    public String toString() {
        return "ExcursionCultural{" + super.toString() +
                ", lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }
}
