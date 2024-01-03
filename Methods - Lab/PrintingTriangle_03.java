package FundamentalsLab.Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        triangle(number);
    }

    public static void triangle (int n) {

        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine (int startNum, int endNum) {
        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
