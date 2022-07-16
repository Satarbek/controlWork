package Task1;

import java.util.Random;

public class Cat {

    public static final Random rnd = new Random();

    private String name;
    private int age;
    private int health;
    private int mood;
    private int satiety;
    private transient int averageLifeLevel;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        health = rnd.nextInt(101);
        mood = rnd.nextInt(101);
        satiety = rnd.nextInt(101);
        averageLifeLevel = (health + mood + satiety) / 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
       return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAverageLifeLevel() {
        return averageLifeLevel;
    }

    public void setAverageLifeLevel(int averageLifeLevel) {
        this.averageLifeLevel = averageLifeLevel;
    }

}
