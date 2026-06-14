package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 * Cada objeto se construye desde una linea del archivo tours.txt.
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int precio;

    /**
     * Crea un tour con nombre, tipo y precio.
     *
     * @param nombre nombre del tour
     * @param tipo categoria o tipo del tour
     * @param precio precio del tour en pesos chilenos
     */
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del tour.
     *
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del tour.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo del tour.
     *
     * @return tipo del tour
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Modifica el tipo del tour.
     *
     * @param tipo nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el precio del tour.
     *
     * @return precio del tour
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del tour.
     *
     * @param precio nuevo precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Retorna una descripcion legible del tour.
     *
     * @return texto con los datos del tour
     */
    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
