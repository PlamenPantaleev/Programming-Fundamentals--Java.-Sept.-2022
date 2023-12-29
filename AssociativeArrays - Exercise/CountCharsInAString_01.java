package FundamentalsExercise.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        LinkedHashMap<Character, Integer> textMap = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (!textMap.containsKey(symbol)) {
                textMap.put(symbol, 1);
            } else {
                textMap.put(symbol, textMap.get(symbol) + 1);
            }
        }
        textMap.entrySet().forEach(entry -> System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue()));

    }
}
