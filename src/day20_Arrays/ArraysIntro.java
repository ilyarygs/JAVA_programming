package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names
        String[] myGroup = new String[5]; // only contain 5 students 0~4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        // myGroup[5] = "Muhtar";


        // System.out.println(myGroup); //hashcode
        System.out.println( Arrays.toString(myGroup));// ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("-----------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println( Arrays.toString(days));

        int number = 5;

        if (number <1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}
