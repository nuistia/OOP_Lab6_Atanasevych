package lab6.abstraction;

public class Lecturer extends Person {
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
    public void printInfo() {
        System.out.println("Преподаватель кафедры " + pulpit
                + " " + getSurname()
                + " " + getName() + ", "
                + "возраст: " + getAge() + ".\n"
                + "Зарплата: " + salary + "."
        );
    }
}
