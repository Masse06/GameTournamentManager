import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Tournament.loadPlayersFromFile();
        menu();
    }

    public static void menu() {
        int option = -1;
        while (option != 0) {
            System.out.println("Menu\n" +
                    "\n1. Agregar un nuevo jugador." +
                    "\n2. Enfrentar jugadores." +
                    "\n3. Mostrar el ranking." +
                    "\n0. Salir del programa.");

                    option = sc.nextInt();
                    sc.nextLine();

                    switch(option) {
                        case 1 -> Tournament.addPlayer();
                        case 2 -> Tournament.facePlayers();
                        case 3 -> Tournament.showRanking();
                        case 0 -> System.out.println("Saliendo del programa...");
                        default -> System.out.println("Opción no válida, intenta de nuevo.");
                    }
        }
    }
}