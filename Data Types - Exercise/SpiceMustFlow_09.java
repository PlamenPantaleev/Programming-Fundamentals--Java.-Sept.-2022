package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int yieldInStore = 0;
        int days = 0;
        while (startingYield >= 100) {
            days++;
            yieldInStore = yieldInStore + (startingYield - 26);
            startingYield -= 10;
        }
        if (yieldInStore >= 26) {
            yieldInStore = yieldInStore - 26;
        }

        System.out.println(days);
        System.out.println(yieldInStore);
    }
}
