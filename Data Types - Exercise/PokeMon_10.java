package FundamentalsExercise.DataTypesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int startingPokePower = pokePower;
        int pocking = 0;

        while (pokePower >= distance) {
            pokePower = pokePower - distance;
            pocking++;

            if (pokePower == (startingPokePower / 2)) {
                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }
        }

        System.out.println(pokePower);
        System.out.println(pocking);
    }
}
