package ru.karasev;

import java.util.Comparator;
import java.util.List;

public class StatisticsService {

    private int getScore(Player player) {
        return player.getScore();
    }

    private int getNumberOfWords(Player player) {
        return player.words.size();
    }

    private String getPlayerName(Player player) {
        return player.getName();
    }

    private List<Player> sortPlayers(List<Player> players) {
        players.sort(Comparator.comparingInt(Player::getScore).reversed());
        return players;
    }

    void printStatisticsTable(List<Player> players) {
        sortPlayers(players);

        if (players.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println("\nPlayer: " + getPlayerName(players.get(i))
                        + "\nWords: " + getNumberOfWords(players.get(i))
                        + "\nScore: " + getScore(players.get(i)));
            }
        } else {
            for (Player player : players) {
                System.out.println("\nPlayer: " + getPlayerName(player)
                        + "\nWords: " + getNumberOfWords(player)
                        + "\nScore: " + getScore(player));
            }
        }
    }
}
