package Lab2.Animal_Rescue;

public class Animal {
    private String breed;
    private String color;
    private String name;
    private int heightInCm;
    private float weight;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int mood;
    private String food;
    private String favActvty;

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int mood() {
        return mood;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFavActvty(String favActvty) {
        this.favActvty = favActvty;
    }

    public String getFavActvty() {
        return favActvty;
    }
}