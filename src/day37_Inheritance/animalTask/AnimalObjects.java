package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',"small",1,"white");

        System.out.println(dog1);

        dog1.bark();
        //dog1.scratch();
        //dog1.sing();

        Cat cat1 = new Cat("Love","Siamese",'F',"Large",2,"Black");

        System.out.println(cat1);

        cat1.scratch();
        //cat1.bark();

        Parrot parrot1 = new Parrot("king","macaw",'M',"small",3,"blue");

        System.out.println(parrot1);
        parrot1.sing();


    }


}
