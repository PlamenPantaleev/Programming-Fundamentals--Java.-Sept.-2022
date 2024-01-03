package FundamentalsLab.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String inputLine = scanner.nextLine();


        while (!inputLine.equals("end")) {
            String [] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            if (inputLine.contains("Contains")) {
                int number = Integer.parseInt(commandArr[1]);
                if (inputList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (inputLine.contains("Print even")) {
                for (int i = 0; i < inputList.size(); i++) {
                    int num = inputList.get(i);

                    if (num % 2 == 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            } else if (inputLine.contains("Print odd")) {
                for (int i = 0; i < inputList.size(); i++) {
                    int num = inputList.get(i);

                    if (num % 2 != 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            } else if (inputLine.contains("Get sum")) {
                int sum = 0;
                for (int i = 0; i < inputList.size(); i++) {
                    sum += inputList.get(i);
                }
                System.out.print(sum);
                System.out.println();
            } else if (inputLine.contains("Filter")) {
                String filter = commandArr[1];
                int num = Integer.parseInt(commandArr[2]);

                if (filter.equals(">")) {
                    for (int i = 0; i < inputList.size(); i++) {
                        if (num < inputList.get(i)) {
                            System.out.print(inputList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (filter.equals("<")) {
                    for (int i = 0; i < inputList.size(); i++) {
                        if (num > inputList.get(i)) {
                            System.out.print(inputList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (filter.equals(">=")) {
                    for (int i = 0; i < inputList.size(); i++) {
                        if (num <= inputList.get(i)) {
                            System.out.print(inputList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (filter.equals("<=")) {
                    for (int i = 0; i < inputList.size(); i++) {
                        if (num >= inputList.get(i)) {
                            System.out.print(inputList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }

            inputLine = scanner.nextLine();

        }
    }
}
