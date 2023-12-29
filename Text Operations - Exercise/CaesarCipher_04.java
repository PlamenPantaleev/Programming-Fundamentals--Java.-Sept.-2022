package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        for (int i = 0; i < textInput.length(); i++) {
            char [] textInLetters = textInput.toCharArray();

            System.out.print((char)(textInLetters[i] + 3));
        }


    }
}
