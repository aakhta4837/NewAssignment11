package zoo;

import zoo.animals.*;
import zoo.birds.Parrot;
import zoo.reptiles.Snake;

public class Main {
    public static void main(String[] args) {
        // Instantiate Dog
        Dog dog = new Dog("Buddy", 3, "Labrador");
        dog.makeSound();
        dog.run();
        dog.fetch();
        dog.fetch("stick");

        // Instantiate Cat
        Cat cat = new Cat("Whiskers", 2, true);
        cat.makeSound();
        cat.run();
        cat.scratch();
        cat.scratch("couch");

        // Instantiate Dolphin
        Dolphin dolphin = new Dolphin("Flipper", 5);
        dolphin.makeSound();
        dolphin.run(); // Dolphins can't run, but this method is overridden to describe that.
        dolphin.swim();
        dolphin.jump();
        dolphin.jump(3);

        // Instantiate Bat
        Bat bat = new Bat("Nightwing", 4, true);
        bat.makeSound();
        bat.run(); // Bats prefer flying, so this gives a different output.
        bat.fly();
        bat.hang();
        bat.hang("cave");

        // Instantiate Parrot
        Parrot parrot = new Parrot("Polly", "Blue");
        parrot.fly();
        parrot.talk();
        parrot.talk("Hello!");

        // Instantiate Snake
        Snake snake = new Snake("Slytherin", true);
        snake.crawl();
        snake.makeSound();

        // Demonstrate abstract class Animal general methods
        dog.eat();
        cat.eat();
        dolphin.eat();
        bat.sleep();
        parrot.layEggs();
        snake.eat();
    }
}

