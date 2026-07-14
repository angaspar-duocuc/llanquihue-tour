package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

/**
 * Interfaz grafica basica para ingresar y visualizar entidades de la agencia.
 */
public class VentanaPrincipal {
    private GestorEntidades gestorEntidades;

    /**
     * Crea la interfaz con su gestor de entidades.
     */
    public VentanaPrincipal() {
        gestorEntidades = new GestorEntidades();
    }

    /**
     * Muestra el menu principal y procesa las opciones seleccionadas.
     */
    public void iniciar() {
        int opcion;
        do {
            String menu = "Llanquihue Tour\n"
                    + "1. Ingresar guia turistico\n"
                    + "2. Ingresar vehiculo\n"
                    + "3. Ingresar colaborador externo\n"
                    + "4. Mostrar entidades\n"
                    + "0. Salir";

            String entrada = JOptionPane.showInputDialog(null, menu, "Gestion de entidades",
                    JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                opcion = 0;
            } else {
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = -1;
                }
            }

            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    /**
     * Ejecuta la accion correspondiente a una opcion del menu.
     *
     * @param opcion opcion ingresada por el usuario
     */
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ingresarGuia();
                break;
            case 2:
                ingresarVehiculo();
                break;
            case 3:
                ingresarColaborador();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, gestorEntidades.mostrarEntidades(),
                        "Entidades registradas", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }

    private void ingresarGuia() {
        String nombre = JOptionPane.showInputDialog("Nombre del guia:");
        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio.");
            return;
        }

        String idioma = JOptionPane.showInputDialog("Idioma principal:");
        if (idioma == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        if (idioma.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El idioma no puede estar vacio.");
            return;
        }

        gestorEntidades.agregarEntidad(new GuiaTuristico(nombre, idioma));
        JOptionPane.showMessageDialog(null, "Guia turistico registrado.");
    }

    private void ingresarVehiculo() {
        String nombre = JOptionPane.showInputDialog("Nombre o modelo del vehiculo:");
        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre o modelo no puede estar vacio.");
            return;
        }

        String patente = JOptionPane.showInputDialog("Patente del vehiculo:");
        if (patente == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        if (patente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La patente no puede estar vacia.");
            return;
        }

        gestorEntidades.agregarEntidad(new Vehiculo(nombre, patente));
        JOptionPane.showMessageDialog(null, "Vehiculo registrado.");
    }

    private void ingresarColaborador() {
        String nombre = JOptionPane.showInputDialog("Nombre del colaborador:");
        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio.");
            return;
        }

        String especialidad = JOptionPane.showInputDialog("Especialidad:");
        if (especialidad == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }
        if (especialidad.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La especialidad no puede estar vacia.");
            return;
        }

        gestorEntidades.agregarEntidad(new ColaboradorExterno(nombre, especialidad));
        JOptionPane.showMessageDialog(null, "Colaborador externo registrado.");
    }
}
