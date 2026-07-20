package utils;

import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;
import model.OperadorTransporte;
import model.ProveedorAlojamiento;
import model.Registrable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Lee entidades desde un archivo de texto y las convierte en objetos. */
public class LectorEntidades {
    /**
     * Lee las lineas validas de un archivo y las convierte en entidades.
     *
     * @param ruta ubicacion del archivo de texto
     * @return lista de entidades obtenidas desde el archivo
     * @throws IOException si ocurre un error al leer el archivo
     * @throws DatoInvalidoException si una línea contiene datos inválidos
     */
    public List<Registrable> leer(String ruta) throws IOException {
        List<Registrable> entidades = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            int numeroLinea = 0;
            while ((linea = lector.readLine()) != null) {
                numeroLinea++;
                if (!linea.trim().isEmpty() && !linea.trim().startsWith("#")) {
                    entidades.add(convertirLinea(linea, numeroLinea));
                }
            }
        }
        return entidades;
    }

    /**
     * Convierte una línea con formato tipo;nombre;dato;calle;comuna en una entidad.
     *
     * @param linea línea que se debe convertir
     * @param numeroLinea posición de la línea dentro del archivo
     * @return entidad registrable construida con los datos de la línea
     * @throws DatoInvalidoException si el formato o el tipo no son válidos
     */
    private Registrable convertirLinea(String linea, int numeroLinea) {
        String[] datos = linea.split(";");
        if (datos.length != 5) {
            throw new DatoInvalidoException("Formato invalido en la linea " + numeroLinea + ".");
        }
        String tipo = datos[0].trim().toLowerCase();
        String nombre = datos[1].trim();
        String dato = datos[2].trim();
        Direccion direccion = new Direccion(datos[3], datos[4]);
        switch (tipo) {
            case "cliente":
                return new Cliente(nombre, dato, direccion);
            case "guia":
                return new GuiaTuristico(nombre, dato, direccion);
            case "operador":
                return new OperadorTransporte(nombre, dato, direccion);
            case "proveedor":
                return new ProveedorAlojamiento(nombre, dato, direccion);
            default:
                throw new DatoInvalidoException("Tipo desconocido en la linea " + numeroLinea + ".");
        }
    }
}
