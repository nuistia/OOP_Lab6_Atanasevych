package lab6.inter;

public class Student implements Person {
    private String name;
    private String surname;
    private double age;
    String group;
    int ticket;

    public Student() {
        group = "?";
        ticket = 0;
    }

    public Student(String surname, String name, double age, String group, int ticket) {
        setName(name);
        setSurname(surname);
        setAge(age);
        this.group = group;
        this.ticket = ticket;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getGroup() {
        return group;
    }

    public int getTicket() {
        return ticket;
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
        System.out.println("Студент(-ка) группы " + group
                + " " + getSurname()
                + " " + getName() + ", "
                + "возраст: " + getAge() + ".\n"
                + "Номер студенческого билета: "
                + ticket + "."
        );
    }
}
