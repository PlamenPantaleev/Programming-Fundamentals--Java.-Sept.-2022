package FundamentalsLab.Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                printCoffee(quantity);
                break;
            case "water":
                printWater(quantity);
                break;
            case "coke":
                printCoke(quantity);
                break;
            case "snacks":
                printSnacks(quantity);
        }
    }

    public static void printCoffee (int quantity) {
        double cost = quantity * 1.50;
        System.out.printf("%.2f", cost);
    }

    public static void printWater (int quantity) {
        double cost = quantity * 1.00;
        System.out.printf("%.2f", cost);
    }

    public static void printCoke (int quantity) {
        double cost = quantity * 1.40;
        System.out.printf("%.2f", cost);
    }

    public static void printSnacks (int quantity) {
        double cost = quantity * 2.00;
        System.out.printf("%.2f", cost);
    }
}
