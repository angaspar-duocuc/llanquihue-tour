package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal de la aplicacion LlanquihueTourApp.
 * Carga tours desde un archivo, recorre la coleccion y aplica un filtro por tipo.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Tour> tours = gestorDatos.cargarTours("src/resources/tours.txt");

        System.out.println("=== Catalogo completo de tours ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println();
        System.out.println("=== Tours filtrados por tipo: Aventura ===");
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println(tour);
            }
        }
    }
}
