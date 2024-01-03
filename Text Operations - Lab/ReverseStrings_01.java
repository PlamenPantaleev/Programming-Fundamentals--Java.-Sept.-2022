package FundamentalsLab.TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            char [] word = command.toCharArray();
            StringBuilder newWord = new StringBuilder();

            for (int i = word.length - 1; i >= 0; i--) {
                newWord.append(word[i]);
            }
            System.out.printf("%s = %s%n", command, newWord);
            command = scanner.nextLine();
        }
    }
}
