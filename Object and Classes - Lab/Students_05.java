package FundamentalsLab.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student (String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while (!command.equals("end")) {
            String [] commandArray = command.split(" ");

            Student studentInfo = new Student(commandArray[0], commandArray[1],
                    Integer.parseInt(commandArray[2]), commandArray[3]);

            studentsList.add(studentInfo);

            command = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Student item: studentsList) {
            if (item.getHomeTown().equals(town)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
