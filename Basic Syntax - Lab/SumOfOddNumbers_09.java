package FundamentalsLab.BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= number * 2; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
                sum+= i;
            }
        }

        System.out.printf("Sum: %d", sum);
    }
}
