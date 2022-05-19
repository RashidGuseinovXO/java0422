package r.guseynov.homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    boolean descreaseFood(int n) {
        int diff = food - n;
        if(diff < 0) return false;
        food -= n;
        return true;
    }
    void addFood(int food){
        this.food += food;
    }
     void info() {
        System.out.println("Plate " + food);
    }
}

