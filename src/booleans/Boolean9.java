package booleans;

import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b;
        boolean c;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        System.out.print ("B:" ); //Asd
        b=scanner.nextInt ();
        c=a%2==1 || b%2==1;

        System.out.println (c);
    }
}
