package model;

/**
 * Subclase que representa una ruta gastronomica de Llanquihue Tour.
 * Hereda nombre y duracion desde ServicioTuristico y agrega numero de paradas.
 */
public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    /**
     * Crea una ruta gastronomica.
     *
     * @param nombre nombre de la ruta
     * @param duracionHoras duracion estimada en horas
     * @param numeroDeParadas cantidad de paradas gastronomicas
     */
    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Obtiene la cantidad de paradas.
     *
     * @return numero de paradas gastronomicas
     */
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    /**
     * Modifica la cantidad de paradas.
     *
     * @param numeroDeParadas nueva cantidad de paradas
     */
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Muestra la informacion especifica de la ruta gastronomica.
     *
     * @return informacion completa de la ruta gastronomica
     */
    @Override
    public String mostrarInformacion() {
        return "RutaGastronomica{" +
                "nombre='" + getNombre() + '\'' +
                ", duracionHoras=" + getDuracionHoras() +
                ", numeroDeParadas=" + numeroDeParadas +
                '}';
    }

    /**
     * Retorna la informacion completa de la ruta gastronomica.
     *
     * @return descripcion de la ruta gastronomica
     */
    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
