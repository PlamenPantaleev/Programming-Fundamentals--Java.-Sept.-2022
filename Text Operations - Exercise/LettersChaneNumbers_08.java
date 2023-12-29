package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class LettersChaneNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String element: array) {
            sum += getSum(element);

        }
        System.out.printf("%.2f", sum);
    }

    private static double getSum(String element) {
        double sum = 0;

            char firstLetter = element.charAt(0);
            char secondLetter = element.charAt(element.length() - 1);
            double number = Double.parseDouble(element.replace(firstLetter, ' ')
                    .replace(secondLetter, ' ')
                    .trim());

            if (Character.isUpperCase(firstLetter)) {
                int position = firstLetter - 64;
                sum += number / position;
            } else {
                int position = firstLetter - 96;
                sum += number * position;
            }
            if (Character.isUpperCase(secondLetter)) {
                int position = secondLetter - 64;
                sum = sum - position;
            } else {
                int position = secondLetter - 96;
                sum = sum + position;
        }
            return sum;
    }
}
