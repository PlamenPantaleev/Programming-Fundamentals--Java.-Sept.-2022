package FundamentalsLab.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < inputList.size(); i++) {
            int num = inputList.get(i);

            if (num < 0) {
                inputList.remove(Integer.valueOf(num));
                i = i -1;
            }
        }
        if (inputList.size() == 0) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < inputList.size(); i++) {
                System.out.print(inputList.get(inputList.size()- 1 - i) + " ");
            }
        }
    }
}
