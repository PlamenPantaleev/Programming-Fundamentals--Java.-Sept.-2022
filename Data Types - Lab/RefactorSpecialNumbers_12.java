package FundamentalsLab.DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean specialNumber = false;
        for (int currentNum = 1; currentNum <= number; currentNum++) {
            int n = currentNum;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            specialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            if (specialNumber) {
                System.out.printf("%d -> True%n", n);
            } else {
                System.out.printf("%d -> False%n", n);
            }
            sum = 0;
            currentNum = n;
        }

    }
}
