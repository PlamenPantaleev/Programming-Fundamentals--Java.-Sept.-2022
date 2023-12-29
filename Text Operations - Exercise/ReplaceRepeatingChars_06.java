package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder inputString = new StringBuilder(input);


        for (int i = 0; i < inputString.length(); i++) {
            char symbol = inputString.charAt(i);
            if (i == inputString.length() - 1) {
                break;
            }
            if (inputString.charAt(i + 1) == symbol) {
                inputString.deleteCharAt(i + 1);
                i --;
            }


        }
        System.out.println(inputString);
    }
}
