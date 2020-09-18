package ru.karasev;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player {
    private String name;
    Set<String> words;

    public Player(String name) {
        this.name = name;
        this.words = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return this.words.stream()
                .mapToInt(String::length)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(words, player.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, words);
    }
}
