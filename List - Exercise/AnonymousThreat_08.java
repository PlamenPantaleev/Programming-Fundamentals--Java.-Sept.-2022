package FundamentalsExercise.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> texts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("3:1")) {
            String [] commandInput = command.split("\\s+");

            if (commandInput[0].equals("merge")) {
                int startIndex = Integer.parseInt(commandInput[1]);
                int endIndex = Integer.parseInt(commandInput[2]);

                if (texts.size() - 1 < startIndex) {
                    command = scanner.nextLine();
                    continue;
                } else if (texts.size() - 1 < endIndex) {
                    for (int i = startIndex; i < texts.size(); i++) {
                        texts.set(startIndex, texts.get(startIndex) + texts.get(startIndex + 1));
                        texts.remove(startIndex + 1);
                    }
                } else {
                    for (int i = startIndex; i < endIndex; i++) {
                        texts.set(startIndex, texts.get(startIndex) + texts.get(startIndex + 1));
                        texts.remove(startIndex + 1);
                    }
                }
            } else if (commandInput[0].equals("divide")) {
                int index = Integer.parseInt(commandInput[1]);
                int partitions = Integer.parseInt(commandInput[2]);

                StringBuilder textToDivide = new StringBuilder(texts.get(index));
                if (textToDivide.length() % partitions == 0) {
                    int counter = 0;
                    StringBuilder newText = new StringBuilder();

                    for (int i = 0; i < partitions; i++) {
                        for (int j = i * 2; j < i * 2 + 1; j++) {
                            newText.append(textToDivide.charAt(j));
                            newText.append(textToDivide.charAt(j + 1));
                            texts.add(index + counter, newText.toString());
                            counter ++;
                        }
                        newText = new StringBuilder();
                    }
                    texts.remove(index + counter);
                } else {
                    int counter = 0;
                    StringBuilder newText = new StringBuilder();

                    for (int i = 0; i < partitions; i++) {
                        for (int j = 0; j < 1; j++) {
                            if (i == partitions - 1) {
                                counter ++;
                                texts.add(i, textToDivide.toString());
                            } else {
                                newText.append(textToDivide.charAt(j));
                                texts.add(index + counter, newText.toString());
                                newText = new StringBuilder();
                                counter++;
                                textToDivide.deleteCharAt(j);
                            }
                        }
                    }
                    texts.remove(index + counter);
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < texts.size(); i++) {
            System.out.print(texts.get(i) + " ");
        }
    }
}
