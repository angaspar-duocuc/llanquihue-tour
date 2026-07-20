package ui;

import data.GestorEntidades;
import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;
import model.OperadorTransporte;
import model.ProveedorAlojamiento;
import utils.DatoInvalidoException;

import javax.swing.JOptionPane;
import java.io.IOException;

/** Interfaz gráfica básica para gestionar las entidades de la agencia. */
public class VentanaPrincipal {
    private GestorEntidades gestorEntidades;

    /**
     * Crea la ventana, inicializa el gestor y carga los datos del archivo externo.
     */
    public VentanaPrincipal() {
        gestorEntidades = new GestorEntidades();
        cargarDatosIniciales();
    }

    /** Muestra el menú principal hasta que el usuario selecciona salir. */
    public void iniciar() {
        int opcion;
        do {
            String menu = "Llanquihue Tour\n"
                    + "1. Ingresar cliente\n"
                    + "2. Ingresar guia turistico\n"
                    + "3. Ingresar operador de transporte\n"
                    + "4. Ingresar proveedor de alojamiento\n"
                    + "5. Mostrar entidades\n"
                    + "6. Buscar entidad por nombre\n"
                    + "7. Filtrar entidades por tipo\n"
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
     * Ejecuta la acción asociada a una opción del menú.
     *
     * @param opcion número seleccionado por el usuario
     */
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ingresarCliente();
                break;
            case 2:
                ingresarGuia();
                break;
            case 3:
                ingresarOperador();
                break;
            case 4:
                ingresarProveedor();
                break;
            case 5:
                mostrarEntidades();
                break;
            case 6:
                buscarEntidad();
                break;
            case 7:
                filtrarEntidades();
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }

    /** Solicita los datos de un cliente y lo agrega si son válidos. */
    private void ingresarCliente() {
        String nombre = solicitarDato("Nombre del cliente:", "El nombre no puede estar vacio.");
        if (nombre == null) return;
        String correo = solicitarDato("Correo del cliente:", "El correo no puede estar vacio.");
        if (correo == null) return;
        Direccion direccion = solicitarDireccion();
        if (direccion == null) return;
        try {
            gestorEntidades.agregarEntidad(new Cliente(nombre, correo, direccion));
            JOptionPane.showMessageDialog(null, "Cliente registrado.");
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /** Solicita los datos de un guía turístico y lo agrega si son válidos. */
    private void ingresarGuia() {
        String nombre = solicitarDato("Nombre del guia:", "El nombre no puede estar vacio.");
        if (nombre == null) return;
        String idioma = solicitarDato("Idioma principal:", "El idioma no puede estar vacio.");
        if (idioma == null) return;
        Direccion direccion = solicitarDireccion();
        if (direccion == null) return;
        try {
            gestorEntidades.agregarEntidad(new GuiaTuristico(nombre, idioma, direccion));
            JOptionPane.showMessageDialog(null, "Guia turistico registrado.");
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /** Solicita los datos de un operador de transporte y lo agrega si son válidos. */
    private void ingresarOperador() {
        String nombre = solicitarDato("Nombre del operador:", "El nombre no puede estar vacio.");
        if (nombre == null) return;
        String transporte = solicitarDato("Tipo de transporte:", "El transporte no puede estar vacio.");
        if (transporte == null) return;
        Direccion direccion = solicitarDireccion();
        if (direccion == null) return;
        try {
            gestorEntidades.agregarEntidad(new OperadorTransporte(nombre, transporte, direccion));
            JOptionPane.showMessageDialog(null, "Operador de transporte registrado.");
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /** Solicita los datos de un proveedor de alojamiento y lo agrega si son válidos. */
    private void ingresarProveedor() {
        String nombre = solicitarDato("Nombre del proveedor:", "El nombre no puede estar vacio.");
        if (nombre == null) return;
        String alojamiento = solicitarDato("Tipo de alojamiento:",
                "El alojamiento no puede estar vacio.");
        if (alojamiento == null) return;
        Direccion direccion = solicitarDireccion();
        if (direccion == null) return;
        try {
            gestorEntidades.agregarEntidad(new ProveedorAlojamiento(nombre, alojamiento, direccion));
            JOptionPane.showMessageDialog(null, "Proveedor de alojamiento registrado.");
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * Solicita un dato obligatorio y controla campos vacíos y cancelaciones.
     *
     * @param mensaje texto mostrado al solicitar el dato
     * @param mensajeVacio advertencia mostrada si el dato queda vacío
     * @return dato sin espacios externos o {@code null} si se cancela o es inválido
     */
    private String solicitarDato(String mensaje, String mensajeVacio) {
        String dato = JOptionPane.showInputDialog(mensaje);
        if (dato == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return null;
        }
        if (dato.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, mensajeVacio);
            return null;
        }
        return dato.trim();
    }

    /**
     * Solicita la calle y comuna de una entidad.
     *
     * @return dirección válida o {@code null} si la operación no se completa
     */
    private Direccion solicitarDireccion() {
        String calle = solicitarDato("Calle y numero:", "La calle no puede estar vacia.");
        if (calle == null) return null;
        String comuna = solicitarDato("Comuna:", "La comuna no puede estar vacia.");
        if (comuna == null) return null;
        try {
            return new Direccion(calle, comuna);
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    /** Muestra todas las entidades almacenadas por el gestor. */
    private void mostrarEntidades() {
        JOptionPane.showMessageDialog(null, gestorEntidades.mostrarEntidades(),
                "Entidades registradas", JOptionPane.INFORMATION_MESSAGE);
    }

    /** Solicita un nombre y muestra el resultado de la búsqueda. */
    private void buscarEntidad() {
        String nombre = solicitarDato("Nombre exacto de la entidad:", "El nombre no puede estar vacio.");
        if (nombre == null) return;
        JOptionPane.showMessageDialog(null, gestorEntidades.buscarPorNombre(nombre),
                "Resultado de busqueda", JOptionPane.INFORMATION_MESSAGE);
    }

    /** Solicita una categoría y muestra las entidades que coinciden con ella. */
    private void filtrarEntidades() {
        String tipo = solicitarDato("Tipo: cliente, guia, operador o proveedor:",
                "El tipo no puede estar vacio.");
        if (tipo == null) return;
        JOptionPane.showMessageDialog(null, gestorEntidades.filtrarPorTipo(tipo),
                "Entidades filtradas", JOptionPane.INFORMATION_MESSAGE);
    }

    /** Carga al iniciar las entidades definidas en el archivo de datos. */
    private void cargarDatosIniciales() {
        try {
            gestorEntidades.cargarDesdeArchivo("src/data/entidades.txt");
        } catch (IOException | DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null,
                    "No fue posible cargar el archivo de datos: " + e.getMessage());
        }
    }
}
