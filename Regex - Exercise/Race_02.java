package FundamentalsExercise.RegexExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String namesInput = scanner.nextLine();
        String input = scanner.nextLine();

        List<String> namesList = Arrays.stream(namesInput.split(", ")).collect(Collectors.toList());

        Map<String, Integer> names = new LinkedHashMap<>();
        namesList.forEach(name -> names.put(name, 0));


        while (!input.equals("end of race")) {

            String nameRegex = "[A-Za-z]+";
            String digitsRegex = "[0-9]";

            Pattern namePattern = Pattern.compile(nameRegex);
            Pattern digitsPattern = Pattern.compile(digitsRegex);

            StringBuilder name = new StringBuilder();
            Matcher nameMatcher = namePattern.matcher(input);

            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }

            int digits = 0;
            Matcher digitsMatcher = digitsPattern.matcher(input);

            while (digitsMatcher.find()) {
                digits += Integer.parseInt(digitsMatcher.group());
            }

            if (namesList.contains(name.toString())) {
                int currentKms = names.get(name.toString());
                names.put(name.toString(), currentKms + digits);
            }
            input = scanner.nextLine();
        }
        List<String> top3Names = names.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", top3Names.get(0));
        System.out.printf("2nd place: %s%n", top3Names.get(1));
        System.out.printf("3rd place: %s%n", top3Names.get(2));
    }
}
