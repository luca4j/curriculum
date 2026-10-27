import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int num = 0;
        String stringa = "1234";
        for(int i = stringa.length() - 1, j = 0; i >= 0; i--, j++) {
            int digit = Character.getNumericValue(stringa.charAt(i));
            num = num + digit * (int) Math.pow(10, j);
        }
        System.out.println(num);
    }
}
