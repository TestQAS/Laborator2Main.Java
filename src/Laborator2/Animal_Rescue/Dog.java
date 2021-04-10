package Laborator2.Animal_Rescue;

public class Dog {
public Dog(){
    String breed = "Labrador";
    String color = "brown";
    String name = "Mooky";
    int heightInCm = 40;
    float weight = 15.4f;
    int age = 3;
}
   public String speak()  {
    return "  Woof!";

    }
    public void eat(int value) {

        System.out.println("Eating meat!");
    }
    public void sleep() {

        System.out.println("ZZzzZZ   snore");
    }
    public void play() {

            System.out.println("Play Ball!");

        }

    }



