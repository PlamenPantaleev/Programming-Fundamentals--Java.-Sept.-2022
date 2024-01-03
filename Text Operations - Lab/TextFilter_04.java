package FundamentalsLab.TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String element : bannedWords) {
            String currentWord = element;

            if (text.contains(currentWord)) {
                String replacement = repeatString("*", currentWord.length());
                text = text.replace(currentWord, replacement);
            }
        }
        System.out.println(text);
    }

    public static String repeatString (String symbol, int length) {
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i < length; i++) {
            replacement.append(symbol);
        }
        return replacement.toString();
    }
}
