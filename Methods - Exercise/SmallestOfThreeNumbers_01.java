package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(printSmallestNumber(num1, num2, num3));
    }

    public static int printSmallestNumber (int num1, int num2, int num3) {
        int smallestNumber = 0;

        if (num1 < num2 && num1 < num3) {
            smallestNumber = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallestNumber = num2;
        } else if (num3 < num1 && num3 < num2) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }
}
