package FundamentalsExercise.AssociativeArraysExercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> courseInformation = new LinkedHashMap<>();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" : ");
            String courseName = commandArray[0];
            String studentName = commandArray[1];

            if (!courseInformation.containsKey(courseName)) {
                courseInformation.put(courseName, new ArrayList<>());
                courseInformation.get(courseName).add(studentName);
            } else {
                courseInformation.get(courseName).add(studentName);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseInformation.entrySet()) {
            int counter = entry.getValue().size();
            System.out.printf("%s: %d%n",entry.getKey(), counter);
            for (int i = 0; i < counter; i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
