package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class Explosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int explosionPower = 0;
        StringBuilder text = new StringBuilder(input);

        for (int position = 0; position < text.length(); position++) {
            char symbol = text.charAt(position);

            if (symbol == '>') {
                explosionPower += Integer.parseInt(String.valueOf(text.charAt(position + 1)));
                text.deleteCharAt(position + 1);
                explosionPower --;
            } else if (symbol != '>' && explosionPower > 0) {
                text.deleteCharAt(position);
                explosionPower --;
                position --;
            }
        }
        System.out.println(text);
    }
}
