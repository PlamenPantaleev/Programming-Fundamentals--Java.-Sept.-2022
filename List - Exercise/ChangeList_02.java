package FundamentalsExercise.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int elementToDelete = Integer.parseInt(command.split("\\s+")[1]);
                for (int i = 0; i < listInput.size(); i++) {
                    if (elementToDelete == listInput.get(i)) {
                        listInput.remove(i);
                    }
                }
            } else if (command.contains("Insert")) {
                int elementToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                listInput.add(index, elementToInsert);
            }


            command = scanner.nextLine();
        }

        for (int i = 0; i < listInput.size(); i++) {
            System.out.print(listInput.get(i) + " ");
        }
    }
}
