package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C'){
                continue;
            }

            System.out.println(i); // A B

        }


        System.out.println("-----------------------------");
        // print all even numbers 1 ~ 10 (skip the odd numbers)

        for (int i = 1; i < 11; i++){

            if (i%2 !=0){
                continue;
            }
            System.out.println(i); // 2 4 6 8 10

        }

        System.out.println("-----------------------------");
        // print all odd numbers between 1 ~ 10 ( skip the even numbers)

        for (int i=1; i<11; i++){

            if (i%2 ==0){
                continue;
            }

            System.out.println(i); // 1 3 5 7 9

        }




    }
}
