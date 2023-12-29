package FinalExam;

import java.util.Scanner;

public class StringGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String [] commandArray = command.split(" ");
            String possibleCommand = commandArray[0];


            switch (possibleCommand) {
                case "Change":
                    String symbol = commandArray[1];
                    String replacement = commandArray[2];

                    input = input.replaceAll(symbol, replacement);
                    System.out.println(input);
                    break;
                case "Includes":
                    String substring = commandArray[1];
                    if (input.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String substringAgain = commandArray[1];

                    if (input.endsWith(substringAgain)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String subs = commandArray[1];
                    int index = input.indexOf(subs);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandArray[1]);
                    int count = Integer.parseInt(commandArray[2]);

                    StringBuilder sb = new StringBuilder();

                    for (int i = 0; i < count; i++) {
                        char currentSymbol = input.charAt(startIndex);
                        startIndex ++;

                        sb.append(currentSymbol);
                    }
                    System.out.println(sb);
                    break;

            }

            command = scanner.nextLine();
        }
    }
}
