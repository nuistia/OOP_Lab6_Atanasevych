package lab6.inter;

public class Lecturer implements Person {
    private String name;
    private String surname;
    private double age;
    String pulpit; //кафедра
    double salary;

    public Lecturer() {
        pulpit = "?";
        salary = 0;
    }

    public Lecturer(String surname, String name, double age, String pulpit, double salary) {
        setName(name);
        setSurname(surname);
        setAge(age);
        this.pulpit = pulpit;
        this.salary = salary;
    }

    public String getPulpit() {
        return pulpit;
    }

    public double getSalary() {
        return salary;
    }

    public void setPulpit(String pulpit) {
        this.pulpit = pulpit;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public double getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void printInfo() {
        System.out.println("Преподаватель кафедры " + pulpit
                + " " + getSurname()
                + " " + getName() + ", "
                + "возраст: " + getAge() + ".\n"
                + "Зарплата: " + salary + "."
        );
    }
}
