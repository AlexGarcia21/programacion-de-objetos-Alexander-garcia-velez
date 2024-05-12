package edu.alex.Evidencia_3.process;

import edu.alex.Evidencia_3.data.Player;
import edu.alex.Evidencia_3.ui.Languages;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * Gestiona la tabla de líderes para el juego, incluyendo la carga, actualización y almacenamiento
 * de la información de los jugadores en un archivo.
 */
public class PlayerLeaderboard {
    private static final String LEADERBOARD_FILE_PATH =
            "salon_de_la_fama.txt";
    private List<Player> leaderboard;
    /**
     * Constructor que inicializa la lista de jugadores en la tabla de líderes y carga los datos existentes
     * desde un archivo.
     */
    public PlayerLeaderboard() {
        leaderboard = new ArrayList<>();
        loadLeaderboard();
    }
    /**
     * Constructor que inicializa la lista de jugadores en la tabla de líderes y carga los datos existentes
     * desde un archivo.
     */
    public void addOrUpdatePlayer(Player player) {
        Player existingPlayer = leaderboard.stream()
                .filter(p -> p.getName().equalsIgnoreCase(player.getName()))
                .findFirst()
                .orElse(null);

        if (existingPlayer != null) {
            existingPlayer.setWins(existingPlayer.getWins() + player.getWins());
        } else {
            leaderboard.add(player);
        }

        leaderboard.sort(Comparator.comparingInt(Player::getWins).reversed());

        // Asegurar que solo los 5 mejores jugadores se mantengan en la tabla de líderes
        if (leaderboard.size() > 5) {
            leaderboard = leaderboard.subList(0, 5);
        }

        saveLeaderboard();
    }

    /**
     **Carga la tabla de líderes desde el archivo especificado por {@code LEADERBOARD_FILE_PATH}.
     * Si el archivo no se encuentra o hay un error durante la carga, se muestra un mensaje de error.
     */
    public void loadLeaderboard() {
        try (BufferedReader reader = new BufferedReader(new FileReader(LEADERBOARD_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    char symbol = parts[1].trim().charAt(0);
                    int wins = Integer.parseInt(parts[2].trim());
                    leaderboard.add(new Player(name, symbol, wins));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(Languages.ERROR_ARCHIVO_LIDERES);
        } catch (IOException e) {
            System.err.println(Languages.ERROR_CARGAR_LIDERES + e.getMessage());

        }
    }

    /**
     * Guarda la tabla de líderes actual en el archivo especificado por {@code LEADERBOARD_FILE_PATH}.
     *             * Si hay un error durante el guardado, se muestra un mensaje de error.
      */
    private void saveLeaderboard() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LEADERBOARD_FILE_PATH, false))) {
            for (Player player : leaderboard) {
                writer.println(player.getName() + "," + player.getSymbol() + "," + player.getWins());
            }
        } catch (IOException e) {
            System.err.println(Languages.ERROR_GUARDAR_LIDERES + e.getMessage());

        }
    }

    /**
     * Obtiene una copia de la lista de jugadores en la tabla de líderes.
     * @return Una lista de {@link Player} que representa la tabla de líderes actual.
     */
    public List<Player> getLeaderboard() {
        return new ArrayList<>(leaderboard); // Devuelve una copia para evitar manipulación externa
    }
}