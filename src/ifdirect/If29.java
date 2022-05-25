package ifdirect;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b;
        System.out.print ("a:");
        a = scanner.nextInt ( );
        b = a % 2;
        System.out.println (b);
        if ( a > 0 && b == 1 ) {
            System.out.println ("a = musbat toq son ");
        } else if ( a > 0 && b == 0 ) {
            System.out.println ("a = Musbat juft son ");
        } else if ( a < 0 && b == 0 ) {
            System.out.println ("a = Manfiy juft son ");
        } else if ( a < 0 && b == -1 ) {
            System.out.println ("a = manfiy toq son ");
        } else {
            System.out.println ("nolga teng");
        }
    }
}
