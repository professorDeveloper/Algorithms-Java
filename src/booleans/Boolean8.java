package booleans;

import java.util.Scanner;

public class Boolean8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b;
        boolean c;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        System.out.print ("B:" ); //Asd
        b=scanner.nextInt ();
        c=a%2!=0 && b%2!=0;

        System.out.println (c);
    }
}
