package zoo.birds;

import zoo.behaviors.Flyable;

public class Parrot extends Bird implements Flyable {
    private final String color;
    private int vocabularySize;
    protected String favoriteFood; // New protected member

    public Parrot(String name) {
        super(name);
        this.color = "Green";
        this.vocabularySize = 20;
        this.favoriteFood = "Seeds";
    }

    public Parrot(String name, String color) {
        super(name);
        this.color = color;
        this.vocabularySize = 20;
        this.favoriteFood = "Seeds";
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying beautifully.");
    }

    public void talk() {
        System.out.println(name + " is talking with a vocabulary of " + vocabularySize + " words.");
    }

    public void talk(String phrase) {
        System.out.println(name + " says: " + phrase);
    }
}

