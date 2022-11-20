package lab6.inter;

public interface Person {
    String getName();

    String getSurname();

    double getAge();

    void setName(String name);

    void setSurname(String surname);

    void setAge(double age);

    void printInfo();
    /*{
        System.out.println("Человек " + surname
                + " " + name + ", "
                + "возраст: " + age
        );
    }*/
}
