package ru.karasev;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest {

    private static final PalindromeService palindromeService = new PalindromeService();
    @Test
    public void add() {
        Player playerActual = new Player("One");
        palindromeService.add(playerActual, "ava");

        Player playerExpected = new Player("One");
        playerExpected.words.add("ava");

        assertEquals(playerExpected.words, playerActual.words);
    }

    @Test
    public void add_wrong() {
        Player playerActual = new Player("One");
        palindromeService.add(playerActual, "avan");

        assert playerActual.words.isEmpty();
    }

    @Test
    public void add_same_word() {
        Player playerActual = new Player("One");
        palindromeService.add(playerActual, "ava");
        palindromeService.add(playerActual, "ava");

        assert playerActual.words.size() == 1;
    }
}