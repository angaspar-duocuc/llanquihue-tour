package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar una coleccion polimorfica de servicios turisticos.
 */
public class GestorServicios {
    private List<ServicioTuristico> servicios;

    /**
     * Crea el gestor e inicializa la coleccion polimorfica de servicios.
     */
    public GestorServicios() {
        this.servicios = new ArrayList<>();
        cargarServiciosDePrueba();
    }

    /**
     * Carga servicios turisticos de prueba combinando distintas subclases.
     */
    private void cargarServiciosDePrueba() {
        servicios.add(new RutaGastronomica("Ruta sabores del lago", 3.5, 4));
        servicios.add(new RutaGastronomica("Experiencia cocina local", 4.0, 5));
        servicios.add(new PaseoLacustre("Paseo por lago Llanquihue", 2.0, "Lancha turistica"));
        servicios.add(new PaseoLacustre("Navegacion atardecer", 1.5, "Catamaran"));
        servicios.add(new ExcursionCultural("Recorrido patrimonial Llanquihue", 2.5, "Museo local"));
        servicios.add(new ExcursionCultural("Historia colonos del sur", 3.0, "Casa historica"));
    }

    /**
     * Obtiene la coleccion polimorfica de servicios turisticos.
     *
     * @return lista de servicios turisticos
     */
    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }

    /**
     * Recorre la coleccion e imprime la informacion usando polimorfismo.
     */
    public void mostrarServicios() {
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio.mostrarInformacion());
        }
    }
}
