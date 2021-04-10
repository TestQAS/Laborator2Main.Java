package Laborator2.Animal_Rescue;

public class AppMain {
    public static void main(String[] args) {

        Dog mooky = new Dog();

        mooky.eat(2);

String message = mooky.speak();

        System.out.println("mooky says" + message);
    }

    }
