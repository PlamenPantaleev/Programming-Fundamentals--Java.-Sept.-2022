package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = number; i >=number; i--) {
            int digit = number % 10;
            sum = sum + digit;

            number = number / 10;
            if (number == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
