package model;

/**
 * Superclase que representa la informacion comun de un servicio turistico
 * ofrecido por la agencia Llanquihue Tour.
 */
public class ServicioTuristico {
    private String nombre;
    private double duracionHoras;

    /**
     * Crea un servicio turistico con nombre y duracion.
     *
     * @param nombre nombre del servicio turistico
     * @param duracionHoras duracion estimada del servicio en horas
     */
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    /**
     * Obtiene el nombre del servicio.
     *
     * @return nombre del servicio turistico
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del servicio.
     *
     * @param nombre nuevo nombre del servicio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la duracion del servicio.
     *
     * @return duracion del servicio en horas
     */
    public double getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * Modifica la duracion del servicio.
     *
     * @param duracionHoras nueva duracion del servicio en horas
     */
    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    /**
     * Muestra la informacion comun del servicio turistico.
     * Este metodo es sobrescrito por las subclases para aplicar polimorfismo.
     *
     * @return informacion del servicio turistico
     */
    public String mostrarInformacion() {
        return "ServicioTuristico{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                '}';
    }

    /**
     * Retorna la informacion del servicio turistico.
     *
     * @return descripcion del servicio turistico
     */
    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
