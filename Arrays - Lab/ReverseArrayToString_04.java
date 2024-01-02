package FundamentalsLab.Arrays;

import java.util.Scanner;

public class ReverseArrayToString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] elementsArr = scanner.nextLine().split(" ");

        for (int i = 0; i < elementsArr.length / 2; i++) {
            String oldElement = elementsArr[i];
            elementsArr[i] = elementsArr[elementsArr.length - 1 - i];
            elementsArr[elementsArr.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", elementsArr));
    }
}
