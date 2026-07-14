package model;

/**
 * Define el comportamiento comun de las entidades gestionadas por la agencia.
 */
public interface Registrable {

    /**
     * Obtiene un resumen de la entidad.
     *
     * @return resumen con los datos principales de la entidad
     */
    String mostrarResumen();
}
