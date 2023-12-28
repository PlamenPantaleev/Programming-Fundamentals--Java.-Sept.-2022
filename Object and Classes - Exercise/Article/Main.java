package FundamentalsExercise.ObjectsAndClassesExercise.Article;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleArray = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());

        Article article = new Article(articleArray[0],articleArray[1], articleArray[2]);

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.contains("Edit")) {
                String[] commandArray = command.split(": ");
                article.setContent(commandArray[1]);
            } else if (command.contains("ChangeAuthor")) {
                String[] commandArray = command.split(": ");
                article.setAuthor(commandArray[1]);
            } else if (command.contains("Rename")) {
                String[] commandArray = command.split(": ");
                article.setTitle(commandArray[1]);
            }
        }
        System.out.println(article.toString());
    }
}
