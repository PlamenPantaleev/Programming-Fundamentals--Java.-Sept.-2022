package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int capacity = 0;
        for (int i = 1; i <= lines; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            capacity += liters;
            if (capacity > 255) {
                capacity = capacity - liters;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%d", capacity);
    }
}
