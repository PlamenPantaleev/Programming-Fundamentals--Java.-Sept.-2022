package FundamentalsLab.TextProcessing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeText = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(removeText);
        while (index != -1) {

            if (text.contains(removeText)) {
               text = text.replace(removeText, "");
               index = text.indexOf(removeText);
            }
        }
        System.out.println(text);
    }
}
