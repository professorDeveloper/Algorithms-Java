package ifdirect;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a,b=0;
        System.out.println ("1.a:");
        a = scanner.nextInt ( );
        if ( a==0 ){
            System.out.print ("a==0 "+b);
        } else if (a>0||a<0) {
            b++;
            System.out.print ("a>0 yoki a<0 "+b);
            b++;
            System.out.println(" va "+b);
        }else {
            b+=3;
            System.out.println (b);
        }
    }
}
