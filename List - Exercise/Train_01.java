package FundamentalsExercise.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                String [] input = command.split("\\s+");
                int addWagon = Integer.parseInt(command.split(" ")[1]);
                passengers.add(addWagon);
            } else {
                int passengersInput = Integer.parseInt(command.split(" ") [0]);
                for (int i = 0; i < passengers.size(); i++) {
                    if (passengersInput + passengers.get(i) <= maxPassengers) {
                        passengers.set(i, passengersInput + passengers.get(i));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < passengers.size(); i++) {
            System.out.print(passengers.get(i) + " ");
        }
    }
}
