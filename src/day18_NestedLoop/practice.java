package day18_NestedLoop;

public class practice {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {


            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }





    }
}
/*
lunch:
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */