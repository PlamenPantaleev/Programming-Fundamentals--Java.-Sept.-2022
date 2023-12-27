package FundamentalsExercise.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbersArray.length - 1; i++) {
            int currentNum = numbersArray[i];

            for (int j = i + 1; j <= numbersArray.length - 1; j++) {
                int nextNum = numbersArray[j];
                if (currentNum + nextNum == sum ) {
                    System.out.println(currentNum + " " + nextNum);
                }
            }
        }
    }
}
