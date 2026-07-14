package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

/**
 * Gestiona una coleccion generica de entidades registrables.
 */
public class GestorEntidades {
    private ArrayList<Registrable> entidades;

    /**
     * Crea un gestor con una coleccion vacia.
     */
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    /**
     * Agrega una entidad a la coleccion.
     *
     * @param entidad entidad que implementa Registrable
     */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    /**
     * Recorre la coleccion, muestra cada resumen y diferencia el tipo con instanceof.
     *
     * @return texto con todas las entidades registradas
     */
    public String mostrarEntidades() {
        if (entidades.isEmpty()) {
            return "No hay entidades registradas.";
        }

        String resumen = "";
        for (Registrable entidad : entidades) {
            resumen += entidad.mostrarResumen() + "\n";

            if (entidad instanceof GuiaTuristico) {
                resumen += "Tipo detectado: guia turistico.\n\n";
            } else if (entidad instanceof Vehiculo) {
                resumen += "Tipo detectado: vehiculo.\n\n";
            } else if (entidad instanceof ColaboradorExterno) {
                resumen += "Tipo detectado: colaborador externo.\n\n";
            }
        }
        return resumen;
    }
}
