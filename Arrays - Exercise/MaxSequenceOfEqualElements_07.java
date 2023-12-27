package FundamentalsExercise.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).
                toArray();
        int length = 1;
        int maxLength = 0;
        int n = 0;

        for (int i = 1; i <= numbersArray.length - 1 ; i++) {

            if (numbersArray[i] == numbersArray[i - 1]) {
                length++;
            } else {
                length = 1;
            }

            if (length > maxLength) {
                maxLength = length;
                n = numbersArray[i];
            }
        }

        for (int i = maxLength; i >= 1; i--) {
            System.out.print(n + " ");
        }
    }
}
