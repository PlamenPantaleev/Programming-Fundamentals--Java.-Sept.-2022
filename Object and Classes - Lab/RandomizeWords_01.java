package FundamentalsLab.ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] wordsArray = scanner.nextLine().split("\\s+");

        Random random = new Random();

        for (int pos1 = 0; pos1 < wordsArray.length; pos1++) {
            int pos2 = random.nextInt(wordsArray.length);
            String oldWord = wordsArray[pos1];
            String newWord = wordsArray[pos2];
            wordsArray[pos1] = newWord;
            wordsArray[pos2] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArray));
    }
}
