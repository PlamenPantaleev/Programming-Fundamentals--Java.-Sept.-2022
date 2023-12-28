package FundamentalsExercise.ObjectsAndClassesExercise.OrderByAge;

public class Person {
    private String name;
    private int IDNumber;
    private int age;

    public Person (String name, int IDNumber, int age) {
        this.name = name;
        this.IDNumber = IDNumber;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public int getAge() {
        return age;
    }
}
