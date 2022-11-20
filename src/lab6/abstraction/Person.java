package lab6.abstraction;

public abstract class Person {
    private String name;
    private String surname;
    private double age;

    //constructor
    public Person() {
        this.name = "?";
        this.surname = "?";
        this.age = 0;
    }

    public Person(String surname, String name, double age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Человек " + surname
                + " " + name + ", "
                + "возраст: " + age
        );
    }
}
