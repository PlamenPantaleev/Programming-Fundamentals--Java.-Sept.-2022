package FundamentalsLab.RegexLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<day>\\d{2})(?<separator>[\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            int day = Integer.parseInt(matcher.group("day"));
            String month = matcher.group("month");
            int year = Integer.parseInt(matcher.group("year"));

            System.out.printf("Day: %d, Month: %s, Year: %d%n", day, month, year);
        }
    }
}
