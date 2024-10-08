import java.util.Scanner;

public class PiedraPapelTijera {
}
public static String obtenerOpcionComputadora() {
    String[] opciones = {"piedra", "papel", "tijera"};
    Random random = new Random();
    int indice = random.nextInt(3); // Genera un número entre 0 y 2
    return opciones[indice];
}
public static String determinarGanador(String jugador, String computadora) {
    if (jugador.equals(computadora)) {
        return "Empate";
    }

switch (jugador) {
    case "piedra":
        return (computadora.equals("tijera")) ? "Jugador gana" : "Computadora gana";
        case "papel":
        return (computadora.equals("piedra")) ? "Jugador gana" : "Computadora gana";
        case "tijera":
        return (computadora.equals("papel")) ? "Jugador gana" : "Computadora gana";
default:
        return "Opción no válida";
        }
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String jugador;
    String computadora;
    String resultado;

    System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");

    while (true) {
        System.out.print("Escribe tu jugada (piedra, papel, tijera o 'salir' para terminar): ");
        jugador = scanner.nextLine().toLowerCase();

        if (jugador.equals("salir")) {
            System.out.println("¡Gracias por jugar!");
            break;
        }

        computadora = obtenerOpcionComputadora();
        System.out.println("La computadora eligió: " + computadora);

        resultado = determinarGanador(jugador, computadora);
        System.out.println("Resultado: " + resultado);
    }

    scanner.close();
}
