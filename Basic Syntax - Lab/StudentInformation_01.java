package FundamentalsLab.BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());

        String information = String.format("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);

        System.out.println(information);
    }
}
