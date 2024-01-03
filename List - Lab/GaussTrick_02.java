package FundamentalsLab.List;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int listSize = list.size();
        for (int i = 0; i < listSize / 2; i++) {
            list.set(i, list.get(i) + list.get(list.size() - 1));
            list.remove(list.size() - 1);

        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
