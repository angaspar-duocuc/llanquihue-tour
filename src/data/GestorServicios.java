package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de crear instancias de prueba para la jerarquia de servicios turisticos.
 */
public class GestorServicios {

    /**
     * Crea servicios turisticos de prueba para mostrar la herencia simple.
     * Se crean dos objetos de cada subclase solicitada.
     *
     * @return arreglo con servicios turisticos de prueba
     */
    public ServicioTuristico[] crearServiciosDePrueba() {
        return new ServicioTuristico[] {
                new RutaGastronomica("Ruta sabores del lago", 3.5, 4),
                new RutaGastronomica("Experiencia cocina local", 4.0, 5),
                new PaseoLacustre("Paseo por lago Llanquihue", 2.0, "Lancha turistica"),
                new PaseoLacustre("Navegacion atardecer", 1.5, "Catamaran"),
                new ExcursionCultural("Recorrido patrimonial Llanquihue", 2.5, "Museo local"),
                new ExcursionCultural("Historia colonos del sur", 3.0, "Casa historica")
        };
    }
}
