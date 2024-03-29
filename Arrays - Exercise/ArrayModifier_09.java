package FundamentalsExercise.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split (" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int number1 = array[index1];
                int number2 = array[index2];
                array[index1] = number2;
                array[index2] = number1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int result = array[index1] * array[index2];
                array[index1] = result;
            } else if (command.contains("decrease")) {

                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
