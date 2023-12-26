package FundamentalsExercise.BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double money = 0;
        double totalPrice = 0;


        for (int orders = 1; orders <= n; orders++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            money = (days * capsulesCount) * price;
            totalPrice = totalPrice + money;

            System.out.printf("The price for the coffee is: $%.2f%n", money);
        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
