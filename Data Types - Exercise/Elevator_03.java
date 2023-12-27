package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        int peopleElevated  = 0;

        int courses = 0;

        while (peopleElevated < numberOfPeople) {
            peopleElevated = peopleElevated + capacityOfElevator;
            courses++;

            if (peopleElevated >= numberOfPeople) {
                peopleElevated = numberOfPeople;
                break;
            }
        }
        System.out.println(courses);
    }
}
