package r.guseynov.homework2;

public class homework2 {
    public static void main(String[] args) {
        within10and20(11, 6);
        System.out.println(within10and20(11, 6));
        isPositiveOrNegative(-4);
        isNegative(7);
        System.out.println(isNegative(7));
        printWordNTimes("mercedes", 7);
    }

    // task 1
    public static boolean within10and20(int x1, int x2) {
        boolean a;
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

    // task 2
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
        }
        System.out.println("Число отрицательное");
    }

    // task 3
    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    // task 4
    public static void printWordNTimes(String word, int times) {
        int i;
        for (i = 7; i <= times; i++) {
            System.out.println(word);
        }
    }
}