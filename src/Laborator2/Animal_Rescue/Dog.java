package Laborator2.Animal_Rescue;

public class Dog {
    String breed = "Labrador";
    String color = "brown";
    String name = "Mooky";
    int heightInCm = 40;
    float weight = 15.4f;
    int age = 3;
    int health_level = 5;
    int hunger_level = 3;
    int mood = 5;
    String Food = "Meat";
    String FavActvty ="Play Ball";


   public String speak()  {
    return "  Woof!";

    }
    public void eat(int value) {
        weight +=value;
        System.out.println("Eating meat!");
    }
    public void sleep() {

        System.out.println("ZZzzZZ   snore");
    }
    public void play() {

            System.out.println("Play Ball!");

        }

    }



