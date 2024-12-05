public class MostrarEstado {
    public static void mostrarEstado(String palabra, String letrasAdivinadas) {
        StringBuilder estado = XXX();
        for (char letra : XXX.toCharArray()) {
            if (XXX.indexOf(letra) >= 0) {
                estado.append(letra).append(" ");
            } else {
                estado.append("_ ");
            }
        }
        System.out.println("Estado actual: " + estado.toString());
    }
}
