package FundamentalsExercise.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isTop = false;
        for (int i = 0; i <= array.length - 1; i++) {

            int number = array[i];

            if (i == array.length - 1) {
                System.out.print(number + " ");
                break;
            }
            for (int j = i + 1; j <= array.length - 1; j++) {

                int nextNumber = array[j];
                if (number > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }

            if (isTop) {
                System.out.print(number + " ");
            }
        }
    }
}