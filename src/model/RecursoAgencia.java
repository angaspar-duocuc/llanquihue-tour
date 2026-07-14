package model;

/**
 * Superclase que contiene la informacion comun de los recursos de la agencia.
 */
public class RecursoAgencia {
    private String nombre;

    /**
     * Crea un recurso de la agencia.
     *
     * @param nombre nombre del recurso
     */
    public RecursoAgencia(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del recurso.
     *
     * @return nombre del recurso
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del recurso.
     *
     * @param nombre nuevo nombre del recurso
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
