package day10_NestedIf;

public class quizPractice {

    public static void main(String[] args) {

        int score = 0;

        if (score == 0){
            score+= 50;
        }

        if (score != 0){
            score+=50;
        }
        System.out.println(score);

        System.out.println("--------------------------");

        int num = 9;

        if (num++==10){
            System.out.println("hello w"+num);
        }else {
            System.out.println("hello u"+num);
        }

        System.out.println("------------------------");

        boolean A = true, B = !false;

        if (B){
            System.out.println(B);
        } else if (A) {
            System.out.println(A);
        }else {
            System.out.println("C");
        }

        System.out.println("-----------------------------");

        int x = 10;
        int y = x++;

        System.out.println(y++ +" "+ x++ + " "+y);
    }
}
