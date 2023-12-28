package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printAllChars(symbol1, symbol2);
    }

    public static void printAllChars (char symbol1, char symbol2) {

        if (symbol2 > symbol1) {
            for (int i = (int) symbol1 + 1; i < (int) symbol2; i++) {

                char symbol = (char) i;
                System.out.print(symbol + " ");
            }
        } else {
            for (int i = (int) symbol2 + 1; i < (int) symbol1; i++) {

                char symbol = (char) i;
                System.out.print(symbol + " ");
            }
        }
    }
}
