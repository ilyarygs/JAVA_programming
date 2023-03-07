package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jopTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int ID, String jopTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jopTitle = jopTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jopTitle+" "+name+" is working");
    }


}
/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */