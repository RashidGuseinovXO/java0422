package r.guseynov.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
      // Task 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
     // Task 3
    public static void checkSumSign() {
        int a = 7, b = 8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
     // Task 4
    public static void printColor() {
        int value = 11;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 0) {
            System.out.println("Желтый");
        } else if (value >= 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 11;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
            
        }

    }
}

