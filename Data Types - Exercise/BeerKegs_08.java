package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String biggestKeg = " ";
        double volume = 0;
        for (int i = 1; i <= n; i++) {
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;
            if (kegVolume > volume) {
                volume = kegVolume;
                biggestKeg = kegModel;
            }
        }
        System.out.println(biggestKeg);
    }
}
