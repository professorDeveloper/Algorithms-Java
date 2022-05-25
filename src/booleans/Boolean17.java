package booleans;

public class Boolean17 {
    public static void main(String[] args) {
        int a = -123;
        boolean aIsMusbat = a >= 0;
        boolean aUchXonali = a > 99 && a < 1000;
        boolean aIsOdd = a % 2 == 1;

        boolean result = aIsMusbat && aUchXonali && aIsOdd;

        System.out.println("Berilgan son 3 xonali musbat toq son: ");
        System.out.println(result);
    }
}
