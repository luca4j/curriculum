import java.util.Arrays;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. FizzBuzz");
            System.out.println("2. Esci");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter a number: ");
                    int n = scanner.nextInt();
                    fizzbuzz(n);
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
            }
        } while(choice != 2);
        scanner.close();
    }
}