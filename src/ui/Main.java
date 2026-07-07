package ui;

import data.GestorServicios;

/**
 * Clase principal de LlanquihueTourApp para la actividad de Semana 7.
 * Ejecuta el recorrido polimorfico de servicios turisticos.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        GestorServicios gestorServicios = new GestorServicios();

        System.out.println("=== Servicios turisticos Llanquihue Tour ===");
        gestorServicios.mostrarServicios();
    }
}
