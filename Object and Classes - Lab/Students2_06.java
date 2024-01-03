package FundamentalsLab.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_06 {
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
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge () {
            return this.age;
        }

        public String getHomeTown () {
            return this.homeTown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!command.equals("end")) {
            String [] studentInfo = command.split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            int age = Integer.parseInt(studentInfo[2]);
            String homeTown =  studentInfo[3];

            if (isStudentExisting(studentList, firstName, lastName)) {
                Student studentData = getStudent(studentList, firstName, lastName);
                studentData.setFirstName(firstName);
                studentData.setLastName(lastName);
                studentData.setAge(age);
                studentData.setHomeTown(homeTown);

            } else {
                Student studentData =
                        new Student(firstName, lastName, age, homeTown);
                studentList.add(studentData);
            }

            command = scanner.nextLine();
        }

        String townInput = scanner.nextLine();

        for (Student item: studentList) {
            if (item.getHomeTown().equals(townInput)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }

    public static boolean isStudentExisting (List<Student> studentList, String firstName, String lastName) {
        for (Student item : studentList) {
            if (item.getFirstName().equals(firstName) &&
                    item.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Student getStudent (List<Student> studentList, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student item: studentList) {
            if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                existingStudent = item;
            }
        }
        return existingStudent;
    }
}
