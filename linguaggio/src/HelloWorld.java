import java.util.Arrays;
public class HelloWorld {
    public static void main(String[] args) {
        char[] stringa1 = new char[]{'1', '2', '3', '4'};
        char[] stringa2 = new char[]{'1', '2', '3', '4'};
        char[] stringa3 = new char[]{'1', '2', '3', '5'};
        boolean stringa1string2uguali = Arrays.equals(stringa1, stringa2);
        System.out.println(stringa1string2uguali);
        boolean stringa2string3uguali = Arrays.equals(stringa2, stringa3);
        System.out.println(stringa2string3uguali);
    }
}
