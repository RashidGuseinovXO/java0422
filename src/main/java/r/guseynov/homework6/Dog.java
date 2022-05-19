package r.guseynov.homework6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println(this + " Бежит " + length + " метров");
        } else {
            System.out.println(this + " Не может пробежать " + length + " метров");
        }
        }

        @Override
        public void swim ( int length) {
            if (length <= 200) {
                System.out.println(this + " Бежит " + length + " метров");
            } else {
                System.out.println(this + " Может пробежать " + length + " метров");
            }
        }

        @Override
        public String toString () {
            return "Собака по имени " + getName();
        }
    }
