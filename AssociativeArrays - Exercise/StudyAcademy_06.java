package FundamentalsExercise.AssociativeArraysExercise;

import java.util.*;

public class StudyAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(studentName)) {
                studentsMap.put(studentName, new ArrayList<>());

            }
            studentsMap.get(studentName).add(grade);
        }
        Map<String, Double> averageGrade = new LinkedHashMap<>();
        for (Map.Entry <String, List<Double>> entry : studentsMap.entrySet()) {
            List<Double> listGrades = entry.getValue();
            double average = getAverageGrade(listGrades);

            if (average >= 4.50) {
                averageGrade.put(entry.getKey(), average);
            }
        }
        averageGrade.entrySet().forEach(data -> System.out.printf("%s -> %.2f%n", data.getKey(), data.getValue()));
    }

    public static double getAverageGrade (List<Double> grade) {
        double sumGrades = 0;

        for (double element: grade) {
            sumGrades += element;
        }
        return sumGrades / grade.size();
    }
}
