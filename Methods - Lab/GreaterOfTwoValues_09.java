package FundamentalsLab.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        if (command.equals("int")) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.println(printInt(command, num1, num2));
        } else if (command.equals("char")) {
            char symbolOne = scanner.nextLine().charAt(0);
            char symbolTwo = scanner.nextLine().charAt(0);

            System.out.println(printChar(command, symbolOne, symbolTwo));

        } else if (command.equals("string")) {
            String textOne = scanner.nextLine();
            String textTwo = scanner.nextLine();

            System.out.println(printString(command, textOne, textTwo));
        }
    }

    public static int printInt (String command, int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static char printChar (String command, char symbolOne, char symbolTwo) {

        if (symbolOne > symbolTwo) {
            return symbolOne;
        } else {
            return symbolTwo;
        }
    }

    public static String printString (String command, String textOne, String textTwo) {

        if (textOne.compareTo(textTwo) >= 0) {
            return textOne;
        } else {
            return textTwo;
        }
    }
}
