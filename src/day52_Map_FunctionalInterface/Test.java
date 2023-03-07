package day52_Map_FunctionalInterface;

// lambda.  () -> {}

public class Test {

    public static void main(String[] args) {

        // function1: create the function that can display a number is odd
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n%2==0){
                System.out.println(n + " is even number");
            }else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if (age>=21){
                System.out.println("Eligible to buy alcohol");
            }else {
                System.out.println("Not Eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(18);

        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube;

        printCube = (n) -> {
            System.out.println(n*n*n);
        };

        printCube.apply(3);

        //function4: create a function that can check if a number is evenly divisble by  3 & 5

        MyFirstFunctionalInterface divisibleBy3And5 =  n -> {
            if(n % 15 ==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);


    }

}
