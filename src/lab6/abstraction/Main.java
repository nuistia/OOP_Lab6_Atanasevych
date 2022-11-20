package lab6.abstraction;

public class Main {
    public static void main(String[] args) {
        Person stud1 = new Student("Ivanov", "Ivan", 18.7, "FCIT211", 192048);
        Person stud2 = new Student("Petrov", "Petr", 18.9, "FCIT211", 192049);

        Person lect1 = new Lecturer("Fedorov", "Fedr", 36.6, "Inf Tech", 15050.50);
        Person lect2 = new Lecturer("Kiselov", "Bohdan", 51.2, "Inf Tech", 22670);

        Person []faculty = {stud1, stud2, lect1, lect2};

        for (Person p : faculty) {
            p.printInfo();
        }
    }
}