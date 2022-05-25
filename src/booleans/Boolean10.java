package booleans;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c,d;
        boolean x;
        System.out.print ("A:" ); //4
        a=scanner.nextInt ();
        System.out.print ("B:" ); //7
        b=scanner.nextInt ();
        c=a%2;//0
        d=b%2;//1
        x=d+c==1;
        System.out.println (x);
    }
}
