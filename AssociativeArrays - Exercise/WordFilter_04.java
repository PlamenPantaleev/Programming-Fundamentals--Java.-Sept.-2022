package FundamentalsLab.AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrayInput = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);


        System.out.println(String.join(System.lineSeparator(), arrayInput));
    }
}
