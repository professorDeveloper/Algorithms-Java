package ifdirect;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b;
        System.out.print ("a:");
        a = scanner.nextInt ( );
        b = a % 2;
        if ( a > 9 && a <= 99 && b == 0 ) {
            System.out.println ("2 Xonali  Juft");
        } else if ( a > 99 && a <= 999 && b == 0 ) {
            System.out.println ("3 Xonali  Juft");
        } else if ( a > 9 && a <= 99 && b == 1 ) {
            System.out.println ("2 Xonali  Toq");
        } else if ( a > 99 && a <= 999 && b == 1 ) {
            System.out.println ("3 Xonali  Toq");
        } else System.out.println ("chota ne tooo");
    }
}
