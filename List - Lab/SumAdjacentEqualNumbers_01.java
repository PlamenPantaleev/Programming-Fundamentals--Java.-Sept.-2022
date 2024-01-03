package FundamentalsLab.List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < listInput.size(); i++) {

            if (i == listInput.size() - 1) {
                break;
            }
            double number = listInput.get(i);

            if (number == listInput.get(i + 1)) {
                listInput.set(i, number + listInput.get(i + 1));
                listInput.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementsByDelimiter(listInput, " ");
        System.out.println(output);
    }

    public static String joinElementsByDelimiter (List<Double> listInput, String delimiter) {

        String output = "";
        for (Double item : listInput) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
