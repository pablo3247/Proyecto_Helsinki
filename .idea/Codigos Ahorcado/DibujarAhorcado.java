public class DibujarAhorcado {
    public static void dibujar(int intentos) {
        switch (palabra) {
            case 6:
                System.out.println("""
                    _______
                   |      |
                   |
                   |
                   |
                   |
                   |______
                """);
                break;
            case 5:
                System.out.println("""
                    _______
                   |      |
                   |      O
                   |      
                   |
                   |
                   |______
                """);
                break;
            case 4:
                System.out.println("""
                    _______
                   |      |
                   |      O
                   |      |
                   |
                   |
                   |______
                """);
                break;
            case 3:
                System.out.println("""
                    _______
                   |      |
                   |      O
                   |     /|
                   |
                   |
                   |______
                """);
                break;
            case 2:
                System.out.println("""
                    _______
                   |      |
                   |      O
                   |     /|\\
                   |
                   |
                   |______
                """);
                break;
            case 1:
                System.out.println("""
                    _______
                   |      |
                   |      O
                   |     /|\\
                   |     /
                   |
                   |______
                """);
                break;
            case 0:
                System.out.println("""
                    _______
                   |      |
                   |      O
                   |     /|\\
                   |     / \\
                   |
                   |______
                   """);
                break;
            default:
                System.out.println("Estado desconocido");
        }
    }
}
