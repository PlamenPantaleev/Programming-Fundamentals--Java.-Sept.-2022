package FundamentalsExercise.ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> partyList = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String [] inputArr = input.split("\\s+");
            String name = inputArr[0];

            if (input.contains("is going!")) {
                boolean isOnTheList = false;
                if (partyList.size() == 0) {
                    partyList.add(name);
                } else {
                    for (int j = 0; j < partyList.size(); j++) {
                        if (partyList.get(j).equals(name)) {
                            isOnTheList = true;
                            break;
                        }
                    }
                    if (isOnTheList) {
                        System.out.printf("%s is already in the list!%n", name);
                        isOnTheList = false;
                    } else {
                        partyList.add(name);
                    }
                }
            } else if (input.contains("is not going!")) {
                boolean isRemoved = false;
                for (int j = 0; j < partyList.size(); j++) {
                    if (partyList.get(j).equals(name)) {
                        isRemoved = true;
                    }
                }
                if (isRemoved) {
                    partyList.remove(name);
                    isRemoved = false;
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (int i = 0; i < partyList.size(); i++) {
            System.out.println(partyList.get(i) + " ");
        }
    }
}
