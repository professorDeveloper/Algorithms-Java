package begin;

import java.util.Scanner;

public class begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1-son");
        int a = scanner.nextInt();
        System.out.println("2-son");
        int b = scanner.nextInt();
        int c = a + b;
        int d = a * b;
        int a1 = a * a;
        int b1 = b * b;
        System.out.printf("Yigindi: %d \n", c);
        System.out.printf("Kopaytma %d\n", d);
        System.out.printf("%d ning Kvadrati %d\n", a, a1);
        System.out.printf("%d ning Kvadrati %d\n", b, b1);
    }
}
