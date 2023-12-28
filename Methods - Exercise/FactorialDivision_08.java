package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long factorialOne = printFactorial(num1);
        long factorialTwo = printFactorial2(num2);
        double dividedFactorial = factorialOne * 1.0 / factorialTwo;

        System.out.printf("%.2f", Math.abs(dividedFactorial));
    }
    public static long printFactorial (int num1) {
        long factorial = 1;

        for (int i = 1; i <= num1; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long printFactorial2 (int num2) {
        long factorial = 1;

        for (int i = 1; i <= num2; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
