package FinalExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, ArrayList<Integer>> facebookInfo = new LinkedHashMap<>();

        int followers = 0;

        while (!command.equals("Log out")) {
            String[] commandArray = command.split("[\\s+:]+");

            if (command.contains("New follower: ")) {
                String username = commandArray[2];
                followers++;
                if (!facebookInfo.containsKey(username)) {
                    facebookInfo.put(username, new ArrayList<>());
                    facebookInfo.get(username). add(0);
                } else {
                    followers--;
                }
            } else if (command.contains("Like: ")) {
                String username = commandArray[1];
                int likes = Integer.parseInt(commandArray[2]);

                if (!facebookInfo.containsKey(username)) {
                    followers++;
                    facebookInfo.put(username, new ArrayList<>());
                    facebookInfo.get(username).add(likes);
                } else {
                    if (facebookInfo.get(username).size() == 0) {
                        facebookInfo.get(username).add(likes);
                    } else {
                        int currentLikesAndComments = facebookInfo.get(username).get(0);
                        int newLikesAndComments = currentLikesAndComments + likes;
                        facebookInfo.get(username).set(0, newLikesAndComments);
                    }
                }
            } else if (command.contains("Comment: ")) {
                String username = commandArray[1];
                if (!facebookInfo.containsKey(username)) {
                    followers++;
                    facebookInfo.put(username, new ArrayList<>());
                    facebookInfo.get(username).add(1);
                } else {
                    int current = facebookInfo.get(username).get(0) + 1;
                    facebookInfo.get(username).set(0, current);
                }
            } else if (command.contains("Blocked: ")) {
                String username = commandArray[1];

                if (!facebookInfo.containsKey(username)) {
                    System.out.printf("%s doesn't exist.%n", username);
                } else {
                    followers--;
                    facebookInfo.remove(username);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followers);
        for (Map.Entry<String, ArrayList<Integer>> entry : facebookInfo.entrySet()) {
            String username = entry.getKey();
            if (entry.getValue().size() == 0) {
                System.out.printf("%s: %d%n", username, 0);
            } else {
                int likesAndComments = entry.getValue().get(0);
                System.out.printf("%s: %d%n", username, likesAndComments);
            }
        }
    }
}

