package booleans;

import java.util.Scanner;

public class Boolean14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c;
        boolean d;
        System.out.print ("a:");
        a=scanner.nextInt ();
        System.out.print ("b:");
        b=scanner.nextInt ();
        System.out.print ("c:");
        c=scanner.nextInt ();
        d=a>=0 && b>=0 && c>=0;
        System.out.println (d);
    }
}
