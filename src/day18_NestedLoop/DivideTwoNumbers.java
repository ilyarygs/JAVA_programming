package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a =50, // a = 23,16,9,2
                b = 9;

        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }

        System.out.println(count+ " with a remainder of "+a);


    }
}
/*
1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the remainder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
 */