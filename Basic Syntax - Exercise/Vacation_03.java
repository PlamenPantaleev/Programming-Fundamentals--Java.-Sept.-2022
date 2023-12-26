package FundamentalsExercise.BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (day.equals("Friday")) {
            if (groupType.equals("Students")) {
                price = numberOfPeople * 8.45;
                if (numberOfPeople >= 30) {
                    price = price - (price * 0.15);
                }
            } else if (groupType.equals("Business")) {
                if (numberOfPeople >= 100) {
                    numberOfPeople = numberOfPeople - 10;
                }
                price = numberOfPeople * 10.90;
            } else if (groupType.equals("Regular")) {
                price = numberOfPeople * 15;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price - (price * 0.05);
                }
            }
        } else if (day.equals("Saturday")) {
            if (groupType.equals("Students")) {
                price = numberOfPeople * 9.80;
                if (numberOfPeople >= 30) {
                    price = price - (price * 0.15);
                }
            } else if (groupType.equals("Business")) {
                if (numberOfPeople >= 100) {
                    numberOfPeople = numberOfPeople - 10;
                }
                price = numberOfPeople * 15.60;
            } else if (groupType.equals("Regular")) {
                price = numberOfPeople * 20;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price - (price * 0.05);
                }
            }
        } else if (day.equals("Sunday")) {
            if (groupType.equals("Students")) {
                price = numberOfPeople * 10.46;
                if (numberOfPeople >= 30) {
                    price = price - (price * 0.15);
                }
            } else if (groupType.equals("Business")) {
                if (numberOfPeople >= 100) {
                    numberOfPeople = numberOfPeople - 10;
                }
                price = numberOfPeople * 16;
            } else if (groupType.equals("Regular")) {
                price = numberOfPeople * 22.50;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price - (price * 0.05);
                }
            }
        }

        System.out.printf("Total price: %.2f", price);
    }
}
