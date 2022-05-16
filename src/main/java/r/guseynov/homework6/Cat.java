package r.guseynov.homework6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println(this + getName() + " Бежит " + length + " метров");
            } else {
            System.out.println(this + getName() + " Не может пробежать " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public String toString() {
        return "Кот по имени " + getName();
    }
}
