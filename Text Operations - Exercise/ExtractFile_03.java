package FundamentalsExercise.TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrayInput = scanner.nextLine().split("\\\\");

        char [] word = arrayInput[arrayInput.length - 1].toCharArray();

        String dot = ".";
        int dotIndex = arrayInput[arrayInput.length - 1].indexOf(dot);
        String fileName = "";
        String extension = "";

        for (int i = 0; i < dotIndex; i++) {
            fileName += word[i];
        }
        for (int i = dotIndex + 1; i < word.length; i++) {
            extension += word[i];
        }

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", extension);
    }
}
