package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jubTitle;
    public double salary;

    public Employee(String name, char gender, String jubTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.jubTitle = jubTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jubTitle='" + jubTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
