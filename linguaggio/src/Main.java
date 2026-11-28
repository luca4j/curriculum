import java.util.Scanner;

public class Main {
    enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static void main(String[] args) throws Exception {
        new ProcessBuilder("stty", "-icanon", "-echo").inheritIO().start().waitFor();

        int key;
        int x = 2;
        int y = 2;
        int size = 5;

        do {
            System.out.println("\033[H\033[2J"); // clear
            System.out.println("Muovi con le frecce, q per uscire");

            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    if(y == i && x == j) {
                        System.out.print("@ ");
                    }
                    else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }

            key = System.in.read();

            Direction direction = switch (key) {
                case 'A' -> Direction.DOWN;
                case 'B' -> Direction.UP;
                case 'C' -> Direction.RIGHT;
                case 'D' -> Direction.LEFT;
                default -> null;
            };

            if(direction != null) {
                switch(direction) {
                    case UP -> y++;
                    case DOWN -> y--;
                    case LEFT -> x--;
                    case RIGHT -> x++;
                }
                x = Math.floorMod(x, size);
                y = Math.floorMod(y, size);
            }
        } while('q' != key);

        new ProcessBuilder("stty", "sane").inheritIO().start().waitFor();
    }
}