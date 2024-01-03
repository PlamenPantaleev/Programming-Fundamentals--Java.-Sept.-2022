package FundamentalsLab.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String currentWord = array[i];
            int wordLength = currentWord.length();
            wordsList.add(repeat(currentWord, wordLength));
        }
        System.out.println(String.join("", wordsList));
    }

    public static String repeat (String s, int wordLength) {

        String [] wordArray = new String[wordLength];

        for (int i = 0; i < wordLength; i++) {
            wordArray[i] = s;
        }
        return String.join("", wordArray);
    }
}
