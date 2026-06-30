package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase principal de LlanquihueTourApp para la actividad de Semana 6.
 * Ejecuta la creacion de servicios turisticos y muestra sus datos por consola.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        GestorServicios gestorServicios = new GestorServicios();
        ServicioTuristico[] servicios = gestorServicios.crearServiciosDePrueba();

        System.out.println("=== Servicios turisticos Llanquihue Tour ===");
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
        }
    }
}
