package ifdirect;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c,p=3;
        System.out.print ("1.a=");
        a=scanner.nextInt ();
        System.out.print ("2.b=");
        b=scanner.nextInt ();
        System.out.print ("3.c=");
        c=scanner.nextInt ();
        if ( a==b ){
            System.out.println (p);
        } else if ( c==a) {
            p-=1;
            System.out.println (p);
        } else if (b==c) {
            p-=2;
            System.out.println (p);
        }
    }
}
