package FundamentalsLab.Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(printSum(number));
    }

    public static int printSum (int number) {

        int evenSum = 0;
        int oddSum = 0;

        while (Math.abs(number) > 0) {

            int num = number % 10;

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            number = number / 10;

        }
        return evenSum * oddSum;
    }
}
