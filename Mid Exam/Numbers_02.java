package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String [] commandArr = command.split(" ");

            switch (commandArr[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    listInput.add(numberToAdd);
                    break;

                case "Remove":
                    int numberToRemove = Integer.parseInt(commandArr[1]);

                    for (int i = 0; i < listInput.size(); i++) {
                        if (listInput.get(i) == numberToRemove) {
                            listInput.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int numberToReplace = Integer.parseInt(commandArr[1]);
                    int withNumber = Integer.parseInt(commandArr[2]);

                    for (int i = 0; i < listInput.size(); i++) {
                        if (listInput.get(i) == numberToReplace) {
                            listInput.set(i, withNumber);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int number = Integer.parseInt(commandArr[1]);

                    for (int i = 0; i < listInput.size(); i++) {
                        if (listInput.get(i) < number) {
                            listInput.remove((listInput.get(i)));
                            i = i - 1;
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < listInput.size(); i++) {
            System.out.print(listInput.get(i) + " ");
        }
    }
}
