package FundamentalsExercise.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();

        if (!printCharMessage(passwordInput)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!printLetterAndDigits(passwordInput)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!printDigitsCount(passwordInput)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (printCharMessage(passwordInput) && printLetterAndDigits(passwordInput) && printDigitsCount(passwordInput)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean printCharMessage (String password) {

        if (password.length() < 6 || password.length() > 10) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean printLetterAndDigits (String password) {
        boolean isCorrect = true;

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);

            if (symbol <= 47 || symbol >= 58 && symbol <= 64 || symbol >= 91 && symbol <= 96
            || symbol >= 123 && symbol <= 127) {
                isCorrect = false;
            }
        }
        if (!isCorrect) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean printDigitsCount (String password) {
        int digitCounter = 0;

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);

            if (symbol >= 48 && symbol <= 57) {
                digitCounter ++;
            }
        }
        if (digitCounter < 2) {
            return false;
        } else {
            return true;
        }
    }
}
