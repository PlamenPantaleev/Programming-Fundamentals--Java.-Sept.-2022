package FundamentalsExercise.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> registeredDrivers = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String [] inputArray = scanner.nextLine().split("\\s+");
            String command = inputArray[0];

            if (command.equals("register")) {
                String username = inputArray[1];
                String number = inputArray[2];
                if (!registeredDrivers.containsKey(username)) {
                    registeredDrivers.put(username, number);
                    System.out.printf("%s registered %s successfully%n", username, number);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", number);
                }
            } else if (command.equals("unregister")) {
                String username = inputArray[1];
                if (!registeredDrivers.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registeredDrivers.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        registeredDrivers.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));
    }
}
