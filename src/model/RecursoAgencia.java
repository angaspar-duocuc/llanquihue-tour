package model;

import utils.DatoInvalidoException;

/**
 * Superclase que contiene la informacion comun de los recursos de la agencia.
 */
public class RecursoAgencia {
    private String nombre;
    private Direccion direccion;

    /**
     * Crea un recurso de la agencia.
     *
     * @param nombre nombre del recurso
     * @throws DatoInvalidoException si el nombre es inválido
     */
    public RecursoAgencia(String nombre) {
        this(nombre, new Direccion("Sin informar", "Sin informar"));
    }

    /**
     * Crea un recurso con nombre y direccion.
     *
     * @param nombre nombre del recurso
     * @param direccion direccion asociada al recurso
     * @throws DatoInvalidoException si el nombre o la dirección son inválidos
     */
    public RecursoAgencia(String nombre, Direccion direccion) {
        setNombre(nombre);
        setDireccion(direccion);
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
     * @throws DatoInvalidoException si el nombre es nulo o está vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatoInvalidoException("El nombre no puede estar vacio.");
        }
        this.nombre = nombre.trim();
    }

    /**
     * Obtiene la direccion del recurso.
     *
     * @return direccion asociada
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la direccion del recurso.
     *
     * @param direccion nueva direccion
     * @throws DatoInvalidoException si la dirección es nula
     */
    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new DatoInvalidoException("La direccion es obligatoria.");
        }
        this.direccion = direccion;
    }

    /**
     * Retorna los datos comunes del recurso.
     *
     * @return nombre y direccion
     */
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", direccion=" + direccion;
    }
}
