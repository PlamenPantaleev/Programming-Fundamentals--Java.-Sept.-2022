package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptedPassword_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(?<startSymbols>[\\S]+)\\>(?<digits>[\\d]{3})\\|(?<lowerCaseLetters>[a-z]{3})\\|(?<upperCaseLetters>[A-Z]{3})\\|(?<symbols>[^<>]{3})\\<\\1";
        for (int i = 0; i < n; i++) {
            String passwordInput = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(passwordInput);

            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();

                String digits = matcher.group("digits");
                sb.append(digits);
                String lowercaseLetter = matcher.group("lowerCaseLetters");
                sb.append(lowercaseLetter);
                String uppercaseLetter = matcher.group("upperCaseLetters");
                sb.append(uppercaseLetter);
                String symbols = matcher.group("symbols");
                sb.append(symbols);
                System.out.println("Password: " + sb);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
