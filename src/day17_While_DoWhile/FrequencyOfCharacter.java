package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "AAABBBCAAAAAAAAAAAAAAAAA";

        char ch = 'B';

        int frequency = 0; //1+1+1 ==> 3

        for (int i = 0; i < str.length() ; i++) { // index of str
            char eachChar = str.charAt(i);

            // 'A' == 'B'
            if (ch == eachChar) { // if given char is matching with the eachChar, then ch is appeared in the string

                frequency += 1; // ====> frequency++;
            }
        }

        System.out.println(frequency);

    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */