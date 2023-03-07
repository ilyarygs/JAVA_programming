package day23_CustomMethods_Void;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        oddNumbers();

        System.out.println("---------------------------------------------------------------");

        evenNumbers();

        System.out.println("---------------------------------------------------------------");

        eligibleToBuyAlcohol(19);

        System.out.println("-----------------------------------------------------------------");

        eligibleToVote(19,"USA");

        System.out.println("--------------------------------------------------------------------");

        calculateGrade(75);

        System.out.println("-------------------------------------------------------------------");

        areaCircle(5);

        System.out.println("-------------------------------------------------------------------");

        areaSquare(6);

        System.out.println("-------------------------------------------------------------------");

        dollarToEuro(100);

        System.out.println("--------------------------------------------------------------------");

        dollarToLira(100);

        System.out.println("-------------------------------------------------------");

        kgLbs(25);

        System.out.println("---------------------------------------------");

        positiveNegZero(-90);

        System.out.println("-------------------------------------------------------------");

        printEachChar("I love Java.");

        System.out.println("-------------------------------------------");


    }

    public static void oddNumbers(){

        for (int i = 1; i < 100; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void evenNumbers(){

        for (int i = 2; i < 101; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void eligibleToBuyAlcohol(int age){

        if (age > 18){
            System.out.println("You can buy alcohol");
        }else {
            System.out.println("you can not buy alcohol");
        }

    }

    public static void eligibleToVote(int age, String country){

        if (age > 20 && country.equals("USA")){
            System.out.println("You are eligible to vote!");
        }else {
            System.out.println("You are not eligible to vote!");
        }

    }

    public static void calculateGrade(int score){

        if (score >= 85 && score <= 100){
            System.out.println('A');
        } else if (score >= 70 && score < 85) {
            System.out.println('B');
        } else if (score >= 60 && score < 70) {
            System.out.println('C');
        } else if (score >= 50 && score < 60) {
            System.out.println('D');
        } else if (score >= 0 && score < 50) {
            System.out.println('F');
        }else {
            System.out.println("Invalid score!");
        }

    }

    public static void areaCircle(int radius){

        System.out.println(3.14 * (radius*radius) );

    }

    public static void areaSquare(int length){

        System.out.println(length*length);

    }

    public static void dollarToEuro(int dollar){

        System.out.println(dollar * 1.01 + "€");

    }

    public static void dollarToLira(int dollar){

        System.out.println(dollar * 18.55 + "₺");

    }

    public static void kgLbs(int kg){

        System.out.println(kg * 2.20462262);

    }

    public static void positiveNegZero(int number){

        if (number > 0){
            System.out.println(number+ " is positive");
        } else if (number < 0) {
            System.out.println(number+ " is negative");
        }else {
            System.out.println(number+ " is zero");
        }

    }

    public static void printEachChar(String word){

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }

    }

    public static void printEachElement(int[] nums){

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


	5. create a method that can calculate the grade of the student based on the score

	6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square

	9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb

	12. create a method that can if the given integer is positive, negative or zero

	13. create a method named printEachChar that can print each characters of a string

	14. create a method named printEachElement that can print each elements of an integer array

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result


	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */