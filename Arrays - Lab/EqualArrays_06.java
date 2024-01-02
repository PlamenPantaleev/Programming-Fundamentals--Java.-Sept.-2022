package FundamentalsLab.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int diff = 0;
        boolean isDiff = false;
        int sum  = 0;

        for (int i = 0; i <firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                isDiff = true;
                diff = i;
                break;
            }
        }

        if (isDiff) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diff);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
