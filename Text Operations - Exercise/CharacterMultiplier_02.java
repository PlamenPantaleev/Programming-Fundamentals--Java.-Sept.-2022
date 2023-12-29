package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String [] wordsInput = scanner.nextLine().split(" ");

        int sum = 0;
        String firstWord = wordsInput[0];
        String secondWord = wordsInput[1];

        char [] wordOne = firstWord.toCharArray();
        char [] wordTwo = secondWord.toCharArray();

        if (firstWord.length() == secondWord.length()) {

            for (int i = 0; i < firstWord.length(); i++) {
                sum += wordOne[i] * wordTwo[i];
            }
        } else {
            if (firstWord.length() > secondWord.length()) {
                int startIndex = secondWord.length();
                for (int i = 0; i < secondWord.length(); i++) {
                    sum += wordOne[i] * wordTwo[i];
                }
                for (int i = startIndex; i < firstWord.length(); i++) {
                    sum += wordOne[i];
                }
            } else {
                int startIndex = firstWord.length();
                for (int i = 0; i < firstWord.length(); i++) {
                    sum += wordOne[i] * wordTwo[i];
                }
                for (int i = startIndex; i < secondWord.length(); i++) {
                    sum += wordTwo[i];
                }
            }
        }
        System.out.println(sum);
    }
}
