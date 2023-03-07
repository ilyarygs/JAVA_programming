package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Students students1 = new Students("Ahmet");

        Students students2 = new Students("Aygun",'F');

        Students students3 = new Students("Nigara",11);

        Students students4 = new Students("Mert",12,'M');

        Students students5 = new Students("Cihad",'M',28);

        Students students6 = new Students("Suhaib",'M',27,15);

        Students students7 = new Students("Ali",'M',42,30,'A');

        System.out.println(students1 == students2);

        Students[] students = { students1, students2, students3, students4, students5, students6, students7};


        System.out.println(Arrays.toString(students));


    }
}
