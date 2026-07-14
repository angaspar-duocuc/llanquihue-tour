package model;

/**
 * Representa a un colaborador externo de la agencia.
 */
public class ColaboradorExterno extends RecursoAgencia implements Registrable {
    private String especialidad;

    /**
     * Crea un colaborador externo.
     *
     * @param nombre nombre del colaborador
     * @param especialidad especialidad del colaborador
     */
    public ColaboradorExterno(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Muestra los datos principales del colaborador externo.
     *
     * @return resumen del colaborador
     */
    @Override
    public String mostrarResumen() {
        return "Colaborador externo: " + getNombre() + " | Especialidad: " + especialidad;
    }
}
