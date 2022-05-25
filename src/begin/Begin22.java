package begin
        ;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        // uchinchi o'zgaruvchi, (zaxira uchun)
        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
