package FundamentalsExercise.TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberOne = scanner.nextLine();
        int numberTwo = Integer.parseInt(scanner.nextLine());

        BigInteger firstNumber = new BigInteger(numberOne);

        BigInteger sum = firstNumber.multiply(BigInteger.valueOf(numberTwo));

        System.out.println(sum);

    }
}
