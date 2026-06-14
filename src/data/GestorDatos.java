package data;

import model.Tour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Gestiona la lectura de datos desde archivos de texto.
 * Convierte cada linea valida del archivo en un objeto Tour.
 */
public class GestorDatos {

    /**
     * Lee un archivo separado por punto y coma y carga sus datos en un ArrayList.
     * El formato esperado por linea es: nombre;tipo;precio
     *
     * @param rutaArchivo ruta del archivo tours.txt
     * @return lista de tours cargados desde el archivo
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    Tour tour = new Tour(nombre, tipo, precio);
                    tours.add(tour);
                }
            }

            lector.close();
        } catch (FileNotFoundException error) {
            System.out.println("No se encontro el archivo: " + rutaArchivo);
        } catch (NumberFormatException error) {
            System.out.println("Existe un precio con formato invalido en el archivo.");
        }

        return tours;
    }
}
