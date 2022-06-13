package r.guseynov.homework6;

public abstract class Animal {
    public static int count;

    public Animal(String name) {
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public abstract void run(int length);

    public abstract void swim(int length);

    public static int getCount() {
        return count;
    }
}

