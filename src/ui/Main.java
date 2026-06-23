package ui;

import data.GestorDatos;
import model.Tour;
import service.GestorTours;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== LLANQUIHUE TOUR - Sistema de Gestion ===\n");

        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Tour> toursLeidos = gestorDatos.cargarTours("src/resources/tours.txt");

        GestorTours gestorTours = new GestorTours();
        for (Tour t : toursLeidos) {
            gestorTours.agregar(t);
        }

        System.out.println("--- Catalogo completo ---");
        gestorTours.listarTodos();

        System.out.println("\n--- Tours de tipo: Aventura ---");
        List<Tour> aventura = gestorTours.buscarPorTipo("Aventura");
        if (aventura.isEmpty()) {
            System.out.println("No se encontraron tours de tipo Aventura.");
        } else {
            for (Tour t : aventura) {
                System.out.println(t);
            }
        }

        System.out.println("\n--- Tours de tipo: Cultural ---");
        List<Tour> cultural = gestorTours.buscarPorTipo("Cultural");
        if (cultural.isEmpty()) {
            System.out.println("No se encontraron tours de tipo Cultural.");
        } else {
            for (Tour t : cultural) {
                System.out.println(t);
            }
        }
    }
}
