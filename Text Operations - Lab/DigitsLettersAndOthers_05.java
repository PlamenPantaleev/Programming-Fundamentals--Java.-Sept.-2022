package FundamentalsLab.TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol >= '1' && currentSymbol <= '9') {
                digits.append(currentSymbol);
            } else if (currentSymbol >= 'a' && currentSymbol <= 'z' ||
            currentSymbol >= 'A' && currentSymbol <= 'Z') {
                letters.append(currentSymbol);
            } else {
                others.append(currentSymbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());
    }
}
