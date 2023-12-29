package FundamentalsExercise.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUnuExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Integer> studentsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languagesMap = new LinkedHashMap<>();


        while (!command.equals("exam finished")) {
            String [] infoArray = command.split("-");
            String name = infoArray[0];
            if (command.contains("banned")) {
                studentsMap.remove(name);

            } else {
                String language = infoArray[1];
                int score = Integer.parseInt(infoArray[2]);
                if (!studentsMap.containsKey(name)) {
                    studentsMap.put(name, score);
                } else {
                    if (studentsMap.get(name) < score) {
                        studentsMap.put(name, score);
                    }
                }
                if (!languagesMap.containsKey(language)) {
                    languagesMap.put(language, 1);
                } else {
                    languagesMap.put(language, languagesMap.get(language) + 1);
                }
            }


            command = scanner.nextLine();
        }
        System.out.println("Results:");
        studentsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        languagesMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
