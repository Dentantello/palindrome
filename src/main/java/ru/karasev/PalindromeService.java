package ru.karasev;

public class PalindromeService {

    private String correctInput(String input) {
        return input.toLowerCase().replaceAll("[^A-Za-zА-Яа-я]", "");
    }

    private boolean isPalindrome(String correctedWord) {
        if (correctedWord != null && correctedWord.length() > 2) {
            return  correctedWord.equals(new StringBuilder(correctedWord).reverse().toString());
        }
        return false;
    }

    void add(Player player, String word) {
        if (isPalindrome(correctInput(word))) {
            player.words.add(word);
        } else {
            System.out.println(word + " - not a palindrome");
        }
    }
}
