package FundamentalsExercise.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deckOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deckTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (deckOne.size() > 0 && deckTwo.size() > 0) {
            int cardOne = deckOne.get(0);
            int cardTwo = deckTwo.get(0);

            if (cardOne > cardTwo) {
                deckOne.add(cardOne);
                deckOne.add(cardTwo);
                deckTwo.remove(Integer.valueOf(cardTwo));
                deckOne.remove(0);
            } else if (cardTwo > cardOne) {
                deckTwo.add(cardTwo);
                deckTwo.add(cardOne);
                deckOne.remove(Integer.valueOf(cardOne));
                deckTwo.remove(0);
            } else {
                deckOne.remove(Integer.valueOf(cardOne));
                deckTwo.remove(Integer.valueOf(cardTwo));
            }
        }

        int sum = 0;

        if (deckOne.size() > 0) {
            for (int i = 0; i < deckOne.size(); i++) {
                sum+= deckOne.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (deckTwo.size() > 0) {
            for (int i = 0; i < deckTwo.size(); i++) {
                sum+= deckTwo.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
