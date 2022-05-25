package booleans;

import java.util.Scanner;

public class Boolean18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c;
        boolean d;
        System.out.print ("a:");//5
        a=scanner.nextInt ();
        System.out.print ("b:");//6
        b=scanner.nextInt ();
        System.out.print ("c:");//5
        c=scanner.nextInt ();
        d= a == c|| b==c || a==b;
        System.out.println (d);
    }
}
