package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int numberOfLetters = 1; numberOfLetters <=n; numberOfLetters++) {
            char letter = scanner.nextLine().charAt(0);

            sum = sum + (int) letter;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
