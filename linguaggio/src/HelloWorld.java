import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        char[] stringa1 = new char[] {'1', '2', '3', '4'};
        char[] stringa2 = new char[] {'1', '2', '3', '5'};
        boolean sonoUguali = true;
        for(int i = 0; i < stringa1.length; i++) {
            char a = stringa1[i];
            char b = stringa2[i];
            sonoUguali = sonoUguali && a == b;
        }
        System.out.println(sonoUguali);
    }
}
