package service;

import model.Tour;

import java.util.ArrayList;
import java.util.List;

public class GestorTours {
    private List<Tour> tours;

    public GestorTours() {
        this.tours = new ArrayList<>();
    }

    public void agregar(Tour tour) {
        tours.add(tour);
    }

    public void listarTodos() {
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public List<Tour> buscarPorTipo(String tipo) {
        List<Tour> resultado = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(tour);
            }
        }
        return resultado;
    }

    public List<Tour> getTours() { return tours; }
    public void setTours(List<Tour> tours) { this.tours = tours; }
}
