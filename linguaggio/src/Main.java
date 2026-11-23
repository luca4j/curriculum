import java.util.Arrays;

public class Main {
    // fizz buzz divisibile per tre e per cinque
    // fizz divisibile per tre
    // buzz divisibile per cinque
    // il numero altri casi

    private static void fizzbuzz(int n) {
        if (n == 0)
            return;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (n % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (n % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("" + n);
        }
        fizzbuzz(n - 1);
    }

    public static void main(String... args) {
        fizzbuzz(15);
    }
}