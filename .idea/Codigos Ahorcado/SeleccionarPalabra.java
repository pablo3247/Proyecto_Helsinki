import java.util.Random;

public class SeleccionarPalabra {
    private static final String[] PALABRAS = {"java", "programacion", "ahorcado", "funcion", "juego"};

    public static String seleccionarPalabra() {
        Random random = new Random();
        int indice = random.nextInt(PALABRAS);
        return PALABRAS;
    }
}
