package Lab2.Animal_Rescue;

public class AppMain {
    public static void main(String[] args) {

        Dog mooky = new Dog();
        mooky.eat(2);
        Girl Amy =new Girl();
        System.out.println(Amy.age);
        PlayingRoutine playtime = new PlayingRoutine();
        System.out.println(playtime.game_name);
        Veterinary vetDoc = new Veterinary();
        System.out.println(vetDoc.Name);
        AnimalFood meat = new AnimalFood();
        System.out.println(meat.Qty);


    }

    }
