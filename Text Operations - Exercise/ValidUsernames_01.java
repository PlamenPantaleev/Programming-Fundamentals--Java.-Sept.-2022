package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] usernamesInput = scanner.nextLine().split(", ");

        for (int i = 0; i < usernamesInput.length; i++) {
            String currentUsername = usernamesInput[i];

            if (isValid(currentUsername)) {
                System.out.println(currentUsername);
            }

        }
    }

    public static boolean isValid (String username) {

        if (username.length() >= 3 && username.length() <= 16) {
            char [] word = username.toCharArray();

            boolean valid = false;
            for (char element: word) {
                if (element >= 'A' && element <= 'Z' || element >= 'a' && element <= 'z' ||
                element >= 48 && element <= 57 || element == 45 || element == 95) {
                    valid = true;
                } else {
                    valid = false;
                    break;
                }
            }
            return valid;
        }
        return false;
    }
}
