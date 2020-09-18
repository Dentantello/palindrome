package ru.karasev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticsServiceTest {

    private static final PalindromeService palindromeService = new PalindromeService();
    private static final StatisticsService statisticService = new StatisticsService();

    @Test
    public void printStatisticsTable() {
        Player one = new Player("One");
        Player two = new Player("Two");
        Player three = new Player("Three");
        Player four = new Player("Four");
        Player five = new Player("Five");
        Player six = new Player("Six");

        palindromeService.add(one, "ava");
        palindromeService.add(one, "ava");

        palindromeService.add(two, "ava");
        palindromeService.add(two, "avava");

        palindromeService.add(three, "а роза упала на лапу Азора");

        palindromeService.add(four, "ava");

        palindromeService.add(five, "avava");

        palindromeService.add(six, "топот");


        List<Player> players = new ArrayList<>();
        players.add(one);
        players.add(two);
        players.add(three);
        players.add(four);
        players.add(five);
        players.add(six);

        statisticService.printStatisticsTable(players);
    }
}