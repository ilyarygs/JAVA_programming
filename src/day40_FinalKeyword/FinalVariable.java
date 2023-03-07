package day40_FinalKeyword;

public class FinalVariable {

    final String bithDay;
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String bithDay) {
        this.bithDay = bithDay;
    }

    public static void main(String[] args) {


        final double pi = 3.14;

        //pi = 4.14; final variables can not be reassigned
        //pi = 5.4;

        final String name;
         name = "Java";

         //name = "WoodenSpoon";

        System.out.println(name);

        System.out.println("--------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        //obj.bithDay = "Jun/01";

        System.out.println(obj.bithDay);

        System.out.println("-------------------------------------------");

        //FinalVariable.name = "Python";

        System.out.println(FinalVariable.name);


    }

}
