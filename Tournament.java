import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    private static ArrayList<Player> players = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void loadPlayersFromFile() {
        try (Scanner fileScanner = new Scanner(new File("./assets/files/players.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(", ");
                if (data.length == 5) { // Validar formato correcto
                    String nameTag = data[0];
                    String name = data[1];
                    String surName = data[2];
                    int level = Integer.parseInt(data[3].replace("Nivel: ", ""));
                    int points = Integer.parseInt(data[4].replace("Puntos: ", ""));
                    players.add(new Player(nameTag, name, surName, level, points));
                }
            }
        } catch (IOException e) {
            // "No se encontraron jugadores previos o hubo un error al leer el archivo."
        }
        sortPlayers(players);
    }

    public static void addPlayer() {
        System.out.println("¿Cuántos jugadores deseas añadir?");
        int numPlayerToAdd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numPlayerToAdd; i++) {
            System.out.println("Ingrese el nombre de usuario: ");
            String nameTag = sc.nextLine();
            System.out.println("Ingrese su nombre: ");
            String name = sc.nextLine();
            System.out.println("Ingrese sus apellidos: ");
            String surName = sc.nextLine();
            players.add(new Player(nameTag, name, surName, 1, 0));
        }

        sortPlayers(players);

        try (FileWriter writer = new FileWriter("./assets/files/players.txt")) {
            for (Player player : players) {
                writer.write(player.toString() + "\n");
            }
            System.out.println("Nuevos jugadores añadidos!");
        } catch (IOException e) {
            System.out.println("Error al guardar al usuario");
        }
    }

    public static void sortPlayers(ArrayList<Player> players) {
        players.sort((p1, p2) -> {
            if (p1.getLevel() != p2.getLevel()) {
                return Integer.compare(p2.getLevel(), p1.getLevel());
            } else {
                return Integer.compare(p2.getPoints(), p1.getPoints());
            }
        });
    }

    public static void facePlayers() {
        System.out.println("Proximamente...");
    }

    public static void showRanking() {
        System.out.println("Ranking de Jugadores:\n");
        for (Player player : players) {
            System.out.println("Nombre: " + player.getNameTag() + " Nivel: " + player.getLevel());
        }
    }
}