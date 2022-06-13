package r.guseynov.homework1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5));
        Team team = new Team("Heroes", new Human("Johny"), new Cat("Murzik"), new Dog("Izzy"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}
