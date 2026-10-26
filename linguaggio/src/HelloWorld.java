import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        double e = 1e-9; // 0.000000001
        float a = 1.0f;
        double b = 0.1 + 0.2; // 0.3
        System.out.println(a);
        System.out.println(b);
        boolean sonoUguali = (0.1 + 0.2) == 0.3; // false
        boolean differenzaPiccola = Math.abs((0.1 + 0.2) - 0.3) < e; // true
        if(sonoUguali || differenzaPiccola) { // true
            System.out.println("Sono uguali");
        }
        else {
            System.out.println("Non sono uguali");
        }
    }
}
