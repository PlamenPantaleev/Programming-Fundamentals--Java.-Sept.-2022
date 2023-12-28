package FundamentalsExercise.ObjectsAndClassesExercise.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());


        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= numberOfStudents; i++) {
            String [] currentStudent = scanner.nextLine().split(" ");

            Student student = new Student(currentStudent[0], currentStudent[1], Double.parseDouble(currentStudent[2]));

            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student item: studentList) {
            System.out.printf("%s %s: %.2f%n", item.getFirstName(), item.getLastName(), item.getGrade());
        }
    }
}
