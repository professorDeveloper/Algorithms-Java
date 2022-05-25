package booleans;

import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c;
        boolean d;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        System.out.print ("B:" ); //Asd
        b=scanner.nextInt ();
        System.out.print ("C:" ); //Asd
        c=scanner.nextInt ();

        d=a<b && b<c;
        System.out.println (d);
    }
}
