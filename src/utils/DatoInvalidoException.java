package utils;

/**
 * Excepcion personalizada para datos vacios o con formato incorrecto.
 */
public class DatoInvalidoException extends IllegalArgumentException {

    /**
     * Crea la excepcion con un mensaje explicativo.
     *
     * @param mensaje descripcion del dato invalido
     */
    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
