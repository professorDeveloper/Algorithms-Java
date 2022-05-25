package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c ;
        boolean d ;

        System.out.print ("a:");//20
        a=scanner.nextInt ();
        System.out.print ("b:");//22
        b=scanner.nextInt ();
        System.out.print ("c:");//-20
        c=scanner.nextInt ();
        d=a+b==0||b+c==0||a+c==0;
        System.out.println (d);
    }
}
