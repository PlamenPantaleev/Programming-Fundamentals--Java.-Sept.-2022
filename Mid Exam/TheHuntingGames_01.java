package MidExam;

import java.util.Scanner;

public class TheHuntingGames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int totalPlayers = Integer.parseInt(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double totalWater = daysOfAdventure * totalPlayers * waterPerDay;
        double totalFood = daysOfAdventure * totalPlayers * foodPerDay;

        for (int i = 1; i <= daysOfAdventure; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            groupsEnergy = groupsEnergy - energyLoss;
            if (groupsEnergy <= 0) {
                break;
            }

            if (i % 2 == 0) {
                groupsEnergy = groupsEnergy + (groupsEnergy * 0.05);
                totalWater = totalWater - (totalWater * 0.30);

            }
            if (i % 3 == 0) {
                totalFood = totalFood - (totalFood / totalPlayers);
                groupsEnergy = groupsEnergy + (groupsEnergy * 0.10);

            }

        }
        if (groupsEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupsEnergy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
