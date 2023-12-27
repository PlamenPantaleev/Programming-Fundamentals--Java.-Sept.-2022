package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ASCIIStart = Integer.parseInt(scanner.nextLine());
        int ASCIIFinish = Integer.parseInt(scanner.nextLine());

        for (int i = ASCIIStart; i <= ASCIIFinish; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
