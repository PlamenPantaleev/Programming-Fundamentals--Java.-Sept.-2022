package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfPhones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String [] commandArr = command.split(" ");

            if (command.contains("Add")) {
                String addPhone = commandArr[2];
                boolean exist = false;

                for (int i = 0; i < listOfPhones.size(); i++) {
                    if (listOfPhones.get(i).equals(addPhone)) {
                        exist = true;
                    }
                }
                if (!exist) {
                    listOfPhones.add(addPhone);
                }
            } else if (command.contains("Remove")) {
                String removePhone = commandArr[2];

                for (int i = 0; i < listOfPhones.size(); i++) {
                    if (listOfPhones.get(i).equals(removePhone)) {
                        listOfPhones.remove(i);
                        break;
                    }
                }

            } else if (command.contains("Bonus phone")) {
                String [] phones = commandArr[3].split(":");
                String oldPhone = phones[0];
                String newPhone = phones[1];

                for (int i = 0; i < listOfPhones.size(); i++) {
                    if (listOfPhones.get(i).equals(oldPhone)) {
                        listOfPhones.add(i + 1, newPhone);
                        break;
                    }
                }
            } else if (command.contains("Last")) {
                String phone = commandArr[2];

                for (int i = 0; i < listOfPhones.size(); i++) {
                    if (listOfPhones.get(i).equals(phone)) {
                        listOfPhones.remove(i);
                        listOfPhones.add(phone);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < listOfPhones.size(); i++) {
            if (i == listOfPhones.size() - 1) {
                System.out.print(listOfPhones.get(i));
            } else {
                System.out.print(listOfPhones.get(i) + ", ");
            }
        }
    }
}
