package lab6.abstraction;

public class Student extends Person {
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
