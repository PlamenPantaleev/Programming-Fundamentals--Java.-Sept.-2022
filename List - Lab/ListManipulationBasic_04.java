package FundamentalsLab.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String [] commandArr =command.split(" ");
            String input = commandArr[0];
            if (input.equals("Add")) {
                int number = Integer.parseInt(command.split(" ") [1]);
                inputList.add(number);

            } else if (input.equals("Remove")) {
                int removeNum = Integer.parseInt(command.split(" ") [1]);
                inputList.remove(Integer.valueOf(removeNum));

            } else if (input.equals("RemoveAt")) {
                int index = Integer.parseInt(command.split(" ") [1]);
                inputList.remove(index);

            } else if (input.equals("Insert")) {
                int number = Integer.parseInt(command.split(" ") [1]);
                int index = Integer.parseInt(command.split(" ") [2]);
                inputList.add(index, number);
            }



            command = scanner.nextLine();
        }

        for (int i = 0; i < inputList.size(); i++) {
            System.out.print(inputList.get(i) + " ");
        }
    }
}
