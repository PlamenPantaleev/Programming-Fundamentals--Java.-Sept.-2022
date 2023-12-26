package FundamentalsExercise.BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int colognes = 1; colognes <= rows; colognes++) {
                System.out.print(current + " ");

            }
            current++;
            System.out.println();

        }
    }
}
