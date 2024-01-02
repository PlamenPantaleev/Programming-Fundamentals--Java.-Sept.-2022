package FundamentalsLab.BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = inputHours * 60 + inputMinutes + 30;

        int hour = timeInMinutes / 60;
        int minutes = timeInMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
