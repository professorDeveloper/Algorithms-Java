package ifdirect;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c;
        System.out.print ("a=");
        a=scanner.nextInt ();
        System.out.print ("b=");
        b=scanner.nextInt ();
        System.out.print ("c=");
        c=scanner.nextInt ();
        if ( (a-b<0 && b-c<0) || (a-b>0 && b-c>0 )){
            a+=2;
            b+=2;
            c+=2;
            System.out.println (a);
            System.out.println (b);
            System.out.println (c);
        }else {
            System.out.println ((a - a - a));
            System.out.println ((b - b - b));
            System.out.println ((c - c - c));
        }
    }
}
