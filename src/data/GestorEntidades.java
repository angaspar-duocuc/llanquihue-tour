package data;

import model.Cliente;
import model.GuiaTuristico;
import model.OperadorTransporte;
import model.ProveedorAlojamiento;
import model.Registrable;
import utils.LectorEntidades;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Gestiona la coleccion generica de entidades registrables. */
public class GestorEntidades {
    private ArrayList<Registrable> entidades;

    /** Crea un gestor con una coleccion vacia. */
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    /**
     * Agrega una entidad registrable a la coleccion.
     *
     * @param entidad entidad que se desea agregar
     */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    /**
     * Carga entidades desde un archivo de texto.
     *
     * @param ruta ubicacion del archivo que contiene las entidades
     * @return cantidad de entidades cargadas
     * @throws IOException si ocurre un error al leer el archivo
     */
    public int cargarDesdeArchivo(String ruta) throws IOException {
        LectorEntidades lector = new LectorEntidades();
        List<Registrable> cargadas = lector.leer(ruta);
        entidades.addAll(cargadas);
        return cargadas.size();
    }

    /**
     * Busca una entidad utilizando su nombre.
     *
     * @param nombre nombre que se desea buscar
     * @return resumen de la entidad encontrada o mensaje informativo
     */
    public String buscarPorNombre(String nombre) {
        for (Registrable entidad : entidades) {
            if (entidad.getNombre().equalsIgnoreCase(nombre.trim())) {
                return entidad.mostrarResumen();
            }
        }
        return "No se encontro una entidad con ese nombre.";
    }

    /**
     * Filtra las entidades según la categoría indicada.
     *
     * @param tipo categoría: cliente, guia, operador o proveedor
     * @return resúmenes coincidentes o un mensaje si no existen resultados
     */
    public String filtrarPorTipo(String tipo) {
        StringBuilder resultado = new StringBuilder();
        for (Registrable entidad : entidades) {
            boolean coincide = (tipo.equalsIgnoreCase("cliente") && entidad instanceof Cliente)
                    || (tipo.equalsIgnoreCase("guia") && entidad instanceof GuiaTuristico)
                    || (tipo.equalsIgnoreCase("operador") && entidad instanceof OperadorTransporte)
                    || (tipo.equalsIgnoreCase("proveedor") && entidad instanceof ProveedorAlojamiento);
            if (coincide) {
                resultado.append(entidad.mostrarResumen()).append("\n");
            }
        }
        return resultado.length() == 0 ? "No hay entidades del tipo indicado." : resultado.toString();
    }

    /**
     * Recorre polimórficamente la colección y diferencia sus cuatro categorías.
     *
     * @return resúmenes y tipos detectados, o un mensaje si la colección está vacía
     */
    public String mostrarEntidades() {
        if (entidades.isEmpty()) {
            return "No hay entidades registradas.";
        }
        StringBuilder resumen = new StringBuilder();
        for (Registrable entidad : entidades) {
            resumen.append(entidad.mostrarResumen()).append("\n");
            if (entidad instanceof Cliente) {
                resumen.append("Tipo detectado: cliente.\n\n");
            } else if (entidad instanceof GuiaTuristico) {
                resumen.append("Tipo detectado: guia turistico.\n\n");
            } else if (entidad instanceof OperadorTransporte) {
                resumen.append("Tipo detectado: operador de transporte.\n\n");
            } else if (entidad instanceof ProveedorAlojamiento) {
                resumen.append("Tipo detectado: proveedor de alojamiento.\n\n");
            }
        }
        return resumen.toString();
    }
}
