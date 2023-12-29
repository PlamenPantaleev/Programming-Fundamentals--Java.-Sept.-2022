package FundamentalsExercise.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int counter = 0;

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String resource = "";
        while (!command.equals("stop")) {
            counter ++;
            int quantity = 0;
            if (counter % 2 == 0) {
                quantity = Integer.parseInt(command);
            } else {
                resource = command;
                command = scanner.nextLine();
                continue;
            }
            if (!map.containsKey(resource)) {
                map.put(resource, quantity);
            } else {
                map.put(resource, map.get(resource) + quantity);
            }

            command = scanner.nextLine();
        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
