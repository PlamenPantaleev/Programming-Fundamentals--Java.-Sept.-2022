package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    public static void printMatrix (int num) {

        for (int i = 1; i <= num; i++) {
            int [] numberArray = new int[num];

            for (int j = 0; j < num; j++) {
                numberArray[j] = num;
                System.out.print(numberArray[j] + " ");
            }
            System.out.println();
        }
    }
}
