package FundamentalsExercise.ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int [] people = new int[wagons];
        int totalPeople = 0;

        for (int i = 0; i < wagons; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            totalPeople += currentNum;
            people[i] = currentNum;

            System.out.print(people[i] + " ");
        }
        System.out.println();
        System.out.println(totalPeople);
    }
}
