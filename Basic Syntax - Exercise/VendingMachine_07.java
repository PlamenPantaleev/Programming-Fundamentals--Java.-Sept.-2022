package FundamentalsExercise.BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double cash = 0;

        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);


            if (money == 2 ) {
                cash+= money;
            } else if (money == 1 ) {
                cash+= money;
            } else if (money == 0.5) {
                cash+= money;
            } else if (money == 0.2) {
                cash+= money;
            } else if (money == 0.1) {
                cash+= money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }

            input = scanner.nextLine();
        }

        String product = scanner.nextLine();

        double price = 0;

        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    price = 2;
                    if (cash < price) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        cash = cash - price;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (cash < price) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        cash = cash - price;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (cash < price) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        cash = cash - price;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (cash < price) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        cash = cash - price;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (cash < price) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        cash = cash - price;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", cash);
    }
}
