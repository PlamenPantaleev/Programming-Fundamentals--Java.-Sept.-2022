package FundamentalsExercise.ObjectsAndClassesExercise.Message;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Random randomNumber = new Random();


        for (int i = 1; i <= n; i++) {
            int phraseNumber = randomNumber.nextInt(6);
            int eventsNumber = randomNumber.nextInt(7);
            int authorsNumber = randomNumber.nextInt(8);
            int citiesNumber = randomNumber.nextInt(5);
            System.out.printf("%s %s %s - %s%n", printPhrases(phraseNumber),
                    printEvent(eventsNumber), printAuthor(authorsNumber),
                    printCity(citiesNumber));
        }
    }
        public static String printPhrases ( int numberPhrase) {
            String[] phrasesArray = new String[6];
            phrasesArray[0] = "Excellent product.";
            phrasesArray[1] = "Such a great product.";
            phrasesArray[2] = "I always use that product.";
            phrasesArray[3] = "Best product of its category.";
            phrasesArray[4] = "Exceptional product.";
            phrasesArray[5] = "I can’t live without this product.";
            return phrasesArray[numberPhrase];
        }

    public static String printEvent (int numberEvent) {
        String[] eventsArray = new String[7];
        eventsArray[0] = "Now I feel good.";
        eventsArray[1] = "I have succeeded with this product.";
        eventsArray[2] = "Makes miracles.";
        eventsArray[3] = "I am happy of the results!";
        eventsArray[4] = "I cannot believe but now I feel awesome.";
        eventsArray[5] = "Try it yourself, I am very satisfied.";
        eventsArray[6] = "I feel great!";
        return eventsArray[numberEvent];
    }

    public static String printAuthor (int numberAuthor) {
        String [] authorsArray = new String[8];
        authorsArray[0] = "Diana";
        authorsArray[1] = "Petya";
        authorsArray[2] = "Stella";
        authorsArray[3] = "Elena";
        authorsArray[4] = "Katya";
        authorsArray[5] = "Iva";
        authorsArray[6] = "Annie";
        authorsArray[7] = "Eva";
        return authorsArray[numberAuthor];
    }

    public static String printCity (int numberCity) {
        String [] cityArray = new String[5];
        cityArray[0] = "Burgas";
        cityArray[1] = "Sofia";
        cityArray[2] = "Plovdiv";
        cityArray[3] = "Varna";
        cityArray[4] = "Ruse";
        return cityArray[numberCity];
    }
}
