public class HelloWorld {
    public static void main(String[] args) {
        double e = 1e-9; // 0.000000001
        float a = 1.0f;
        double b = 0.1 + 0.2; // 0.3
        System.out.println(a);
        System.out.println(b);
        System.out.println((0.1 + 0.2) == 0.3);
        System.out.println(Math.abs((0.1 + 0.2) - 0.3) < e);
    }
}
