

public class Main {
    public static void main(String[] args) {
        String palabra = SeleccionarPalabra.seleccionarPalabra();
        StringBuilder letrasAdivinadas = new StringBuilder();
        StringBuilder letrasUsadas = new StringBuilder();
        int intentos = 7;

        while (intentos > 0 && !JuegoCompletado.juegoCompletado(palabra, letrasAdivinadas.toString())) {
            MostrarEstado.mostrarEstado(palabra, letrasAdivinadas.toString());

            char letra = AdivinarLetra.adivinarLetra(letrasUsadas.toString());
            letrasUsadas.append(letra);

            if (!VerificarLetra.verificarLetra(palabra, letra, letrasAdivinadas)) {
                intentos--;
                DibujarAhorcado.dibujar(intentos);
                System.out.println("Letra incorrecta. Intentos restantes: " + intentos);
            }

            if (JuegoCompletado.juegoCompletado(palabra, letrasAdivinadas.toString())) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                break;
            }
        }

        if (intentos == 0) {
            System.out.println("Has perdido. La palabra era: " + palabra);
            DibujarAhorcado.dibujar(0); // Mostrar el ahorcado completo al final
        }
    }
}