package FundamentalsLab.BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        boolean isValid = true;
        int ticketPrice = 0;

        if (dayType.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 12;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 18;
            }else if (age > 64 && age <= 122) {
                ticketPrice = 12;
            }else {
                isValid = false;
            }
        } else if (dayType.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 15;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 20;
            }else if (age > 64 && age <= 122) {
                ticketPrice = 15;
            }else {
                isValid = false;
            }
        } else if (dayType.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 5;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 12;
            }else if (age > 64 && age <= 122) {
                ticketPrice = 10;
            }else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

       if (!isValid) {
           System.out.println("Error!");
       } else {
           System.out.printf("%d$", ticketPrice);
       }
    }
}
