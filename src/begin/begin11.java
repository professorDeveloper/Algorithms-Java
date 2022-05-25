package begin;

import java.util.Scanner;

public class begin11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-son");
        int a = scanner.nextInt();
        System.out.println("2-son");
        int b = scanner.nextInt();
        int c = a + b;
        int d = a * b;
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        System.out.printf("Yigindi: %d \n", c);
        System.out.printf("Kopaytma %d\n", d);
        System.out.printf("%d ning Module %d\n", a, a1);
        System.out.printf("%d ning Module %d\n", b, b1);

    }
}
