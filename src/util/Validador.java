package util;

public class Validador {

    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean esPrecioValido(int precio) {
        return precio > 0;
    }
}
