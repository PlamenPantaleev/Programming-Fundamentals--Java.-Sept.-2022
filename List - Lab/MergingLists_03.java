package FundamentalsLab.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();
        int listMin = Math.min(listOne.size(), listTwo.size());
        for (int i = 0; i < listMin; i++) {
            int numberA = listOne.get(i);
            int numberB = listTwo.get(i);

            newList.add(numberA);
            newList.add(numberB);
        }
        if (listOne.size() > listTwo.size()) {
            newList.addAll(listOne.subList(listMin, listOne.size()));
        } else if (listTwo.size() > listOne.size()) {
            newList.addAll(listTwo.subList(listMin, listTwo.size()));
        }

        System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
    }
}
