package somepackage;

public class Main {
    public static void main(String[] args) {
        Some some = new Some("Тестовый");
        System.out.printf(some.getSecret());
        some.noMoreSecrets = "Тест";
        System.out.printf(some.noMoreSecrets );
    }
}