package FundamentalsExercise.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String [] commandArr = command.split("\\s+");
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(commandArr[1]);
                inputList.add(numberToAdd);

            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(commandArr[1]);
                int index = Integer.parseInt(commandArr[2]);
                if (isValid(inputList, index)) {
                    inputList.add(index, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }


            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(commandArr[1]);

                if (isValid(inputList, indexToRemove)) {
                    inputList.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                int movingCount = Integer.parseInt(commandArr[2]);
                for (int i = 0; i < movingCount; i++) {
                    int newNumber = inputList.get(0);
                    inputList.remove(0);
                    inputList.add(newNumber);

                }
            } else if (command.contains("Shift right")) {
                int movingCount = Integer.parseInt(commandArr[2]);
                for (int i = 0; i < movingCount; i++) {
                    int newNumber = inputList.get(inputList.size() - 1);
                    inputList.remove(inputList.size() - 1);
                    inputList.add(0, newNumber);
                }
            }


                command = scanner.nextLine();
        }

        for (int i = 0; i < inputList.size(); i++) {
            System.out.print(inputList.get(i) + " ");
        }
    }

    public static boolean isValid (List<Integer> inputList, int index) {
        return index >= 0 && index <= inputList.size() - 1;
    }
}
