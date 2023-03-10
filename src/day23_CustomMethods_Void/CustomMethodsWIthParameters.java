package day23_CustomMethods_Void;

public class CustomMethodsWIthParameters {

    public static void main(String[] args) {

       // oddOrEven(); // the method demands additional info to complete its task

        oddOrEven(10);

        System.out.println("--------------------------------------------");

        ageOfPerson(1998);

        System.out.println("--------------------------------------------");

        printNumbers(5,20);

    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number+ " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;
        System.out.println("Your age is "+age);

    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){

        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }

    }

}
