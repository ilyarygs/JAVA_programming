package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";

        String fullName = firstName + " " + lastName;
        int age = 19;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;



        //Full name of the person is _____
        System.out.println("Full name of the person is " + fullName);

        // ______ is __ years old

        System.out.println(fullName + " is " + age + " years old");

        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "' salary is $" + salary);



    }
}
