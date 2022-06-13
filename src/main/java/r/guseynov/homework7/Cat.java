package r.guseynov.homework7;

public class Cat {
    private String name;
    private int appetite;
    private Boolean hugry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hugry = true;
    }
    public void info() {
        String isHungry = !hugry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }
    public void eat(Plate p) {
        p.descreaseFood(appetite);
        hugry = false;
    }
}
