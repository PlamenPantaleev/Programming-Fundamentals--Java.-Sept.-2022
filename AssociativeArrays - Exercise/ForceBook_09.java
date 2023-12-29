package FundamentalsExercise.AssociativeArraysExercise;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> forceMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {


            if (input.contains("|")) {
                String [] arrayInput = input.split(" ");

                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];

                if (!forceMap.containsKey(forceSide)) {
                    if (!forceMap.containsValue(forceUser)) {
                        forceMap.put(forceSide, new ArrayList<>());
                    }
                    forceMap.get(forceSide).add(forceUser);
                } else {
                    if (!forceMap.containsValue(forceUser)) {
                        forceMap.get(forceSide).add(forceUser);
                    }
                }
            } else if (input.contains("->")) {
                String [] arrayInput = input.split(" ");

                String forceUser = input.split("\\s+->\\s+")[0];
                String forceSide = input.split("\\s+->\\s+")[1];

                if (!forceMap.containsKey(forceSide)) {
                    if (!forceMap.containsValue(forceUser)) {
                        forceMap.put(forceSide, new ArrayList<>());
                    }
                    forceMap.get(forceSide).add(forceUser);
                } else {
                    boolean isFound = false;
                    for (Map.Entry<String, List<String>> entry: forceMap.entrySet()) {
                        String user = String.valueOf(entry.getValue()).replace("[", "").replace("]", "");
                        if (user.equals(forceUser)) {
                           entry.getValue().remove(user);
                           forceMap.get(forceSide).add(forceUser);
                            System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                           isFound = true;
                        }
                    }
                    if (!isFound) {
                        forceMap.get(forceSide).add(forceUser);
                        System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String ,List<String>> entry : forceMap.entrySet()) {
            String side = entry.getKey();
            int members = entry.getValue().size();
            if (members > 0) {
                System.out.printf("Side: %s, Members: %d%n", side, members);
            }
            for (int i = 0; i < members; i++) {
                String name = entry.getValue().get(i);
                System.out.printf("! %s%n", name);
            }
        }
    }
}
