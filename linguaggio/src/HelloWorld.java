public class HelloWorld {
    public static void main(String[] args) {
        int secondi = 1234;
        int minuti = secondi / 60;
        int secondiRimanenti = secondi % 60;
        System.out.println(minuti);
        System.out.println(secondiRimanenti); // 34
        System.out.println(minuti * 60 + secondiRimanenti); // 1234
    }
}
