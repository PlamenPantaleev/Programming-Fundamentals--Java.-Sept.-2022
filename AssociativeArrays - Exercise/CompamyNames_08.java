package FundamentalsExercise.AssociativeArraysExercise;

import java.util.*;

public class CompamyNames_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> detailMap = new LinkedHashMap<>();

        while (!command.equals("End")) {
            String [] detailsArray = command.split(" -> ");
            String companyName = detailsArray[0];
            String ID = detailsArray[1];

            if (!detailMap.containsKey(companyName)) {
                detailMap.put(companyName, new ArrayList<>());
                detailMap.get(companyName).add(ID);
            } else {
                boolean isSame = false;
                for (Map.Entry<String, List<String>> entry: detailMap.entrySet()) {
                    String value = String.valueOf(entry.getValue());
                    if (value.contains(ID)) {
                        isSame = true;
                        break;
                    }
                }
                if (!isSame) {
                    detailMap.get(companyName).add(ID);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : detailMap.entrySet()) {
            String companyName = entry.getKey();
            System.out.printf("%s%n", companyName);
            for (int i = 0; i < entry.getValue().size(); i++) {
                String ID = entry.getValue().get(i);
                System.out.printf("-- %s%n", ID);
            }
        }
    }
}
