package FundamentalsLab.Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        numInput(numberInput);
    }

    public static void numInput (int num) {

        if (num > 0 ) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0 ) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }

    }

}
