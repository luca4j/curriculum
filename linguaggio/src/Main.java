import java.util.Arrays;

public class Main {
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Fine");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    // 0 1 1 2 3 5 8 ..

    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main() {
        countdown(10);
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
    }
}
