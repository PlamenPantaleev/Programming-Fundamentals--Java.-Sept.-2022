package FundamentalsLab.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr[i] % 2 == 0) {
                sum+= numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
