package FundamentalsExercise.ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] firstArray = new String[n];
        String [] secondArray = new String[n];

        for (int i = 1; i <= n; i++) {
            String [] array = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArray[i -1] = array[1];
                secondArray[i - 1] = array[0];

            } else {
                firstArray[i - 1] = array[0];
                secondArray[i - 1] = array[1];
            }
        }

        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
