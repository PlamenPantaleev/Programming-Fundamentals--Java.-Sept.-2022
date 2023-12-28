package FundamentalsExercise.ObjectsAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String [] input = scanner.nextLine().split(" ");

            Person personInfo = new Person(input[0], Integer.parseInt(input[1]));

            personList.add(personInfo);
        }

        for (Person item: personList) {
            if (item.getAge() > 30) {
                System.out.printf("%s - %d%n", item.getName(), item.getAge());
            }
        }
    }
}
