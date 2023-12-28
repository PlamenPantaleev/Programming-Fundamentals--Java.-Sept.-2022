package FundamentalsExercise.ObjectsAndClassesExercise.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!command.equals("End")) {
            String [] commandArray = command.split(" ");
            String name = commandArray[0];
            int IDNumber = Integer.parseInt(commandArray[1]);
            int age = Integer.parseInt(commandArray[2]);

            Person person = new Person(name, IDNumber, age);
            personList.add(person);

            command = scanner.nextLine();
        }
        personList.sort(Comparator.comparingInt(Person::getAge));

        for (Person item: personList) {
            System.out.printf("%s with ID: %d is %d years old.%n", item.getName(), item.getIDNumber(), item.getAge());
        }
    }
}
