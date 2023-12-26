package FundamentalsExercise.BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int startingNumber = number;
        int sumFact = 0;

        while (number > 0 ) {
            int lastNumber = number % 10;

            int fact = 1;

            for (int i = 1; i <= lastNumber; i++) {
                fact = fact * i;
            }
            sumFact+= fact;
            number = number / 10;
        }

        if (sumFact == startingNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
