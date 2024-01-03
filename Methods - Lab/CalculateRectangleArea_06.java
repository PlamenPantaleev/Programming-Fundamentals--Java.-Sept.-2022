package FundamentalsLab.Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = printArea(width, length);
        System.out.printf("%.0f", area);
    }

    public static double printArea (double width, double length) {
        return width * length;

    }
}
