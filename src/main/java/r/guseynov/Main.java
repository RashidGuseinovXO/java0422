package r.guseynov;

import r.guseynov.homework7.Cat;
import r.guseynov.homework7.Plate;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Мурзик 1", 20), new Cat("Мурзик 2", 50), new Cat("Мурзик 3", 29), new Cat("Мурзик 4", 70), new Cat("Мурзик 5", 34)};
        Plate plate = new Plate(80);
        for(Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}


