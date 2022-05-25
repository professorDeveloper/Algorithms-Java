package booleans;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c,d;//
        boolean y ;
        System.out.print ("a:");
        a=scanner.nextInt ();
        b=a/100;   //1
        c=a/10%10; //2
        d=a%10;    //3
        y=b!=c && c!=d && b!=d && a>99 && a<1000;

        System.out.println (y);
    }
}
