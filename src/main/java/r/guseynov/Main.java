package r.guseynov;

import r.guseynov.homework6.Animal;
import r.guseynov.homework6.Cat;
import r.guseynov.homework6.Dog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Котик"),
                new Dog("Песик"),
                new Cat("Котик2"),
                new Dog("Песик2"),
        };
        System.out.println("Animal.getCount() = " + Animal.getCount());
        final Random random = new Random();
        for (Animal animal : animals) {
            animal.run(random.nextInt(500));
            animal.swim(random.nextInt(50));
            
        }
        }
    }


