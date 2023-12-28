package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sum(num1, num2);
        int subtractedSum = subtract(sumOfNumbers, num3);

        System.out.println(subtractedSum);
    }

    public static int sum (int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract (int num1, int num2) {
        return num1 - num2;
    }
}
