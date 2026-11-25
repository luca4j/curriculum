import java.util.Scanner;

public class Main {
    private static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public boolean isInside(double r) {
            return Math.pow(x, 2) + Math.pow(y, 2) <= r;
        }
    }

    public static void main(String[] args) {
        int m = 0;
        for (int i = 1; i < 1000000; i++) {
            double x = Math.random();
            double y = Math.random();
            Point p = new Point(x, y);
            if (p.isInside(1)) {
                m++;
            }
            double pi = 4 * ((double) m / (double) i);
            System.out.println(pi);
        }
    }
}