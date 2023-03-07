package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Task_1 {

    public static void main(String[] args) {

        int[][] ard2 = {{1, 2, 3}, {4, 5, 6}};
      int[][] reversed = new int[ard2.length][ard2[0].length];

        int a = 0;
        int b = 0;

        for (int i = ard2.length - 1; i >= 0; i--) {

            for (int j = ard2[i].length - 1; j >= 0; j--) {
                reversed[a][b] = ard2[i][j];
                b++;
            }
            a++;
            b = 0;

        }
        System.out.println(Arrays.deepToString(reversed));



    }


}
/*
1. Write a program that can reverse a tow dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */