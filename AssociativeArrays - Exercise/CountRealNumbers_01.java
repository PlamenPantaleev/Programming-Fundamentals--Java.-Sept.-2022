package FundamentalsLab.AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        TreeMap<Double, Integer> numbersCount = new TreeMap<>();

        for (int i = 0; i < listInput.size(); i++) {
            double num = listInput.get(i);
            if (!numbersCount.containsKey(num)) {
                numbersCount.put(num, 1);
            } else {
                numbersCount.put(num, numbersCount.get(num) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry: numbersCount.entrySet()) {
            DecimalFormat number = new DecimalFormat("0.######");
            System.out.printf("%s -> %d%n", number.format(entry.getKey()), entry.getValue());
        }
    }
}
