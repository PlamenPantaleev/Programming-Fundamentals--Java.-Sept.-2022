package FundamentalsLab.Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        printText(input, count);
    }

    public static void printText (String input, int count) {
        String [] newText = new String[count];

        for (int i = 0; i < count; i++) {
            newText[i] = input;
        }

        for (int i = 0; i < newText.length; i++) {
            System.out.print(newText[i]);
        }
    }
}
