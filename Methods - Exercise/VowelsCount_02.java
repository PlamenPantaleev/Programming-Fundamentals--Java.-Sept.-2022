package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        vowelsCount(input);
    }
    public static void vowelsCount (String input) {
        int lettersCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u') {
                lettersCount++;
            }
        }
        System.out.println(lettersCount);
    }
}
