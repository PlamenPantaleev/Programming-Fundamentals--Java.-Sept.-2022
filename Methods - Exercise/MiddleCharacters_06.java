package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacters(input);
    }

    public static void printMiddleCharacters (String input) {

        if (input.length() % 2 == 0) {
            char symbol1 = input.charAt(input.length() / 2 - 1);
            char symbol2 = input.charAt(input.length() / 2);
            System.out.printf("%c%c", symbol1, symbol2);
        } else {
            char symbol1 = input.charAt(input.length() / 2);
            System.out.printf("%c", symbol1);
        }


    }
}
