package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char forthChar = word.charAt(4);
        System.out.println("forthChar = " + forthChar);


        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        */

        System.out.println("----------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt( s1.length()-1 );
        System.out.println("lastChar = " + lastChar);

        System.out.println("----------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON" //use for make upper case

        System.out.println(str);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();//use for make upper case

        System.out.println(sentence);

        char fifteenth = sentence.charAt(14);
        System.out.println("fifteenth = " + fifteenth);

        String mine = "MY NAME İS JOHN";
        mine = mine.toLowerCase(); //use for make a lower case

        System.out.println(mine);



    }
}
