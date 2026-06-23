package data;

import model.Guia;
import model.Tour;
import util.Validador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine().trim();
                if (linea.isEmpty()) continue;

                String[] datos = linea.split(";");

                if (datos.length == 6) {
                    String nombre = datos[0].trim();
                    String tipo = datos[1].trim();
                    int precio = Integer.parseInt(datos[2].trim());
                    String idGuia = datos[3].trim();
                    String nombreGuia = datos[4].trim();
                    String especialidad = datos[5].trim();

                    if (Validador.esTextoValido(nombre) && Validador.esPrecioValido(precio)) {
                        Guia guia = new Guia(idGuia, nombreGuia, especialidad);
                        tours.add(new Tour(nombre, tipo, precio, guia));
                    }
                }
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo: " + rutaArchivo);
        } catch (NumberFormatException e) {
            System.out.println("Formato de precio invalido en el archivo.");
        }

        return tours;
    }
}
