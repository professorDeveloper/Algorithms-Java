package ifdirect;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c;
        System.out.print ("a=");
        a=scanner.nextInt ();
        System.out.print ("b=");
        b=scanner.nextInt ();
        System.out.print ("c=");
        c=scanner.nextInt ();
        if ( a<b && b<c ){
            System.out.println ("ortada yotgan son b="+b);
        } else if ( b<a && a<c) {
            System.out.println ("ortada yotgan son a="+a);
        }else System.out.println ("ortada yotgan son c="+c);
    }
}
